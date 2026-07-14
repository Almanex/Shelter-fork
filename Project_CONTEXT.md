# Project Context

This document outlines the codebase organization and architecture of Shelter (Android 16 Fork) for AI development agents.

## Core Architecture

Shelter utilizes the Android Device Administration and Work Profile APIs to isolate apps. Key components:

- **App Module (`/app`)**: Contains the primary Android application code.
  - `net.typeblog.shelter.services`: Services managing profile creation, app cloning, freezing, and background tasks.
  - `net.typeblog.shelter.ui`: User interface elements, including settings, profile setup wizard, and app list.
- **Setup Wizard Library (`/libs/SetupWizardLibrary`)**: Library to support setup screens inside the app.

## Target Configurations
- Target SDK: 36 (Android 16)
- Min SDK: 24 (Android 7.0)
- Java Version: 17
