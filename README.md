# Shelter (Android 16 Fork)

*An isolated space for your applications leveraging Android Work Profile, fully optimized for Android 16 (API 36).*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](LICENSE)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Target SDK: 36](https://img.shields.io/badge/Target_SDK-36-blue.svg)](https://developer.android.com/about/versions/16)
[![Share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)](https://twitter.com/intent/tweet?text=Check%20out%20this%20awesome%20Android%2016%20Work%20Profile%20isolation%20tool%20Shelter-fork&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)

## Overview

Shelter is a Free and Open-Source (FOSS) application that leverages the "Work Profile" feature of Android to provide an isolated space that you can install or clone apps into. 

This fork has been specifically adapted for Android 16 (API 36) with full support for Pixel 9a and modern Android features, including Edge-to-Edge UI, Material You dynamic color integration, and Predictive Back Navigation.

## Key Features

- **Work Profile Isolation**: Install apps inside an isolated profile to prevent them from accessing your main profile data.
- **Freeze Inactive Apps**: Freeze background apps inside the work profile to prevent them from running, consuming battery, or waking up when not in use.
- **App Cloning**: Run two separate instances of the same application on a single device.
- **Android 16 Edge-to-Edge**: Full support for Android 16 mandatory edge-to-edge UI layouts.
- **Predictive Back Navigation**: Smooth transitions and modern gesture navigation support.
- **Pixel 9a Compatibility**: Screen layout and battery optimization tailored for the 6.3" display.

## Tech Stack

| Layer / Component | Technology | Details / Purpose |
| --- | --- | --- |
| Operating System | Android | Target SDK 36 (Android 16), Min SDK 24 (Android 7.0) |
| Programming Language | Java / AIDL | Main application logic and IPC |
| Build System | Gradle (v8.6.0 plugin) | Project build automation |
| UI Framework | Material Design | Android Jetpack (AppCompat, Preference, Material Components) |

## Getting Started

### Prerequisites
- JDK 17
- Android SDK (API 36 Command-line tools or Android Studio)
- An Android device running Android 16 (API 36) or higher for optimal compatibility.

### Installation & Running
1. Clone the repository:
   ```bash
   git clone https://github.com/Almanex/Shelter-fork.git
   cd Shelter-fork
   ```
2. Build the debug version:
   ```bash
   ./gradlew assembleDebug
   ```
3. Install the APK to your device:
   ```bash
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```

## Running the Tests

To run the unit tests:
```bash
./gradlew test
```

To run instrumentation tests (requires a connected device or emulator):
```bash
./gradlew connectedAndroidTest
```

## Deployment

To compile a production/release build of the application:
```bash
./gradlew assembleRelease
```
The compiled APK will be located in `app/build/outputs/apk/release/`.

Please note that for testing release builds on Android 16, they must be signed with a valid signature.

### Windows Defender SmartScreen (for tools/build environment)
When running compiled helper scripts or tools on Windows, users may see a Windows Defender SmartScreen warning due to unsigned scripts. To bypass:
- Click **More info**
- Click **Run anyway**

## Contributing

Contributions are welcome. Please read through the codebase guidelines and submit issues or pull requests on GitHub.

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details.