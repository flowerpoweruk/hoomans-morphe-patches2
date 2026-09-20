## 1.0.0 (2026-09-20)

### 🐛 Bug Fixes

* actually unlock BlockerHero premium (force cached isPremium state) ([887e35e](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/887e35e0c37bce6a45a3d04ecdc7be70aeaa2edd))
* **BlockerHero:** bypass the Google login gate so premium features are usable ([16c0c16](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/16c0c166ba31f158bb2dd1b1fdfbb33324ea212d))
* **BlockerHero:** suppress the spurious "Unauthenticated." toast on premium sync ([b8e3a68](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/b8e3a684d45d8841f0aecdcdb3dc2924b2b9c7b3))
* **ci:** add PATCHES_START/END markers so the release readme generator can inject the patch list ([0ab28a6](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/0ab28a631dd506c7a26631b1966d03624174a11a))
* **ci:** mark gradlew executable so the release workflow can run it ([a05198e](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a05198e8b66ae46f4c1ddb71a9a27b589b3ec5ca))
* clarify Block live ads scope (prerolls can slip through) ([683b12e](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/683b12ed8bbd6cd6238532b2286e5e27fe0357b3))
* clarify Twitch 7TV and BTTV patch details ([9e0eac9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/9e0eac95793056d35174956ae44d13aecca2073f))
* **Cronometer:** clarify the libapp.so-not-found guard message ([609b6de](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/609b6de01cf3d1264cbf3becc569630093a89581))
* **Cronometer:** gate Unlock Gold behind experimental toggle ([194aa97](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/194aa974e67067b220fc0c8aa49e4b4417e4cf9a))
* **Cronometer:** mark Unlock Gold 4.56.0 as stable ([e49164e](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/e49164e216516120648fb10d038a16abf0c6df2d))
* **Cronometer:** temporarily remove 4.57.4 support until it is fixed ([59b4dd0](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/59b4dd01d26ed0a0f088490b553ba403093dcd1c))
* decouple Acrobat Pro unlock from the sign-in spoof to stop the Play Billing reconcile loop ([2e56eb0](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/2e56eb0f922f13d29ecbde5870f5db3382b82907))
* drop server-inserted sponsored timeline cards in Tumblr Remove ads ([59daecc](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/59daeccbc2bc9979b2486e95829008b0d3902714))
* handle install residue during release back-merge ([e5182af](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/e5182afb976671c62876c180790137a7382d2be2))
* harden release back-merge against generated metadata ([b57dfcc](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/b57dfcc20baca6c4fd9c8b27d6d30830b582c811))
* hide DirectChat message-bubble ad in Unlock Premium ([633433c](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/633433c07ea1441b18f1acf8a80b03e40fdc8647))
* neutralize InShot video engine kill on arm64 ([a8239a9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a8239a9aa4ef836730cb475f769940a11811e809))
* neutralize Poweramp settings export/import crash on re-sign ([abc230e](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/abc230e3d9ecc01eb3b464bdbb40fb4c5676352a))
* note that patching SofaScore breaks login in Remove Ads ([81fabdd](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/81fabdd19dae9167dbda7f53c3cc68894bae6dc7))
* patch Photo Editor Polish libitcore tamper check on all ABIs ([152384f](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/152384fba2d67743c6998c5cf3cdc4216c406ee2)), closes [#42](https://github.com/flowerpoweruk/hoomans-morphe-patches2/issues/42)
* remove Flightradar24 patches (blank Google Maps base map on re-sign) ([3f2e772](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/3f2e772b24e741657d8798a37f430b5876d70678))
* remove LingQ Unlock Premium patch ([3c81a1f](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/3c81a1f6dde5956c8f357a79f046fd4091dbb09c))
* remove Photo Editor Polish patch ([4bf2b32](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/4bf2b32c5b67aad29a0c6e09af3623433acdcdc9))
* remove Projectivy Launcher Unlock Premium patch (DMCA takedown request) ([e151176](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/e151176b337568dcbb30919b68331f01d9d11f80))
* resolve reported app regressions ([6e0883d](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/6e0883d919bc9d1ab10b0b69e872323464b42de4))
* resolve reported patch regressions ([bc766bb](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/bc766bb17a901cac1aa05971ed8d1d55d649173b))
* resolve reported patch regressions ([33dc9c5](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/33dc9c569e0a0fe9bdf88184f90560e23b7d2b5b))
* resolve Symfonium playback and Poweramp settings crashes ([39ff689](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/39ff6899bb230750ce6a1512eaed0ef2ec9b9a14))
* resolve Symfonium playback and Poweramp settings crashes ([30d0071](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/30d007194149c370ca1324e0c2021a4b5f05bbdf))
* return fixed SNTP time for Symfonium beta cutoff ([773be62](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/773be62ac38e733f50474b7d3a2fbadb7cd41bd0))
* stabilize InShot and PhotoPolish anti-tamper ([b639a9d](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/b639a9d90c109ee9b92ad108134ae01b798ac591))
* stop blazed sponsored posts slipping past Tumblr Remove ads ([097fa84](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/097fa84ab918b8faa2b66993bd8f6a66e18dd2d7))
* stop Car Launcher's re-sign check from turning icons into skulls ([4d9c097](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/4d9c09795b3b9d5a11dc1ce3083968ab7ff3bded))
* stop Poweramp 0-byte settings export and Symfonium post-cutoff SNTP ([e1cca51](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/e1cca51b171f7878b8e714a20b437cf7f9188cb2))
* stop the Twitch 7TV/BTTV emotes patch from breaking chat ([bae9e2a](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/bae9e2af4d0340184841dd527b2e425a8c356463))
* support Battery Guru 2.5.0.2 beta ([d4319d9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/d4319d9d071a0c20d4334ce654ba0fa057595001))
* **tumblr:** guard ad filtering against null items ([41abcaf](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/41abcafa6f86e03547817f6479e089e6dd8ad6b1))
* **twitch:** repair ads and deleted messages ([7db6045](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/7db604596da5f1d47123b1e60705b95b492ffda0))
* unblock Cronometer 4.57.4 launch by bypassing the PairIP license check ([7015c63](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/7015c637699e698f8a15cd580f2fcff86a908e32))
* unlock Quizlet Learn/Test meters and Tracked free-tier StrictEq sites ([419b157](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/419b157fae5e372be1f8b44970211c235099c686))
* unlock Quizlet mid-quiz Plus gates ([9de77be](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/9de77be7b1bcd962379251b8f14836075836eefa))
* unlock Tracked customize-dashboard pro gate ([001f82d](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/001f82d6d1cd881ccdc86edd13e206fe36dd564a))

### ✨ New Features

* add ADM remove ads patch ([7cacfbd](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/7cacfbdfe46519acaa57bd8dc8d82a764d96c8c0))
* add Adobe Acrobat Unlock Pro patch ([885dc84](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/885dc8469e606e42e62bda57cb17f1a059310603))
* add Alpha Progression Unlock Premium patch ([2b64654](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/2b646541ad440c1be5f468c9d159c0398c4dff19))
* add AT4K Launcher Unlock Premium patch ([b0d67b7](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/b0d67b77bea33edfcd286e6e4df1376342236ec9))
* add AutoZen unlock premium and disable analytics patches ([9c205ae](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/9c205aeab18422797bda388f75b86aba71b20040))
* add BandLab Unlock Membership patch ([0c1bbfa](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/0c1bbfa8f5704b50c527ed7abd2c1353193d9292))
* add Battery Guru Unlock PRO patch ([5e4ea98](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/5e4ea98a68084b2afded1422dee1eb89884582d2))
* add BlockerHero Enable Premium patch ([bf75126](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/bf751268a545fe092b7e97b05c857bc5b2b89d92))
* add Car Launcher Unlock Full Version patch ([82bab2b](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/82bab2bd352e4d9c867c28efcfa1387c9a0d66f5))
* add Cashew Unlock Pro patch ([b9c2399](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/b9c23994f38d289c2029d65d52abdd4b313af166))
* add ChatBoost unlock premium ([c2ec262](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/c2ec2628f82070488c753066b04943f4038e8b8b))
* add Collectr Unlock Premium patch ([a36f34d](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a36f34d58d232a487f4d19f0407f69751b483b44))
* add Cronometer Unlock Gold patch ([9fdf0d6](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/9fdf0d60f6e1033ffce897b4434009717f3c6973))
* add DirectChat unlock premium patch ([250dfa9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/250dfa9c2adad728c6dd64777b628a4527b8fe19))
* add Essence Unlock Pro patch ([f0ea7c4](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/f0ea7c4a39980ff249de43171a763b30cee60fae))
* add Finch Unlock Plus patch ([0455304](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/0455304ac0cc972d70dec23eb40d32a4a47d98a7))
* add Flightradar24 patches (ads, aircraft data, own Maps key) ([8604ff6](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/8604ff691feb74447c2974f4e76a5f3b7e47d0ae))
* add Flightradar24 Remove ads patch ([e08141c](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/e08141c81b0fb08fc9fb8a094612517193036ae4))
* add Flightradar24 Unlock aircraft data patch ([dd44cd3](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/dd44cd31aad70fdc03a3ad7a2077f1fbdb0bcaa4))
* add FolderSync Unlock Premium patch ([f9a2539](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/f9a2539431cf981172b8d147cfbbdcf568b3dab7))
* add Google Phone call recording patch ([8f33282](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/8f332821bd3f3239b10fac6bce04908aa64349e1))
* add Hevy unlock pro ([89c9be3](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/89c9be3ebe3832aafb3b82b512341851dfe590cc))
* add I Am Sober Unlock Sober Plus patch ([8b5ef3a](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/8b5ef3a2cef4a973eed0cf36390e40644a8edf69))
* add InShot Unlock Pro patch ([cdb9ebd](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/cdb9ebdbb84db1d3ab4d0d3b1b55b4a513b31da3))
* add LingQ Unlock Premium patch ([2786c21](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/2786c211e9c5a17b6a45f239e27d40f3ac314833))
* add Mixel Unlock Premium patch ([910fc95](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/910fc95c9f1525245e2b9363b1f2faa3ada455e5))
* add Moneta Unlock Plus patch ([b163904](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/b163904079b805eedb20ee88d37dabd72a25906d))
* add Money Manager Unlock Premium patch ([7a9995f](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/7a9995f91dabad72d7be7c8b40b79fb8d840a391))
* add Moovit Remove ads, Unlock Moovit+, and Maps key patches ([7ea574d](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/7ea574ddd8030ae7a24c3373029b9d118de35ef2))
* add Photo Editor Polish Unlock Pro patch ([f977c0a](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/f977c0a01e7827c69dc2cbc28ded5e2bdd080ab4))
* add Poweramp unlock premium ([0a1ffec](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/0a1ffec15baaac71dfecb42f7618f8b3d04ae93e))
* add Replaio Unlock Premium patch ([3ec16d8](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/3ec16d8f5757ba755c3081cf5ec1cd99736e5480))
* add Rumble Unlock Premium patch ([8464dbc](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/8464dbc75b701374dce44f1fc65ddc29a8e85700))
* add Smart AudioBook Player full unlock ([5722c61](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/5722c61ac7dbf8e976cbfdbfd3837fc29a78a8d5))
* add SofaScore remove ads patch ([a6e8c25](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a6e8c2533f51ce6aea596d617c8de3e4e65a8d1c))
* add Stash Unlock Pro patch ([a78b856](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a78b8565155ad633355c4f1cfef6de920216859b))
* add SwiftKey privacy patches ([f479b6c](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/f479b6caac1647f3c0830cf6fa9b06652f133627))
* add Symfonium unlock premium ([e00c284](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/e00c284ecdd2c09162b3ea2a3358a281e59422ba))
* add Todoist No date first patch ([3ea21cc](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/3ea21cc2c5e8e783ef2d3727859b5c468087b60d))
* add Todoist unlock pro ([090eb9b](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/090eb9ba6e98e9147876c37f2c6c9494f09dc7bc))
* add Tracked Unlock Pro patch ([29da9e9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/29da9e9f9044c4943e78a5747e5a59d5a0e09bb8))
* add Tumblr annoyance toggles ([40ebe71](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/40ebe71a7ba92691dd0ccd3f3a928a1f656103da))
* add Tumblr disable screenshot sharing patch ([5d9f0ee](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/5d9f0ee0b95a4d5f5870da438e2c149f005767c4))
* add Tumblr Remove ads and Enable premium UI patches ([4ce95d9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/4ce95d95a76834a374711f1602eda115e5d33d80))
* add Twitch 7TV and BTTV emotes patch ([71d9d79](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/71d9d7935a0270a2d39965866fe4e958c703cc51))
* add Twitch ad-removal patches ([a9610e8](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a9610e818099fc7ac98c460796e740de4cc36fc8))
* add Twitch show deleted messages and auto-claim channel points ([f823c02](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/f823c0225ed84447e64e9f8a032a3f620f5aa60a))
* add Video Converter Unlock Pro patch ([08ec0de](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/08ec0deaadc72895a629cb4267f4cc5950e7f2a9))
* add Wanderlog Unlock Pro patch ([07070bf](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/07070bf3b35d2cb4c190abd8f57ab6ebbcb93a87))
* add WEBTOON Remove ads patch ([1d44343](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/1d44343e3c941e27f2973596ca76c57d03bbe9e7))
* bundle the PairIP license-check bypass into the unlock patches ([d4c5dc4](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/d4c5dc4b247bfb52a2d6aa52311f69bfdb526b24))
* fix Twitch login on patched builds ([8cb8d07](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/8cb8d0745c42d0eba962f980bdf6a4bb9dac8349))
* **Liquid Gallery:** add Unlock Pro and Disable License Check ([d8126d0](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/d8126d0e235d191882fbba1beeadfd3d89c33b09))
* **Quizlet:** add Unlock Plus ([9b6e945](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/9b6e945aef4b65cce07ed2fd6a32d0c3a9529276))
* skip the upgrade-to-Moovit+ popups in Unlock Moovit+ ([a262a96](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/a262a968d7d7f0a3286e1119f0bb7d57f6f7a1cf))
* support Adobe Acrobat 26.7.1.47181 ([19e194c](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/19e194cbc58d63a304313ce2f49dbac105bd47f5))
* support Alpha Progression 7.0 Unlock Premium ([5662e55](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/5662e555a5a21ec335aa719e863818d2afaa7618))
* support Battery Guru 2.5.0.6 ([35e1a70](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/35e1a7055ff480392dafe46b2ad73018cf0d27eb))
* support Cashew 6.6.11 ([c2111b1](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/c2111b1bfb075d34146434bbf539de019fecf8b1))
* support Collectr 2.5.6 ([54fb4cd](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/54fb4cd457167da38252f3b5f4d5644db799ffed))
* support Cronometer 4.57.2 ([01dc860](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/01dc8601210d8a67ce62e7f9780edbbb98cdbecb))
* support Cronometer 4.57.4 ([9a0d35a](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/9a0d35a44a15535577dc6a95f7c8071793b0f8b7))
* support FolderSync 4.12.0 ([c9a41e6](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/c9a41e62a5924dcf6847b8a34ee788a44ed1ed6b))
* support Tumblr 45.8.0.110 ([10b0462](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/10b0462f0f59d6e36eae25abcd21711d747481c3))
* support Twitch 30.7.2 ([cfb76f9](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/cfb76f9679aca4de7c2e83cc1c07c46fc1b6971a))
* **TeachMeAnatomy:** add Unlock Premium and Disable License Check patches ([049823c](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/049823c2e1abe6d826ee8c3792430aaa6d976b15))
* **twitch:** restore push notifications ([0c11967](https://github.com/flowerpoweruk/hoomans-morphe-patches2/commit/0c11967f4b1a92a3a655d2f0a687193607b383f7))

## [1.52.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.51.1...v1.52.0) (2026-09-20)

### 🐛 Bug Fixes

* **tumblr:** guard ad filtering against null items ([41abcaf](https://github.com/arandomhooman/hoomans-morphe-patches/commit/41abcafa6f86e03547817f6479e089e6dd8ad6b1))
* **twitch:** repair ads and deleted messages ([7db6045](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7db604596da5f1d47123b1e60705b95b492ffda0))

### ✨ New Features

* **twitch:** restore push notifications ([0c11967](https://github.com/arandomhooman/hoomans-morphe-patches/commit/0c11967f4b1a92a3a655d2f0a687193607b383f7))

## [1.51.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.51.0...v1.51.1) (2026-08-25)

### 🐛 Bug Fixes

* remove Projectivy Launcher Unlock Premium patch (DMCA takedown request) ([e151176](https://github.com/arandomhooman/hoomans-morphe-patches/commit/e151176b337568dcbb30919b68331f01d9d11f80))

## [1.51.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.50.3...v1.51.0) (2026-08-25)

### ✨ New Features

* add Todoist No date first patch ([e78242a](https://github.com/arandomhooman/hoomans-morphe-patches/commit/e78242ac03618423d1c261848defc6a4382fcdb3))

## [1.50.3](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.50.2...v1.50.3) (2026-08-19)

### 🐛 Bug Fixes

* drop server-inserted sponsored timeline cards in Tumblr Remove ads ([9e872d0](https://github.com/arandomhooman/hoomans-morphe-patches/commit/9e872d037671e4edb3580c6eb5714ac7de2f169e))

## [1.50.2](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.50.1...v1.50.2) (2026-08-18)

### 🐛 Bug Fixes

* clarify Twitch 7TV and BTTV patch details ([702146d](https://github.com/arandomhooman/hoomans-morphe-patches/commit/702146df60fa1ffc9c8b76ef52ba50510252c625))

## [1.50.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.50.0...v1.50.1) (2026-08-18)

### 🐛 Bug Fixes

* stop the Twitch 7TV/BTTV emotes patch from breaking chat ([57d24ee](https://github.com/arandomhooman/hoomans-morphe-patches/commit/57d24ee1cec93c34622613d0cf749ba6311767f2))

## [1.50.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.49.1...v1.50.0) (2026-08-18)

### ✨ New Features

* support Adobe Acrobat 26.7.1.47181 ([ca40497](https://github.com/arandomhooman/hoomans-morphe-patches/commit/ca404977baf342a1d73b2a93975471a1104899cd))
* support Cashew 6.6.11 ([8e7cc11](https://github.com/arandomhooman/hoomans-morphe-patches/commit/8e7cc113dcc8ba7009f89c195859214c1d999bec))
* support Collectr 2.5.6 ([1f54080](https://github.com/arandomhooman/hoomans-morphe-patches/commit/1f54080d4a8db9b1f9a954424703f8b105f21672))
* support Cronometer 4.57.2 ([bbf8199](https://github.com/arandomhooman/hoomans-morphe-patches/commit/bbf81998808855ac92ed979c80ca5cb249f0a050))
* support FolderSync 4.12.0 ([1d08212](https://github.com/arandomhooman/hoomans-morphe-patches/commit/1d08212f96c64d1569eafee1a8e3284f48318d3d))

## [1.49.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.49.0...v1.49.1) (2026-08-17)

### 🐛 Bug Fixes

* **Cronometer:** temporarily remove 4.57.4 support until it is fixed ([5bf005b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5bf005baf30cf6006667057ccd40cbac54fcd95a))

## [1.49.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.48.1...v1.49.0) (2026-08-17)

### ✨ New Features

* add AutoZen unlock premium and disable analytics patches ([869b233](https://github.com/arandomhooman/hoomans-morphe-patches/commit/869b233115bc18bf4efdcb35970609749beff24d))
* add Google Phone call recording patch ([b6fbfa9](https://github.com/arandomhooman/hoomans-morphe-patches/commit/b6fbfa95065e5de593724770ab6b3bf237a91042))

## [1.48.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.48.0...v1.48.1) (2026-08-17)

### 🐛 Bug Fixes

* unblock Cronometer 4.57.4 launch by bypassing the PairIP license check ([21a89d7](https://github.com/arandomhooman/hoomans-morphe-patches/commit/21a89d7ba6ff7e8fbe040291c12cde809fdb187e))

## [1.48.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.47.0...v1.48.0) (2026-08-16)

### ✨ New Features

* fix Twitch login on patched builds ([fb7d9be](https://github.com/arandomhooman/hoomans-morphe-patches/commit/fb7d9be321401a8d4c791a9331416dd6dee567f0))

## [1.47.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.46.0...v1.47.0) (2026-08-16)

### ✨ New Features

* add Tumblr disable screenshot sharing patch ([dc6e7ac](https://github.com/arandomhooman/hoomans-morphe-patches/commit/dc6e7ac784d1dc192f3e04cdd88b97749923f0b0))
* add Twitch 7TV and BTTV emotes patch ([1a96a9a](https://github.com/arandomhooman/hoomans-morphe-patches/commit/1a96a9add7efa33c9b90a99f6f649c4ad1c74ba0))
* support Battery Guru 2.5.0.6 ([8d2ae64](https://github.com/arandomhooman/hoomans-morphe-patches/commit/8d2ae64ea40fc0d9f55ee28a197ddf5db9dce852))
* support Cronometer 4.57.4 ([4545850](https://github.com/arandomhooman/hoomans-morphe-patches/commit/45458501ba5b91200267d2fcdcba991241f1ed7e))
* support Tumblr 45.8.0.110 ([0db2412](https://github.com/arandomhooman/hoomans-morphe-patches/commit/0db241228ceb6802e8676b3d842c2aa0e7ba355c))
* support Twitch 30.7.2 ([083df8c](https://github.com/arandomhooman/hoomans-morphe-patches/commit/083df8c989110f9d6cfd1812ea6e7628c6245b97))

## [1.46.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.45.0...v1.46.0) (2026-08-16)

### ✨ New Features

* add SwiftKey privacy patches ([72e918b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/72e918b91b27198c13be24affbf6fcdf3856f7f1))

## [1.45.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.44.0...v1.45.0) (2026-08-15)

### ✨ New Features

* add Moneta Unlock Plus patch ([63d438f](https://github.com/arandomhooman/hoomans-morphe-patches/commit/63d438f5356b26e93071b26234348e350d1cf1df))

## [1.44.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.43.4...v1.44.0) (2026-08-13)

### 🐛 Bug Fixes

* hide DirectChat message-bubble ad in Unlock Premium ([c5b42c4](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c5b42c4c86c4c9ed02d2adeed1738c1bbf17ff3a))
* resolve reported app regressions ([c24c92c](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c24c92ca14f93893fc086f34c15963b18c2f381b))
* resolve reported patch regressions ([332560b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/332560b405623d8888802d7fc89c98af0e9235ae))
* resolve Symfonium playback and Poweramp settings crashes ([7fe01ae](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7fe01aee708e3b2114b1e4f7a47d5c7b78a0e1f3))

### ✨ New Features

* add DirectChat unlock premium patch ([5c670b0](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5c670b05587cd2f24fc8086c397cf2287f6014d6))

## [1.44.0-dev.4](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.44.0-dev.3...v1.44.0-dev.4) (2026-08-13)

### 🐛 Bug Fixes

* handle install residue during release back-merge ([5fe8fb1](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5fe8fb112354c9a3e1b2f41f095ff6176df6b5b3))
* harden release back-merge against generated metadata ([e4fe869](https://github.com/arandomhooman/hoomans-morphe-patches/commit/e4fe86979e5a1d91e8e936a6f94e6ddb2420de97))
* resolve reported app regressions ([c24c92c](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c24c92ca14f93893fc086f34c15963b18c2f381b))
* resolve Symfonium playback and Poweramp settings crashes ([caa0bbc](https://github.com/arandomhooman/hoomans-morphe-patches/commit/caa0bbc8f11a6b81df5c1427874576ba597016f2))

## [1.44.0-dev.3](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.44.0-dev.2...v1.44.0-dev.3) (2026-07-22)

### 🐛 Bug Fixes

* resolve reported patch regressions ([d99af82](https://github.com/arandomhooman/hoomans-morphe-patches/commit/d99af82f4dd1babdf11bd14fdffee0880cce5ad0))
* resolve Symfonium playback and Poweramp settings crashes ([7fe01ae](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7fe01aee708e3b2114b1e4f7a47d5c7b78a0e1f3))

## [1.44.0-dev.2](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.44.0-dev.1...v1.44.0-dev.2) (2026-07-20)

### 🐛 Bug Fixes

* resolve reported patch regressions ([332560b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/332560b405623d8888802d7fc89c98af0e9235ae))

## [1.44.0-dev.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.43.0...v1.44.0-dev.1) (2026-07-12)

### 🐛 Bug Fixes

* hide DirectChat message-bubble ad in Unlock Premium ([c5b42c4](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c5b42c4c86c4c9ed02d2adeed1738c1bbf17ff3a))

### ✨ New Features

* add DirectChat unlock premium patch ([5c670b0](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5c670b05587cd2f24fc8086c397cf2287f6014d6))

## [1.43.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.42.1...v1.43.0) (2026-07-12)

### 🐛 Bug Fixes

* unlock Quizlet Learn/Test meters and Tracked free-tier StrictEq sites ([bf81012](https://github.com/arandomhooman/hoomans-morphe-patches/commit/bf81012c023f16cf8d3ac633dc15054113202b6b))
* unlock Quizlet mid-quiz Plus gates ([37e9290](https://github.com/arandomhooman/hoomans-morphe-patches/commit/37e929084c1ec4d8db9776c4a3867a5f117e0386))
* unlock Tracked customize-dashboard pro gate ([8dd606f](https://github.com/arandomhooman/hoomans-morphe-patches/commit/8dd606f857860267a938f60fdd509909c5f9e4e6))

### ✨ New Features

* support Alpha Progression 7.0 Unlock Premium ([db931b4](https://github.com/arandomhooman/hoomans-morphe-patches/commit/db931b4406e93bed5aa90bc3bb910fc3e0fca41f))

## [1.42.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.42.0...v1.42.1) (2026-07-12)

### 🐛 Bug Fixes

* neutralize Poweramp settings export/import crash on re-sign ([7f263ed](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7f263ed3bdd2c865a7bc95c52bda3874cb930293))
* return fixed SNTP time for Symfonium beta cutoff ([a184ae4](https://github.com/arandomhooman/hoomans-morphe-patches/commit/a184ae4efe4b3b11e2461fa75e0dece14eb28a40))
* stop Poweramp 0-byte settings export and Symfonium post-cutoff SNTP ([11a9e9a](https://github.com/arandomhooman/hoomans-morphe-patches/commit/11a9e9a2c4768284a40d000fe2f00ec6ec406462))

## [1.42.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.41.1...v1.42.0) (2026-07-05)

### ✨ New Features

* add ChatBoost unlock premium ([1d8d23e](https://github.com/arandomhooman/hoomans-morphe-patches/commit/1d8d23e524bfaa57310dbc53ca4a02c559c4e530))

## [1.41.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.41.0...v1.41.1) (2026-07-04)

### 🐛 Bug Fixes

* note that patching SofaScore breaks login in Remove Ads ([31b02aa](https://github.com/arandomhooman/hoomans-morphe-patches/commit/31b02aa215061fa66cca79c25b86024302aa2def))

## [1.41.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.40.0...v1.41.0) (2026-07-03)

### ✨ New Features

* add SofaScore remove ads patch ([58f3eaa](https://github.com/arandomhooman/hoomans-morphe-patches/commit/58f3eaa9ff7bdba36e3b97961a46492b93805593))

## [1.40.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.39.0...v1.40.0) (2026-07-02)

### ✨ New Features

* restore Projectivy Launcher 4.68 support alongside 4.70 ([b4fbf96](https://github.com/arandomhooman/hoomans-morphe-patches/commit/b4fbf96513e5c7764394dc500e7c5c589ec60ec3))

## [1.39.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.38.0...v1.39.0) (2026-07-01)

### ✨ New Features

* add Todoist unlock pro ([cd547ac](https://github.com/arandomhooman/hoomans-morphe-patches/commit/cd547ac6a2869c66f563470707b5275737613fa5))

## [1.38.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.37.0...v1.38.0) (2026-07-01)

### ✨ New Features

* add ADM remove ads patch ([78dd9f3](https://github.com/arandomhooman/hoomans-morphe-patches/commit/78dd9f35bdecbac34d5a5ed5617349b9c4e57f81))

## [1.37.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.36.0...v1.37.0) (2026-07-01)

### ✨ New Features

* add Hevy unlock pro ([30ac2ab](https://github.com/arandomhooman/hoomans-morphe-patches/commit/30ac2ab5328ba5c717b9904d57b2094a43d9a740))

## [1.36.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.35.0...v1.36.0) (2026-06-30)

### ✨ New Features

* add Symfonium unlock premium ([0ab2ecb](https://github.com/arandomhooman/hoomans-morphe-patches/commit/0ab2ecba425a3e2728783be994170515a61a566d))

## [1.35.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.34.1...v1.35.0) (2026-06-29)

### ✨ New Features

* add Smart AudioBook Player full unlock ([e212cf5](https://github.com/arandomhooman/hoomans-morphe-patches/commit/e212cf500597d53fb13b9e384a06f09248a7b05f))

## [1.34.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.34.0...v1.34.1) (2026-06-29)

### 🐛 Bug Fixes

* support Battery Guru 2.5.0.2 beta ([463a458](https://github.com/arandomhooman/hoomans-morphe-patches/commit/463a458b1e8a543d4d5b413fca32672d6eb12b8a))

## [1.34.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.33.0...v1.34.0) (2026-06-29)

### ✨ New Features

* add Poweramp unlock premium ([c04cd02](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c04cd02a25d6d2fe42e692913bbdbfc42d23e3c3))

## [1.33.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.32.0...v1.33.0) (2026-06-28)

### 🐛 Bug Fixes

* stop blazed sponsored posts slipping past Tumblr Remove ads ([a3ceef9](https://github.com/arandomhooman/hoomans-morphe-patches/commit/a3ceef924eb5472c55ab50310355a4298c4e7d92))

### ✨ New Features

* add Tumblr annoyance toggles ([570bf9f](https://github.com/arandomhooman/hoomans-morphe-patches/commit/570bf9fc296a4429b81dd54b5f88e68a14ced455))

## [1.32.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.31.3...v1.32.0) (2026-06-28)

### ✨ New Features

* update Projectivy Launcher Unlock Premium for 4.70 ([74c2232](https://github.com/arandomhooman/hoomans-morphe-patches/commit/74c22324cb3f4ef7c478ac3b1538c6d860e55555))

## [1.31.3](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.31.2...v1.31.3) (2026-06-27)

### 🐛 Bug Fixes

* neutralize InShot video engine kill on arm64 ([799a316](https://github.com/arandomhooman/hoomans-morphe-patches/commit/799a3161a237058b9f2d82b5f564d974265e404b))

## [1.31.2](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.31.1...v1.31.2) (2026-06-27)

### 🐛 Bug Fixes

* remove Photo Editor Polish patch ([fb576c0](https://github.com/arandomhooman/hoomans-morphe-patches/commit/fb576c00160cd8da11d3ecbf173fc1bae78e3cc5))

## [1.31.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.31.0...v1.31.1) (2026-06-26)

### 🐛 Bug Fixes

* stabilize InShot and PhotoPolish anti-tamper ([b7e24b4](https://github.com/arandomhooman/hoomans-morphe-patches/commit/b7e24b48e97419c23a4486b267393134774fa764))

## [1.31.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.30.0...v1.31.0) (2026-06-24)

### ✨ New Features

* add I Am Sober Unlock Sober Plus patch ([780eee7](https://github.com/arandomhooman/hoomans-morphe-patches/commit/780eee7d5e7c09fdbb2122a7eb3553881ccda59a))

## [1.30.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.29.0...v1.30.0) (2026-06-24)

### ✨ New Features

* add Mixel Unlock Premium patch ([47fb99b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/47fb99b61b07541753a4992cfaa7cf4ace28316b))

## [1.29.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.28.0...v1.29.0) (2026-06-24)

### ✨ New Features

* add Stash Unlock Pro patch ([5a3c439](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5a3c439ab56bbd6fd2c61805dde6f44496e88eb3))

## [1.28.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.27.0...v1.28.0) (2026-06-23)

### ✨ New Features

* add Projectivy Launcher Unlock Premium patch ([979d671](https://github.com/arandomhooman/hoomans-morphe-patches/commit/979d6718eb7229b248dd07870f6e7e51b757be4f))

## [1.27.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.26.0...v1.27.0) (2026-06-23)

### ✨ New Features

* add Cashew Unlock Pro patch ([7767afb](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7767afb3c04f488cf406f66659871e172442d0f7))
* add Finch Unlock Plus patch ([9c8559b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/9c8559bf2d0c44fe4c548ec134141a68682a5548))
* add Replaio Unlock Premium patch ([f20dcd5](https://github.com/arandomhooman/hoomans-morphe-patches/commit/f20dcd5f2128cc4a9b7a910800c47183a26eb2a4))
* add Video Converter Unlock Pro patch ([9356720](https://github.com/arandomhooman/hoomans-morphe-patches/commit/93567200d7f4a925d147304eabaca63ae9412a82))

## [1.26.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.25.0...v1.26.0) (2026-06-22)

### ✨ New Features

* add Tumblr Remove ads and Enable premium UI patches ([2407435](https://github.com/arandomhooman/hoomans-morphe-patches/commit/2407435e9b5d3fd299762149e0083d818e63016b))

## [1.25.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.24.1...v1.25.0) (2026-06-22)

### ✨ New Features

* add Battery Guru Unlock PRO patch ([6ced239](https://github.com/arandomhooman/hoomans-morphe-patches/commit/6ced239e45402ea4682a99362d15515a58ba7fb5))
* add Rumble Unlock Premium patch ([983b989](https://github.com/arandomhooman/hoomans-morphe-patches/commit/983b989feddff50834e65c5f9ce8a99e7cedced2))

## [1.24.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.24.0...v1.24.1) (2026-06-22)

### 🐛 Bug Fixes

* clarify Block live ads scope (prerolls can slip through) ([35f8dd1](https://github.com/arandomhooman/hoomans-morphe-patches/commit/35f8dd10c2aa52ba5f4a1d1b8b6d4b8cf139ea0c))

## [1.24.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.23.0...v1.24.0) (2026-06-21)

### 🐛 Bug Fixes

* patch Photo Editor Polish libitcore tamper check on all ABIs ([c22dacc](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c22dacc502f60894a597c5c4568595801ee37973)), closes [#42](https://github.com/arandomhooman/hoomans-morphe-patches/issues/42)

### ✨ New Features

* add Money Manager Unlock Premium patch ([1f29f72](https://github.com/arandomhooman/hoomans-morphe-patches/commit/1f29f72e5a7eaf5ebc49977bf80087414689c5dc))
* add Wanderlog Unlock Pro patch ([83430f9](https://github.com/arandomhooman/hoomans-morphe-patches/commit/83430f926689663b3bc59ac4e19ca7a2d1954d28))

## [1.23.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.22.0...v1.23.0) (2026-06-21)

### ✨ New Features

* add Twitch show deleted messages and auto-claim channel points ([c44bdcb](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c44bdcbe2b672155ddf657536ac9ab680445175a))
* skip the upgrade-to-Moovit+ popups in Unlock Moovit+ ([e8223e1](https://github.com/arandomhooman/hoomans-morphe-patches/commit/e8223e1f246c79c1f2ad297d686c0dd3a0d5171a))

## [1.22.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.21.0...v1.22.0) (2026-06-21)

### ✨ New Features

* add Flightradar24 patches (ads, aircraft data, own Maps key) ([77f640a](https://github.com/arandomhooman/hoomans-morphe-patches/commit/77f640a2323ddcbd712bfdf43b98e013c7d79d05))

## [1.21.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.20.0...v1.21.0) (2026-06-21)

### ✨ New Features

* add WEBTOON Remove ads patch ([11bf3c9](https://github.com/arandomhooman/hoomans-morphe-patches/commit/11bf3c904cdac669a92fb23f094b884610da3adb))

## [1.20.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.19.1...v1.20.0) (2026-06-20)

### 🐛 Bug Fixes

* decouple Acrobat Pro unlock from the sign-in spoof to stop the Play Billing reconcile loop ([c159d2a](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c159d2a0f6a6b224cd3f3e7fdf45ae3c1ee7ef2b))

### ✨ New Features

* add InShot Unlock Pro patch ([7f30aad](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7f30aadd6d9a63c7f4b8313a9730451794f60ba4))

## [1.19.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.19.0...v1.19.1) (2026-06-20)

### 🐛 Bug Fixes

* remove Flightradar24 patches (blank Google Maps base map on re-sign) ([3f1fbb2](https://github.com/arandomhooman/hoomans-morphe-patches/commit/3f1fbb23478dbfeb5c21255655a22a4d0dbf20d7))

## [1.19.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.18.0...v1.19.0) (2026-06-20)

### ✨ New Features

* add Flightradar24 Unlock aircraft data patch ([759deb7](https://github.com/arandomhooman/hoomans-morphe-patches/commit/759deb79d044893a2bd30df16df04180daedd758))

## [1.18.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.17.0...v1.18.0) (2026-06-20)

### ✨ New Features

* add Flightradar24 Remove ads patch ([2ce6f3c](https://github.com/arandomhooman/hoomans-morphe-patches/commit/2ce6f3c99ed64e3ffce53c82522ce575070f15c4))

## [1.17.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.16.0...v1.17.0) (2026-06-20)

### ✨ New Features

* add FolderSync Unlock Premium patch ([f0aa724](https://github.com/arandomhooman/hoomans-morphe-patches/commit/f0aa724875e883dbc27b9e65bf6de630b48ef097))

## [1.16.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.15.0...v1.16.0) (2026-06-20)

### ✨ New Features

* add AT4K Launcher Unlock Premium patch ([f656a2b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/f656a2b47667ebbade299acc2ad7da5415a431f9))

## [1.15.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.14.1...v1.15.0) (2026-06-20)

### ✨ New Features

* add Moovit Remove ads, Unlock Moovit+, and Maps key patches ([a967fdf](https://github.com/arandomhooman/hoomans-morphe-patches/commit/a967fdfe40a76a37590cbee0610357962a880938))

## [1.14.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.14.0...v1.14.1) (2026-06-20)

### 🐛 Bug Fixes

* stop Car Launcher's re-sign check from turning icons into skulls ([5e646bc](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5e646bc7ead33916b5a6705a9bf2c79ac167fe04))

## [1.14.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.13.0...v1.14.0) (2026-06-20)

### ✨ New Features

* add Twitch ad-removal patches ([2df32fc](https://github.com/arandomhooman/hoomans-morphe-patches/commit/2df32fcff813672b26645d074eacca620fd14661))

## [1.13.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.12.0...v1.13.0) (2026-06-19)

### ✨ New Features

* add Adobe Acrobat Unlock Pro patch ([91e1014](https://github.com/arandomhooman/hoomans-morphe-patches/commit/91e1014f3809e6c63c2dc61d8e5bccdbbe965106))

## [1.12.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.11.0...v1.12.0) (2026-06-19)

### ✨ New Features

* add Collectr Unlock Premium patch ([77e5aaa](https://github.com/arandomhooman/hoomans-morphe-patches/commit/77e5aaa09b2788343a7989bd759ab7543bf408cf))

## [1.11.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.10.0...v1.11.0) (2026-06-19)

### ✨ New Features

* add Car Launcher Unlock Full Version patch ([a04f188](https://github.com/arandomhooman/hoomans-morphe-patches/commit/a04f1888d62c0025e3620dc57d3c2ce32a912fb7))

## [1.10.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.9.1...v1.10.0) (2026-06-18)

### ✨ New Features

* add Tracked Unlock Pro patch ([7ada7af](https://github.com/arandomhooman/hoomans-morphe-patches/commit/7ada7af3a1c109a5f8c1f1679ace819a2ad895fb))

## [1.9.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.9.0...v1.9.1) (2026-06-17)

### 🐛 Bug Fixes

* remove LingQ Unlock Premium patch ([e575e20](https://github.com/arandomhooman/hoomans-morphe-patches/commit/e575e20e6c28ff343fa1976f56a8794ff0811cd4))

## [1.9.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.8.0...v1.9.0) (2026-06-17)

### ✨ New Features

* add LingQ Unlock Premium patch ([d33835d](https://github.com/arandomhooman/hoomans-morphe-patches/commit/d33835dfc6f65bb7f8241e3f06a648e13a4bfecf))

## [1.8.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.7.0...v1.8.0) (2026-06-17)

### ✨ New Features

* add Essence Unlock Pro patch ([5026def](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5026defb223fd534e9f6762b9821869c413d410b))

## [1.7.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.6.0...v1.7.0) (2026-06-17)

### ✨ New Features

* add BandLab Unlock Membership patch ([c84249b](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c84249b59ed8e1195dbe94fd3f0e7fa8a782d251))

## [1.6.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.5.0...v1.6.0) (2026-06-16)

### ✨ New Features

* add Photo Editor Polish Unlock Pro patch ([77e6ce2](https://github.com/arandomhooman/hoomans-morphe-patches/commit/77e6ce2ee1fe33a1499d2740b510984298aafc20))

## [1.5.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.4.0...v1.5.0) (2026-06-15)

### ✨ New Features

* add Alpha Progression Unlock Premium patch ([053d72e](https://github.com/arandomhooman/hoomans-morphe-patches/commit/053d72ec55ef95bf3de35ccd8166ad4c8762516b))

## [1.4.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.3.0...v1.4.0) (2026-06-15)

### ✨ New Features

* bundle the PairIP license-check bypass into the unlock patches ([c31cf95](https://github.com/arandomhooman/hoomans-morphe-patches/commit/c31cf95968a390ad7433f6f3c575db9cfbb049c3))

## [1.3.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.2.4...v1.3.0) (2026-06-15)

### ✨ New Features

* **Liquid Gallery:** add Unlock Pro and Disable License Check ([9694805](https://github.com/arandomhooman/hoomans-morphe-patches/commit/96948051edd286b40365b0c00ff91b6ee1586e15))
* **Quizlet:** add Unlock Plus ([12ab764](https://github.com/arandomhooman/hoomans-morphe-patches/commit/12ab764d0a0d5c49f9b0ea558697f92bd2129c2c))

## [1.2.4](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.2.3...v1.2.4) (2026-06-15)

### 🐛 Bug Fixes

* **Cronometer:** clarify the libapp.so-not-found guard message ([0b39992](https://github.com/arandomhooman/hoomans-morphe-patches/commit/0b39992a141faf555cba16775fc30fb4dc7b35fb))

## [1.2.3](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.2.2...v1.2.3) (2026-06-15)

### 🐛 Bug Fixes

* **Cronometer:** mark Unlock Gold 4.56.0 as stable ([faa4999](https://github.com/arandomhooman/hoomans-morphe-patches/commit/faa49998b9a11c769008a97c264ad466ac8f2832))

## [1.2.2](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.2.1...v1.2.2) (2026-06-15)

### 🐛 Bug Fixes

* actually unlock BlockerHero premium (force cached isPremium state) ([052de71](https://github.com/arandomhooman/hoomans-morphe-patches/commit/052de715ab8085791bb16188ac45101dbf68e021))

## [1.2.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.2.0...v1.2.1) (2026-06-15)

### 🐛 Bug Fixes

* **Cronometer:** gate Unlock Gold behind experimental toggle ([72487fe](https://github.com/arandomhooman/hoomans-morphe-patches/commit/72487fef0054ffe5c52660d8d2766afee7305416))

## [1.2.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.1.0...v1.2.0) (2026-06-15)

### ✨ New Features

* add Cronometer Unlock Gold patch ([5f5dc46](https://github.com/arandomhooman/hoomans-morphe-patches/commit/5f5dc461b4caed2b802ca80f9d57cc3ce6a33f73))

## [1.1.0](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.0.2...v1.1.0) (2026-06-15)

### ✨ New Features

* **TeachMeAnatomy:** add Unlock Premium and Disable License Check patches ([049823c](https://github.com/arandomhooman/hoomans-morphe-patches/commit/049823c2e1abe6d826ee8c3792430aaa6d976b15))

## [1.0.2](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.0.1...v1.0.2) (2026-06-14)

### 🐛 Bug Fixes

* **BlockerHero:** suppress the spurious "Unauthenticated." toast on premium sync ([b8e3a68](https://github.com/arandomhooman/hoomans-morphe-patches/commit/b8e3a684d45d8841f0aecdcdb3dc2924b2b9c7b3))

## [1.0.1](https://github.com/arandomhooman/hoomans-morphe-patches/compare/v1.0.0...v1.0.1) (2026-06-14)

### 🐛 Bug Fixes

* **BlockerHero:** bypass the Google login gate so premium features are usable ([16c0c16](https://github.com/arandomhooman/hoomans-morphe-patches/commit/16c0c166ba31f158bb2dd1b1fdfbb33324ea212d))

## 1.0.0 (2026-06-14)

### 🐛 Bug Fixes

* **ci:** add PATCHES_START/END markers so the release readme generator can inject the patch list ([0ab28a6](https://github.com/arandomhooman/hoomans-morphe-patches/commit/0ab28a631dd506c7a26631b1966d03624174a11a))
* **ci:** mark gradlew executable so the release workflow can run it ([a05198e](https://github.com/arandomhooman/hoomans-morphe-patches/commit/a05198e8b66ae46f4c1ddb71a9a27b589b3ec5ca))

### ✨ New Features

* add BlockerHero Enable Premium patch ([bf75126](https://github.com/arandomhooman/hoomans-morphe-patches/commit/bf751268a545fe092b7e97b05c857bc5b2b89d92))
