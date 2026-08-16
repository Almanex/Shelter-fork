# Shelter User Guide — How to Isolate and Clone Android Apps with Work Profile

> [!NOTE]
> **Summary**: Shelter creates an isolated sandbox on your Android device using the native Android Work Profile API. It allows you to run multiple accounts of the same app, prevent trackers from accessing your personal contacts and storage, freeze battery-draining apps automatically, and toggle work profile status instantly from Quick Settings.

## Introduction

Android devices contain a powerful enterprise feature known as the **Work Profile**, which isolates applications and their data into a completely separate container. Shelter leverages this native functionality without requiring root permissions, giving everyday users full control over app isolation, sandboxing, and privacy.

Whether you need to separate work accounts from personal accounts, stop background tracking, or clone social and messaging applications, Shelter provides a seamless, open-source solution optimized for Android 16 and modern smartphones.

## Feature Breakdown

### Work Profile Sandboxing
Applications installed inside the Shelter container run in complete isolation. They cannot read your personal contact list, view your personal photos, or access private app data residing in your personal profile.

### App Freezing and Auto-Freeze
Unlike traditional task killers that cause system instability, Shelter utilizes Android's native package suspension APIs. Frozen applications cannot start background services, trigger wake locks, or receive network traffic until explicitly unfreezed by the user.

- **Auto-Freeze on Lock**: Automatically freezes selected apps when the screen turns off.
- **Batch Freeze**: Freeze all configured background applications with a single tap.

### Quick Settings Tiles
Manage your container without opening the main application:
- **Freeze All Tile**: Instantly freezes all apps marked for background suspension.
- **Work Profile Tile**: Completely enables or disables the Work Profile container (Quiet Mode) to pause all work notifications and services during personal hours.

### Modern Android Photo Picker and Cross-Profile Sharing
Transferring files across container boundaries is handled natively:
- **Android Photo Picker**: Select photos and videos via the secure, permissionless system picker without granting full storage permissions.
- **Cross-Profile Share Sheet**: Use the native Android share sheet (`ACTION_SEND`) to pass links, files, and documents smoothly between your Personal and Shelter profiles.

### Material 3 Card-Based Interface
The settings and management views are built with Material Design 3 guidelines, featuring rounded grouping cards, dynamic color theming, and responsive controls.

## Interface Languages & Localization

Shelter supports multiple interface languages and automatically matches your system language preferences:
- **English** (Default)
- **Russian** (Русский)
- **German** (Deutsch)
- Additional community-contributed translations available via standard Android locale settings.

## Quick-Start Instructions

1. **Step 1: Install Shelter** — Download and install the APK package onto your Android 14+ or Android 16 device.
2. **Step 2: Complete Initial Setup** — Launch Shelter and proceed through the initial setup wizard to provision the Work Profile. Accept the Device Administration prompt to grant local sandbox control.
3. **Step 3: Clone or Install Apps** — Navigate to the "Main" tab to select existing apps to clone into Shelter, or tap the three-dots menu to install standalone APK files directly into the container.
4. **Step 4: Configure Auto-Freeze** — Open Settings -> Auto Freeze Service to enable background suspension on screen lock for chosen applications.
5. **Step 5: Add Quick Settings Tiles** — Swipe down your Android notification panel, tap the Edit (pencil) button, and drag the "Freeze All" and "Work Profile" tiles into your active quick settings.

## Tips & Shortcuts

| Feature / Action | Method | Description |
| --- | --- | --- |
| Create Home Shortcut | Long-press app in Shelter tab | Places a direct launcher shortcut with a work badge on your home screen |
| Unfreeze & Launch | Tap on any frozen app | Automatically unfreezes the application and launches it immediately |
| Quick Freeze All | Quick Settings Tile | Suspends all configured apps without opening the Shelter app |
| Toggle Quiet Mode | Work Profile Tile | Turns off the entire work container to stop all background processes |
| Cross-Profile File Transfer | 3-dots Menu -> Share Files | Sends documents to any app across the profile boundary |

## FAQ & Troubleshooting

### Why did "Freeze All" only freeze one app?
The "Freeze All" action targets applications added to your auto-freeze list. To add more apps to this list, tap an app in the Shelter tab and choose "Auto Freeze (when screen is locked)".

### What is the difference between Freezing and Disabling the Work Profile?
Freezing suspends selected individual apps while keeping other apps (such as work messengers or calendar) active. Disabling the Work Profile (Quiet Mode) completely turns off the entire container, pausing all work applications at once.

### Can Shelter access my private files?
No. Shelter does not request or require broad storage permissions (`MANAGE_EXTERNAL_STORAGE` or `SYSTEM_ALERT_WINDOW`). All file sharing is initiated directly by the user through the system picker and share sheet.

## Join the Community & Support

Shelter is an open-source project. If you encounter any bugs, have feature requests, or wish to contribute improvements:
- Star the repository on GitHub: [Almanex/Shelter-fork](https://github.com/Almanex/Shelter-fork)
- Report issues via the GitHub Issue Tracker.
- Submit Pull Requests to help improve modern Android privacy tools.
