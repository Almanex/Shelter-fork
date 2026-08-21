[README_RU](docs/README_RU.md) | [README_DE](docs/README_DE.md) | [README_EN](README.md) | [GUIDE_RU](docs/GUIDE_RU.md) | [GUIDE_DE](docs/GUIDE_DE.md) | [GUIDE_EN](docs/GUIDE_EN.md)

# Shelter (Android 16 Fork)

*An isolated space for your applications leveraging Android Work Profile, fully optimized for Android 16 (API 36).*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](LICENSE)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Target SDK: 36](https://img.shields.io/badge/Target_SDK-36-blue.svg)](https://developer.android.com/about/versions/16)
[![Share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)](https://twitter.com/intent/tweet?text=Check%20out%20this%20awesome%20Android%2016%20Work%20Profile%20isolation%20tool%20Shelter-fork&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)

## Overview

Shelter is a Free and Open-Source (FOSS) application that leverages the "Work Profile" feature of Android to provide an isolated space where you can install, isolate, or clone applications.

This fork is modern, lightweight, and fully adapted for Android 16 (API 36) and Pixel devices. It incorporates modern Material 3 card-based aesthetics, Quick Settings tiles, native Photo Picker integration, seamless bidirectional file sharing, and eliminates legacy background overlay requirements.

## Key Features

- **Work Profile Isolation**: Install or clone applications inside an isolated sandbox, preventing them from accessing your personal data, contacts, or local storage.
- **Quick Settings Tiles**: Control your environment directly from the Android notification shade with native Quick Settings tiles for "Freeze All" and "Work Profile (Quiet Mode)".
- **Material 3 Redesign**: Card-based preference layout with rounded Material 3 cards, smooth `MaterialSwitch` controls, and vector icons.
- **Android Photo Picker**: Secure, permissionless media selection via Android 13+ native Photo Picker with 1-tap cross-profile sharing.
- **Bidirectional File Sharing**: Native cross-profile intent filters for system Share Sheet (`ACTION_SEND`) and Documents UI, replacing legacy File Shuttle and removing dangerous `SYSTEM_ALERT_WINDOW` or `MANAGE_EXTERNAL_STORAGE` permissions.
- **Batch & Auto-Freezing**: Freeze background apps upon screen lock or instantly on demand via Quick Settings and launcher shortcuts.
- **Android 16 Edge-to-Edge**: Full compliance with Android 16 mandatory edge-to-edge window insets and predictive back gesture navigation.
- **Pixel 9a Optimization**: Refined layout, touch targets, and power management tailored for modern Pixel displays.

## Tech Stack

| Layer / Component | Technology | Details / Purpose |
| --- | --- | --- |
| Operating System | Android | Target SDK 36 (Android 16), Min SDK 24 (Android 7.0) |
| Programming Language | Java / AIDL | Main application logic, IPC, and DPC administration |
| Design System | Material Design 3 | Card-based preferences, MaterialSwitch, Dynamic Color (Material You) |
| System Integration | Android Quick Settings | Native `TileService` implementations for profile and freeze controls |
| Media & Storage | Android Photo Picker | Permissionless `PickVisualMedia` and bidirectional cross-profile filters |
| Build System | Gradle (AGP 8.6+) | Automated Android Gradle build pipeline |

## Getting Started

### Prerequisites
- JDK 17 (e.g. OpenJDK 17 or Android Studio bundled JBR)
- Android SDK with Platform 36 and build-tools installed
- An Android device or emulator running Android 14, 15, or 16.

### Installation & Running
1. Clone the repository:
   ```bash
   git clone https://github.com/Almanex/Shelter-fork.git
   cd Shelter-fork
   ```
2. Build the debug APK:
   ```bash
   ./gradlew assembleDebug
   ```
3. Install to your connected device via ADB:
   ```bash
   adb install -r app/build/outputs/apk/debug/app-debug.apk
   ```

For detailed user instructions, refer to the [User Guide](docs/GUIDE.md).

## Running the Tests

To execute local unit tests:
```bash
./gradlew test
```

To run connected instrumentation tests:
```bash
./gradlew connectedAndroidTest
```

## Deployment

To compile a signed production release:
```bash
./gradlew assembleRelease
```
The output APK will be generated in `app/build/outputs/apk/release/`.

### Windows Defender SmartScreen
When executing build utilities or scripts on Windows environments, SmartScreen may display a warning:
- Click **More info**
- Click **Run anyway**

## Contributing

Contributions, bug reports, and pull requests are welcome. Please ensure your code conforms to the project architecture, Material 3 standards, and retains zero-emoji technical documentation.

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details.
