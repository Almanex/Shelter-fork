# Shelter (Android 16 Fork)

*Ein isolierter Bereich für Anwendungen unter Nutzung des Android-Arbeitsprofils, vollständig optimiert für Android 16 (API 36).*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](../LICENSE)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Target SDK: 36](https://img.shields.io/badge/Target_SDK-36-blue.svg)](https://developer.android.com/about/versions/16)
[![Share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)](https://twitter.com/intent/tweet?text=Check%20out%20this%20awesome%20Android%2016%20Work%20Profile%20isolation%20tool%20Shelter-fork&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)

## Übersicht

Shelter ist eine freie Open-Source-Anwendung (FOSS), die die native „Arbeitsprofil“-Funktion von Android nutzt, um eine isolierte Sandbox bereitzustellen, in der Anwendungen installiert, geklont oder isoliert werden können.

Dieser Fork ist modern, schlank und vollständig an Android 16 (API 36) sowie aktuelle Pixel-Geräte angepasst. Die App bietet ein kartenbasiertes Material 3 Design, Schnelleinstellungs-Kacheln, eine native Photo Picker Integration und bidirektionalen Datenaustausch ohne veraltete Hintergrund-Overlays oder gefährliche Berechtigungen.

## Hauptmerkmale

- **Arbeitsprofil-Isolierung**: Ausführen von Apps in einem isolierten Bereich, wodurch der Zugriff auf persönliche Kontakte, Dateien und Hauptprofildaten unterbunden wird.
- **Schnelleinstellungs-Kacheln**: Steuerung über die Android-Benachrichtigungsleiste mit nativen Kacheln für „Alles einfrieren“ und „Arbeitsprofil (Ruhemodus)“.
- **Material 3 Redesign**: Kartenbasiertes Einstellungslayout mit abgerundeten Material 3 Karten (16dp), flüssigen `MaterialSwitch`-Elementen und Vektorsymbolen.
- **Nativer Android Photo Picker**: Sicherer Medienzugriff ohne Speicherberechtigungen über den Android 13+ Photo Picker mit direkter Profilfreigabe.
- **Bidirektionaler Dateiaustausch**: Native Cross-Profile-Filter für das System-Share-Sheet (`ACTION_SEND`) und den Dokumenten-Explorer anstelle des veralteten File Shuttle; Entfernung gefährlicher Berechtigungen (`SYSTEM_ALERT_WINDOW`, `MANAGE_EXTERNAL_STORAGE`).
- **Automatisches & Batch-Einfrieren**: Inaktive Hintergrund-Apps bei Bildschirmsperre oder manuell per Kachel/Verknüpfung einfrieren.
- **Android 16 Edge-to-Edge**: Volle Unterstützung für rahmenlose System-Layouts und vorausschauende Gestennavigation (Predictive Back).
- **Pixel 9a Optimierung**: Speziell abgestimmtes Layout und Energiemanagement für moderne OLED-Displays.

## Tech-Stack

| Ebene / Komponente | Technologie | Details / Zweck |
| --- | --- | --- |
| Betriebssystem | Android | Target SDK 36 (Android 16), Min SDK 24 (Android 7.0) |
| Programmiersprache | Java / AIDL | Hauptanwendungslogik, IPC und DPC-Geräteverwaltung |
| Design-System | Material Design 3 | Kartenbasierte Einstellungen, MaterialSwitch, Material You (Dynamic Color) |
| System-Integration | Android Quick Settings | Native `TileService`-Dienste für Profil- und Einfriersteuerung |
| Medien & Speicher | Android Photo Picker | Rechteschonender `PickVisualMedia` und bidirektionale Filter |
| Build-System | Gradle (AGP 8.6+) | Automatisierte Android-Gradle-Build-Pipeline |

## Erste Schritte

### Voraussetzungen
- JDK 17 (z. B. OpenJDK 17 oder Android Studio JBR)
- Android SDK mit installierter Plattform API 36 und Build-Tools
- Ein Android-Gerät oder Emulator mit Android 14, 15 oder 16.

### Installation & Ausführung
1. Klonen Sie das Repository:
   ```bash
   git clone https://github.com/Almanex/Shelter-fork.git
   cd Shelter-fork
   ```
2. Debug-APK erstellen:
   ```bash
   ./gradlew assembleDebug
   ```
3. APK über ADB auf dem Gerät installieren:
   ```bash
   adb install -r app/build/outputs/apk/debug/app-debug.apk
   ```

Ausführliche Anleitungen finden Sie im [Benutzerhandbuch](GUIDE_DE.md).

## Tests ausführen

Unit-Tests ausführen:
```bash
./gradlew test
```

Instrumentierungstests ausführen:
```bash
./gradlew connectedAndroidTest
```

## Bereitstellung

Erstellen eines signierten Release-Builds:
```bash
./gradlew assembleRelease
```
Die fertige APK wird unter `app/build/outputs/apk/release/` abgelegt.

### Windows Defender SmartScreen
Beim Ausführen von Build-Skripten unter Windows kann eine SmartScreen-Warnung erscheinen:
- Klicken Sie auf **Weitere Informationen**
- Klicken Sie auf **Trotzdem ausführen**

## Beteiligung

Fehlerberichte, Verbesserungsvorschläge und Pull-Requests sind willkommen. Bitte stellen Sie sicher, dass Ihr Code den Material 3 Richtlinien und der Projektarchitektur folgt.

## Lizenz

Dieses Projekt ist unter der GNU General Public License v3.0 lizenziert – siehe [LICENSE](../LICENSE).
