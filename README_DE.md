[ English ](README.md) • [ Русский ](README_RU.md) • [ Deutsch ](README_DE.md)

Schutz
===

Shelter ist eine kostenlose und Open-Source-App (FOSS), die die „Arbeitsprofil“-Funktion von Android nutzt, um einen isolierten Bereich bereitzustellen, in dem Sie Apps installieren oder klonen können.

** Bereit für Android 16 **: Dieser Fork wurde speziell für Android 16 (API 36) angepasst und bietet volle Unterstützung für Pixel 9a und moderne Android-Funktionen, einschließlich Edge-to-Edge-Benutzeroberfläche und vorausschauender Back-Navigation.



Funktionen
===

– Installieren von Apps innerhalb eines Arbeitsprofils zur Isolierung
- Apps im Arbeitsprofil „einfrieren“, um zu verhindern, dass sie ausgeführt werden oder aktiviert werden, wenn Sie sie nicht aktiv verwenden
- Installieren von zwei Kopien derselben App auf demselben Gerät

Android 16-Verbesserungen
===

Dieser Fork enthält spezifische Optimierungen für Android 16 (API 36) und Pixel 9a:

### Moderne Benutzeroberfläche
- **Edge-to-Edge-Design**: Volle Unterstützung für die obligatorische Edge-to-Edge-Benutzeroberfläche von Android 16
- **Material You-Integration**: Verbessertes Design mit dynamischen Farben
- **Adaptive Icons**: Unterstützung für das adaptive Icon-System von Android 16

### Navigationsverbesserungen
- **Vorausschauende Zurück-Navigation**: Sanfte Animationen der Zurück-Gesten
- **Gestennavigation**: Optimiert für moderne Android-Navigationsmuster

### Pixel 9a-Optimierung
- **Display-Kompatibilität**: Optimiert für 6,3-Zoll-Display (Auflösung 2424×1080)
- **Leistungsoptimierung**: Verbessert für Pixel 9a-Hardwarespezifikationen
- **Batterieoptimierung**: Verbesserte Energieverwaltung für längere Nutzung


Vorbehalte und bekannte Probleme
===

– Einige Vorbehalte und bekannte Probleme werden während des Einrichtungsprozesses von Shelter besprochen. __Bitte lesen Sie den Text im Einrichtungsassistenten sorgfältig durch__.
- Shelter ist nur so sicher wie die Work Profile-Implementierung des von Ihnen verwendeten Android-Betriebssystems. Einzelheiten finden Sie unter <https://support.google.com/work/android/answer/6191949?hl=en>

### Spezifische Hinweise zu Android 16
- **Mindestanforderungen**: Dieser Fork erfordert Android 16 (API 36) oder höher
- **Edge-to-Edge-Benutzeroberfläche**: Einige ältere benutzerdefinierte ROMs unterstützen die neuen Edge-to-Edge-Anforderungen möglicherweise nicht vollständig
- **Predictive Back**: Benutzerdefinierte Launcher benötigen möglicherweise Updates, um das neue Back-Navigationssystem zu unterstützen

Stand des Projekts, Funktionsanfragen usw.
===

Da Shelter lediglich die von Android bereitgestellten Arbeitsprofil-APIs nutzt, gibt es eine begrenzte Anzahl von Funktionen, die über die App implementiert werden können. Da wir nicht beabsichtigen, ADB-Berechtigungen auszunutzen (oder zu „missbrauchen“), können die Funktionen von Shelter nur eine strikte Teilmenge der offengelegten, nicht privilegierten APIs sein.

Daher beabsichtigen wir nicht, Shelter in Zukunft viele neue Funktionen hinzuzufügen, es sei denn, es werden große Änderungen an den Funktionen der Arbeitsprofil-APIs vorgenommen. Das Tierheim befindet sich derzeit in einem effektiven **Wartungsmodus**. Dennoch ist der Autor weiterhin bestrebt, Shelter regelmäßig **so schnell wie möglich nach der Veröffentlichung an alle neuen Android-Versionen anzupassen** – dazu gehört die Aktualisierung der Ziel-SDK-Ebene, die Anpassung an alle neuen Funktionen oder Einschränkungen, die durch die neue Android-Version eingeführt werden, die Aktualisierung aller Abhängigkeiten usw. Der Autor ist in seinem täglichen Leben immer noch auf Shelter angewiesen, sodass Shelter in absehbarer Zukunft **nicht** zur Abandonware werden wird.

### Android 16 Fork-Status
Dieser Fork stellt eine **proaktive Anpassung** für Android 16 (API 36) dar und implementiert Folgendes:
- **Target SDK 36**: Vollständige Kompatibilität mit den Anforderungen von Android 16
- **Edge-to-Edge-Benutzeroberfläche**: Obligatorische Design-Konformität
- **Predictive Back**: Moderne Navigationsmuster
- **Pixel 9a-Unterstützung**: Hardwarespezifische Optimierungen

Der Fork behält die volle Abwärtskompatibilität bei und berücksichtigt gleichzeitig die neuen Funktionen und Anforderungen von Android 16.


Deinstallation
===

Um Shelter zu deinstallieren, löschen Sie bitte zuerst das Arbeitsprofil unter Einstellungen -> Konten und deinstallieren Sie dann die Shelter-App normal.