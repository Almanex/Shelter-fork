# Shelter (Android 16 Fork)

*Ein isolierter Bereich für Ihre Anwendungen unter Nutzung des Android-Arbeitsprofils, vollständig optimiert für Android 16 (API 36).*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](../LICENSE)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Target SDK: 36](https://img.shields.io/badge/Target_SDK-36-blue.svg)](https://developer.android.com/about/versions/16)
[![Share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)](https://twitter.com/intent/tweet?text=Check%20out%20this%20awesome%20Android%2016%20Work%20Profile%20isolation%20tool%20Shelter-fork&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)

## Übersicht

Shelter ist eine kostenlose und Open-Source-App (FOSS), die die „Arbeitsprofil“-Funktion von Android nutzt, um einen isolierten Bereich bereitzustellen, in dem Sie Apps installieren oder klonen können.

Dieser Fork wurde speziell für Android 16 (API 36) angepasst und bietet volle Unterstützung für Pixel 9a sowie moderne Android-Funktionen wie die Edge-to-Edge-Benutzeroberfläche, Material You Farbthemen und die vorausschauende Zurück-Navigation (Predictive Back).

## Hauptmerkmale

- **Arbeitsprofil-Isolierung**: Installieren Sie Apps in einem isolierten Profil, um zu verhindern, dass sie auf Ihre Hauptprofildaten zugreifen.
- **Inaktive Apps einfrieren**: Frieren Sie Hintergrund-Apps im Arbeitsprofil ein, um Akku zu sparen und unkontrollierte Aktivitäten zu verhindern.
- **Klonen von Apps**: Führen Sie zwei separate Instanzen der selben App auf einem Gerät aus.
- **Android 16 Edge-to-Edge**: Volle Unterstützung für das obligatorische Edge-to-Edge-Design unter Android 16.
- **Optimierte Navigation**: Fließende Animationen bei der Zurück-Geste und moderne Navigationsmuster.
- **Pixel 9a Kompatibilität**: Hardware- und Displayoptimierungen speziell für den 6.3" Bildschirm.

## Tech-Stack

| Ebene / Komponente | Technologie | Details / Zweck |
| --- | --- | --- |
| Betriebssystem | Android | Target SDK 36 (Android 16), Min SDK 24 (Android 7.0) |
| Programmiersprache | Java / AIDL | Hauptanwendungslogik und Interprozesskommunikation (IPC) |
| Build-System | Gradle (v8.6.0 plugin) | Build-Automatisierung des Android-Projekts |
| UI-Framework | Material Design | Android Jetpack (AppCompat, Preference, Material Components) |

## Erste Schritte

### Voraussetzungen
- JDK 17
- Android SDK (API 36 Befehlszeilen-Tools oder Android Studio)
- Ein Android-Gerät mit Android 16 (API 36) oder höher für optimale Kompatibilität.

### Installation & Ausführung
1. Klonen Sie das Repository:
   ```bash
   git clone https://github.com/Almanex/Shelter-fork.git
   cd Shelter-fork
   ```
2. Debug-Version bauen:
   ```bash
   ./gradlew assembleDebug
   ```
3. APK auf dem Gerät installieren:
   ```bash
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```

## Tests ausführen

So führen Sie Unit-Tests aus:
```bash
./gradlew test
```

So führen Sie Instrumentierungstests aus (erfordert ein angeschlossenes Gerät oder einen Emulator):
```bash
./gradlew connectedAndroidTest
```

## Bereitstellung

So erstellen Sie einen produktionsbereiten Release-Build der App:
```bash
./gradlew assembleRelease
```
Die kompilierte APK-Datei befindet sich im Ordner `app/build/outputs/apk/release/`.

Bitte beachten Sie, dass Release-Builds für Android 16 ordnungsgemäß signiert sein müssen, um installiert werden zu können.

### Windows Defender SmartScreen-Warnung
Beim Ausführen von Build-Skripten unter Windows kann eine SmartScreen-Warnung erscheinen. So umgehen Sie diese:
- Klicken Sie auf **Weitere Informationen**
- Klicken Sie auf **Trotzdem ausführen**

## Beteiligung

Beiträge zum Projekt sind willkommen. Bitte beachten Sie unsere Richtlinien und senden Sie Fehlerberichte oder Pull-Requests über GitHub.

## Lizenz

Dieses Projekt ist unter der GNU General Public License v3.0 lizenziert – Details finden Sie in der Datei [LICENSE](../LICENSE).
