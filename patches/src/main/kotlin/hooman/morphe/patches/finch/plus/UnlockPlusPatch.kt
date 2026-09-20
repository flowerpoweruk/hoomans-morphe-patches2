package hooman.morphe.patches.finch.plus

import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.PatchException
import app.morphe.patcher.patch.rawResourcePatch

// Updated for Finch 3.73.208 (arm64).
// Same strategy as the 3.73.179 version:
// - Force isUserSubscribed() to always return true
// - Force getUserSubscriptionState() to return the "yearly" object
// Both overwrites are length-preserving and only use instructions already present in the functions.
@Suppress("unused")
val unlockPlusPatch = rawResourcePatch(
    name = "Unlock Plus",
    description = "Unlocks Finch Plus features without a subscription, including the Plus shop items, " +
        "extra themes and customization, seasonal event tiers, the monthly recap, and Plus insights. " +
        "It also clears the upgrade prompts. This is the arm64 build. Cloud backup and cross-device " +
        "sync run on Finch's own servers and still need the real subscription. " +
        "Re-signing breaks Google sign-in, so log in with email instead.",
) {
    compatibleWith(
        Compatibility(
            name = "Finch",
            packageName = "com.finch.finch",
            appIconColor = 0xBFC2D0,
            targets = listOf(AppTarget("3.73.208")),
        ),
    )

    execute {
        val libPath = "lib/arm64-v8a/libapp.so"
        val lib = get(libPath)
        if (!lib.exists()) {
            throw PatchException(
                "$libPath not found in the APK. This targets the arm64 Finch 3.73.208 build.",
            )
        }

        val bytes = lib.readBytes()

        // isUserSubscribed() @ 0x1345F90
        val isUserSubscribedSig = intArrayOf(
            0xfd, 0x79, 0xbf, 0xa9, // stp  x29, x30, [x15, #-0x10]!
            0xfd, 0x03, 0x0f, 0xaa, // mov  x29, x15
            0xef, 0x81, 0x00, 0xd1, // sub  x15, x15, #0x20
            0x50, 0x27, 0x40, 0xf9, // ldr  x16, [x26, #0x4e]
            0xff, 0x01, 0x10, 0xeb, // cmp  x15, x16
            0x29, 0x0a, 0x00, 0x54, // b.ls ...
            0x40, 0x3f, 0x40, 0xf9, // ldr  x0, [x26, #0x78]
            0x00, 0x14, 0x5a, 0xf9, // ldr  x0, [x0, #0x3428]
            0x50, 0x4b, 0x40, 0xf9, // ldr  x16, [x26, #0x96]
            0x1f, 0x00, 0x10, 0x6b, // cmp  w0, w16
            0x61, 0x00, 0x00, 0x54, // b.ne ...
            0x62, 0xab, 0x7f, 0xf9, // ldr  x2, [x27, #0xff5]
            0x06, 0x1a, 0x5a, 0x94, // bl   ...
            0x70, 0x27, 0x40, 0x91, // add  x16, x27, #9, lsl #12
            0x10, 0x7e, 0x44, 0xf9, // ldr  x16, [x16, #0x8f8]
        ).map { it.toByte() }.toByteArray()

        // Overwrite AllocStack (#0x20) with constant-true return
        val isUserSubscribedOverwriteAt = 8
        val isUserSubscribedOverwrite = intArrayOf(
            0xc0, 0x82, 0x00, 0x91, // add  x0, x22, #0x20   ; true
            0xef, 0x03, 0x1d, 0xaa, // mov  x15, x29
            0xfd, 0x79, 0xc1, 0xa8, // ldp  x29, x30, [x15], #0x10
            0xc0, 0x03, 0x5f, 0xd6, // ret
        ).map { it.toByte() }.toByteArray()

        // getUserSubscriptionState() @ 0x1345EE8
        val getStateSig = intArrayOf(
            0xfd, 0x79, 0xbf, 0xa9, // stp  x29, x30, [x15, #-0x10]!
            0xfd, 0x03, 0x0f, 0xaa, // mov  x29, x15
            0xef, 0x61, 0x00, 0xd1, // sub  x15, x15, #0x18
            0x50, 0x27, 0x40, 0xf9, // ldr  x16, [x26, #0x4e]
            0xff, 0x01, 0x10, 0xeb, // cmp  x15, x16
            0x69, 0x04, 0x00, 0x54, // b.ls ...
            0x91, 0xf6, 0xfa, 0x97, // bl   getAccountId (relative)
            0x01, 0xf0, 0x5f, 0xf8, // ldur x1, [x0, #-1]
            0x21, 0x7c, 0x4c, 0xd3, // ubfx x1, x1, #0xc, #0x14
            0x70, 0x9f, 0x41, 0x91, // add  x16, x27, #0x67, lsl #12
            0x10, 0xca, 0x47, 0xf9, // ldr  x16, [x16, #0xf90]
        ).map { it.toByte() }.toByteArray()

        // Overwrite AllocStack (#0x18) with constant-"yearly" return
        // (uses the exact pool load the function already emits on its own yearly path)
        val getStateOverwriteAt = 8
        val getStateOverwrite = intArrayOf(
            0x60, 0x9f, 0x41, 0x91, // add  x0, x27, #0x67, lsl #12
            0x00, 0xcc, 0x47, 0xf9, // ldr  x0, [x0, #0xf98]   ; "yearly"
            0xef, 0x03, 0x1d, 0xaa, // mov  x15, x29
            0xfd, 0x79, 0xc1, 0xa8, // ldp  x29, x30, [x15], #0x10
            0xc0, 0x03, 0x5f, 0xd6, // ret
        ).map { it.toByte() }.toByteArray()

        listOf(
            Triple("isUserSubscribed", isUserSubscribedSig, isUserSubscribedOverwrite to isUserSubscribedOverwriteAt),
            Triple("getUserSubscriptionState", getStateSig, getStateOverwrite to getStateOverwriteAt),
        ).forEach { (label, signature, overwriteSpec) ->
            val (overwrite, overwriteAt) = overwriteSpec
            val match = bytes.findUnique(signature)
                ?: throw PatchException(
                    "Finch Plus signature ($label) not found in $libPath. " +
                    "This patch targets Finch 3.73.208 (arm64).",
                )
            overwrite.forEachIndexed { i, b -> bytes[match + overwriteAt + i] = b }
        }

        lib.writeBytes(bytes)
    }
}

private fun ByteArray.findUnique(pattern: ByteArray): Int? {
    var found: Int? = null
    val last = size - pattern.size
    outer@ for (i in 0..last) {
        for (j in pattern.indices) {
            if (this[i + j] != pattern[j]) continue@outer
        }
        if (found != null) {
            throw PatchException("Finch Plus signature is ambiguous (matched more than once).")
        }
        found = i
    }
    return found
}
