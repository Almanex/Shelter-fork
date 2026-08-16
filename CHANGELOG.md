2.1 (Material 3 & System Modernization)
===

- **Quick Settings Tiles**: Added native Android Quick Settings tiles for "Freeze All" (batch app suspension) and "Work Profile" (quiet mode container toggle).
- **Material 3 Settings Redesign**: Transformed settings screen into modern Material 3 card-based layout (`SettingsCardDecoration`, 16dp rounded card grouping, `MaterialSwitch` toggles, crisp vector icons).
- **Android Photo Picker Integration**: Replaced legacy File Shuttle with native Android 13+ Photo Picker (`MediaStore.ACTION_PICK_IMAGES`) and 1-tap cross-profile media sharing.
- **Bidirectional Cross-Profile Sharing**: Upgraded DPC intent filters to allow seamless cross-profile sharing via native Android Share Sheet (`ACTION_SEND`) and Documents UI tabs ("Personal" / "Work").
- **Permission Cleanup**: Completely removed dangerous permissions (`SYSTEM_ALERT_WINDOW`, `MANAGE_EXTERNAL_STORAGE`, `READ/WRITE_EXTERNAL_STORAGE`) and legacy background socket services.
- **Stability & Performance**: Resolved crash edge cases in package cloning and DPC initialization.

2.0 (Android 16 Fork)
===

- **Updated targetSDK to 36 (Android 16)** with full compatibility and optimization.
- **Edge-to-Edge UI Implementation**: Redesigned layouts to support Android 16 mandatory edge-to-edge window insets.
- **Predictive Back Navigation**: Implemented smooth back gesture animations and modern navigation patterns.
- **Material You Dynamic Colors**: Integrated Material Design dynamic theming with adaptive color schemes.
- **Pixel 9a Optimization**: Hardware-specific optimizations for 6.3" display and power management.
- **Adaptive Icons Support**: Full compatibility with Android adaptive icon systems.
- **Enhanced Security**: Leveraged Android 16 Work Profile APIs and security enhancements.

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
- File Shuttle no longer appends ".null" or ".bin" suffixes unnecessarily.
- File Shuttle now triggers media scanning much more robustly.
- Added a fake NFC payment service to workaround an Android bug preventing work profile payment apps.
- Fixed unintuitive colors of navigation icons under dark mode.

1.8
===

- Updated targetSDK to 33 (Android 13) with compatibility fixes.
- UI style revamp with Material You support on Android 12+.

1.7
===

- Revamped initial setup process with guided setup wizard.
- Upgraded targetSDK to 31 (Android 12) with compatibility fixes.
- Upgraded dependencies.
- Translation updates from the community.

1.6
===

- Start of in-repo changelogs.
- Added support for Android 11.
- Shelter can no longer be installed to external storage (removable SD cards).
- Allowed more browsable intents to pass across work/main profile boundaries.
- Shortcut to Documents UI in the three-dot overflow menu.
- Added option to block or allow cross-profile contact access.
