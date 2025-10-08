2.0 (Android 16 Fork)
===

**🚀 Major Android 16 Adaptation Release**

- **Updated targetSDK to 36 (Android 16)** with full compatibility and optimization.
- **Edge-to-Edge UI Implementation**: Complete redesign to support Android 16's mandatory edge-to-edge requirements.
- **Predictive Back Navigation**: Implemented smooth back gesture animations and modern navigation patterns.
- **Material You 3.0 Integration**: Enhanced theming with dynamic colors and adaptive design elements.
- **Pixel 9a Optimization**: Hardware-specific optimizations for 6.3" display (2424×1080 resolution).
- **Adaptive Icons Support**: Full compatibility with Android 16's adaptive icon system.
- **Performance Enhancements**: Improved battery optimization and power management for extended usage.
- **Gesture Navigation**: Optimized for modern Android navigation patterns and gestures.
- **Enhanced Security**: Updated to leverage Android 16's improved Work Profile APIs and security features.
- **Backward Compatibility**: Maintains full compatibility with previous Android versions while embracing new capabilities.

**Technical Changes:**
- Updated `compileSdk` and `targetSdkVersion` to 36
- Implemented WindowInsets handling for edge-to-edge support
- Added predictive back gesture support
- Enhanced Material Design 3 components integration
- Optimized for Pixel 9a hardware specifications

1.9.1 (445)
===

- Hotfix crashes below Android 11.

1.9
===

- Updated targetSDK to 34 (Android 14) with compatibility fixes.
- More reliable delayed freezing using AlarmManager (thanks parmaster84).
- Support for cross-profile interactions allowlisting (e.g. for Gboard).
- Removed "Fake Camera" feature as it has not been supported since R.
- Version displayed within the app has now been changed to also reflect the exact Git commit when the app is built.
- File Shuttle no longer appends ".null" or ".bin" suffixes unnecessarily. This should make it work much better with file managers such as Material Files.
- File Shuttle now triggers media scanning much more robustly. Media files (pictures, videos, etc.) copied into the work profile should now show up much quicker in gallery apps.
- Added a fake NFC payment service to workaround a bug in Android that prevents payment apps inside the work profile from being used if none is present in the main profile.
- Fixed unintuitive colors of navigation icons under dark mode.

1.8
===

- Updated targetSDK to 33 (Android 13) with compatibility fixes.
- UI style revamp with Material You support on Android 12+.

1.7
===

- Revamped the initial setup process to include a full setup guide for better clarity and less confusion.
- Upgraded targetSDK to 31 (Android 12) with compatibility fixes.
- Upgraded dependencies.
- Translation updates thanks to our wonderful community.

1.6
===

- Start of in-repo changelogs
- Add support for Android 11 (c147377, 3852bd, and more) (__Note__: For now, File Shuttle is not available in the version on Google Play due to policy reasons, as they will not be allowing apps with All Files permission before 2021.)
- Shelter can no longer be installed to external storage (removable SD cards) (9a6777 by Camilio Alejo)
- Allow more browsable intents to be passed across work / main profile boundary (43444b by Camilio Alejo)
- A new shortcut to Documents UI is available in the three-dot menu of Shelter, because on Pixels the Google Files app may not be able to open File Shuttle correctly (a121ee)
- You can now choose to block or allow cross-profile contact access via a settings option (749ad1)
- Thanks to translators participating in our Weblate instance (https://weblate.typeblog.net), Shelter is now available in more languages. You can now contribute translations easier than ever by using the Weblate interface.
