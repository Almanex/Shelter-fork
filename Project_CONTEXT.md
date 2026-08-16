# Project Context

This document outlines the codebase organization and architecture of Shelter (Android 16 Fork) for AI development agents.

## Core Architecture

Shelter utilizes the Android Device Administration and Work Profile APIs to isolate apps. Key components:

- **App Module (`/app`)**: Contains the primary Android application code.
  - `net.typeblog.shelter.services`: Services managing profile creation, app cloning, freezing, tile services (`FreezeAllTileService`, `WorkProfileTileService`), and background tasks.
  - `net.typeblog.shelter.ui`: User interface elements, including Material 3 settings (`SettingsFragment`, `SettingsCardDecoration`), profile setup wizard, and app list (`MainActivity`, `AppListFragment`).
  - `net.typeblog.shelter.util`: System utilities, DPC policy manager (`Utility.java`), cross-profile intent filtering, and settings persistence.
- **Setup Wizard**: Implemented in `:app` (`net.typeblog.shelter.ui.SetupWizardActivity`) to support profile creation without external dependencies.
- **Cross-Profile Sharing**: Bidirectional `ACTION_SEND` and `ACTION_GET_CONTENT` intent filters combined with Android Photo Picker (`ActivityResultContracts.PickVisualMedia`).

## Target Configurations
- Target SDK: 36 (Android 16)
- Min SDK: 24 (Android 7.0)
- Java Version: 17
- Design System: Material 3 (Card-based preferences, MaterialSwitch, Dynamic Colors)
