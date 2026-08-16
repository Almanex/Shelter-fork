# Shelter Benutzerhandbuch — Android-Apps im Arbeitsprofil isolieren und klonen

> [!NOTE]
> **Kurzübersicht**: Shelter erstellt mithilfe der nativen Android-Arbeitsprofil-Funktion einen isolierten Bereich auf Ihrem Gerät. Die Anwendung ermöglicht es, mehrere Konten derselben App zu nutzen, persönliche Kontakte und Dateien vor Trackern zu schützen, inaktive Apps automatisch einzufrieren und das Arbeitsprofil direkt über die Schnelleinstellungen zu steuern.

## Einführung

Moderne Android-Versionen verfügen über ein integriertes Sicherheitsfeature namens **Arbeitsprofil**, das Apps und deren Daten in einem separaten Container isoliert. Shelter nutzt diese native Funktion ganz ohne Root-Rechte, um Ihnen die volle Kontrolle über App-Isolierung, Sandboxing und Privatsphäre unter Android 16 zu bieten.

Egal ob Sie berufliche und private Konten trennen, unkontrollierte Hintergrundaktivitäten stoppen oder Apps sicher testen möchten: Shelter bietet eine schlanke, quelloffene Lösung.

## Funktionsübersicht

### Arbeitsprofil-Sandboxing
Apps im Shelter-Container laufen vollständig getrennt vom Hauptsystem. Sie haben keinen Zugriff auf Ihre privaten Kontakte, Fotos oder Daten im persönlichen Profil.

### App-Einfrieren und automatischer Ruhezustand
Anstelle aggressiver Task-Killer verwendet Shelter die offiziellen Paket-Aussetzungs-APIs von Android. Eingefrorene Apps können weder Hintergrunddienste starten noch Akku verbrauchen oder Netzwerkverbindungen aufbauen.

- **Automatisches Einfrieren bei Bildschirmsperre**: Friert ausgewählte Apps ein, sobald das Display gesperrt wird.
- **Batch-Einfrieren**: Alle konfigurierten Hintergrundanwendungen mit einem Fingertipp anhalten.

### Schnelleinstellungs-Kacheln (Quick Settings)
Steuern Sie den Container bequem über die Benachrichtigungsleiste:
- **Kachel „Alles einfrieren“**: Friert alle Apps der Auto-Freeze-Liste sofort ein.
- **Kachel „Arbeitsprofil“**: Schaltet den gesamten Container ein oder aus (Ruhemodus), um Benachrichtigungen und Hintergrundprozesse nach Feierabend zu pausieren.

### Nativer Android Photo Picker & Profilübergreifende Freigabe
Die Dateiübertragung zwischen Profilen erfolgt über native Systemdialoge:
- **Android Photo Picker**: Sichere Medienauswahl ohne pauschale Speicherberechtigungen.
- **Systemweites Teilen-Menü**: Nahtloser Austausch von Links, Dateien und Dokumenten zwischen Profilen (`ACTION_SEND`).

### Material 3 Oberfläche
Die Einstellungsansichten nutzen abgerundete Material 3 Karten (16dp), dynamische Material You Farben und moderne Schalter-Elemente.

## Sprachen & Lokalisierung

Shelter passt sich automatisch der Systemsprache Ihres Geräts an:
- **Deutsch** (Vollständige Übersetzung)
- **English** (Englisch)
- **Russisch** (Русский)
- Weitere Sprachen über Community-Beiträge.

## Schritt-für-Schritt Schnellstartanleitung

1. **Schritt 1: Shelter installieren** — Laden Sie die APK herunter und installieren Sie sie auf Ihrem Gerät mit Android 14, 15 oder 16.
2. **Schritt 2: Ersteinrichtung durchführen** — Öffnen Sie Shelter und folgen Sie dem Einrichtungsassistenten, um das Arbeitsprofil zu erstellen.
3. **Schritt 3: Apps klonen oder installieren** — Wählen Sie im Reiter „Hauptprofil“ die zu klonenden Apps aus oder installieren Sie eigenständige APK-Dateien über das Menü.
4. **Schritt 4: Automatisches Einfrieren einrichten** — Aktivieren Sie unter Einstellungen -> Auto-Freeze-Dienst das Aussetzen bei Bildschirmsperre für gewünschte Apps.
5. **Schritt 5: Kacheln hinzufügen** — Ziehen Sie die Kacheln „Alles einfrieren“ und „Arbeitsprofil“ in Ihre aktive Schnelleinstellungsleiste.

## Tipps & Tastenkürzel

| Funktion / Aktion | Methode | Beschreibung |
| --- | --- | --- |
| Startbildschirm-Verknüpfung | Langer Druck auf App im Shelter-Reiter | Erstellt ein App-Symbol mit Arbeitssymbol auf dem Startbildschirm |
| Reaktivieren & Starten | Tippen auf eingefrorene App | Reaktiviert die App automatisch und öffnet sie |
| Schnell-Einfrieren | Schnelleinstellungs-Kachel | Friert Hintergrund-Apps ein, ohne Shelter zu öffnen |
| Ruhemodus aktivieren | Arbeitsprofil-Kachel | Schaltet das gesamte Arbeitsprofil vorübergehend ab |
| Dateien übertragen | 3-Punkte-Menü -> Dateien teilen | Öffnet das Teilen-Menü zur profilübergreifenden Übertragung |

## Häufig gestellte Fragen (FAQ)

### Warum hat „Alles einfrieren“ nur eine App eingefroren?
Die Aktion friert Apps ein, die in der Auto-Freeze-Liste markiert sind. Tippen Sie im Reiter „Shelter“ auf eine App und wählen Sie „Automatisches Einfrieren“, um sie hinzuzufügen.

### Was ist der Unterschied zwischen Einfrieren und Arbeitsprofil ausschalten?
Das Einfrieren hält nur ausgewählte Apps an, während wichtige Messenger aktiv bleiben. Das Ausschalten des Profils deaktiviert den kompletten Container inklusive aller Dienste.

### Kann Shelter auf meine privaten Dateien zugreifen?
Nein. Shelter verlangt keine pauschalen Speicherberechtigungen (`MANAGE_EXTERNAL_STORAGE` oder `SYSTEM_ALERT_WINDOW`). Dateien werden ausschließlich über den System-Picker geteilt.

## Community & Unterstützung

Shelter ist ein freies Open-Source-Projekt. Bei Fragen, Fehlermeldungen oder Verbesserungsvorschlägen:
- Repository auf GitHub markieren: [Almanex/Shelter-fork](https://github.com/Almanex/Shelter-fork)
- Probleme über den GitHub Issue Tracker melden.
- Pull-Requests für neue Funktionen einreichen.
