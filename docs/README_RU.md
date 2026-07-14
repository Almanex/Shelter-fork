# Shelter (Форк для Android 16)

*Изолированное пространство для ваших приложений с использованием рабочего профиля Android, оптимизированное для Android 16 (API 36).*

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](../LICENSE)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Target SDK: 36](https://img.shields.io/badge/Target_SDK-36-blue.svg)](https://developer.android.com/about/versions/16)
[![Share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)](https://twitter.com/intent/tweet?text=Check%20out%20this%20awesome%20Android%2016%20Work%20Profile%20isolation%20tool%20Shelter-fork&url=https%3A%2F%2Fgithub.com%2FAlmanex%2FShelter-fork)

## Обзор

Shelter — это бесплатное приложение с открытым исходным кодом (FOSS), которое использует функцию «Рабочий профиль» Android, чтобы предоставить изолированное пространство, в которое вы можете устанавливать или клонировать приложения.

Этот форк был специально адаптирован для Android 16 (API 36) с полной поддержкой Pixel 9a и современными функциями Android, включая сквозной пользовательский интерфейс (Edge-to-Edge), Material You динамические цвета и интеллектуальную обратную навигацию (Predictive Back).

## Ключевые особенности

- **Изоляция рабочего профиля**: установка приложений внутри изолированного профиля, что предотвращает их доступ к данным вашего основного профиля.
- **Заморозка неактивных приложений**: приостановка фоновых приложений внутри рабочего профиля для экономии батареи и предотвращения фоновой активности.
- **Клонирование приложений**: запуск двух копий одного и того же приложения на одном устройстве.
- **Сквозной интерфейс Android 16**: полная поддержка обязательного безрамочного макета в Android 16.
- **Улучшенная навигация**: плавная анимация жестов назад и оптимизация под современные шаблоны навигации.
- **Совместимость с Pixel 9a**: аппаратная оптимизация и адаптация под 6,3-дюймовый дисплей.

## Технологический стек

| Уровень / Компонент | Технология | Описание / Назначение |
| --- | --- | --- |
| Операционная система | Android | Target SDK 36 (Android 16), Min SDK 24 (Android 7.0) |
| Язык программирования | Java / AIDL | Основная логика приложения и межпроцессное взаимодействие (IPC) |
| Сборка проекта | Gradle (v8.6.0 plugin) | Автоматизация сборки Android-приложения |
| UI-библиотека | Material Design | Android Jetpack (AppCompat, Preference, Material Components) |

## Начало работы

### Требования
- JDK 17
- Android SDK (инструменты командной строки API 36 или Android Studio)
- Устройство под управлением Android 16 (API 36) или выше для оптимальной совместимости.

### Установка и запуск
1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/Almanex/Shelter-fork.git
   cd Shelter-fork
   ```
2. Соберите отладочную версию:
   ```bash
   ./gradlew assembleDebug
   ```
3. Установите APK на устройство:
   ```bash
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```

## Запуск тестов

Для запуска модульных тестов:
```bash
./gradlew test
```

Для запуска инструментальных тестов (требуется подключенное устройство или эмулятор):
```bash
./gradlew connectedAndroidTest
```

## Развертывание

Для сборки финального релиза:
```bash
./gradlew assembleRelease
```
Скомпилированный APK-файл будет находиться в `app/build/outputs/apk/release/`.

Обратите внимание, что для тестирования релизных сборок на Android 16 они должны быть подписаны валидной подписью.

### Предупреждение Windows Defender SmartScreen
При запуске вспомогательных скриптов сборки на Windows система может показать предупреждение SmartScreen. Для обхода:
- Нажмите **Подробнее**
- Нажмите **Выполнить в любом случае**

## Участие в разработке

Будем рады вашему участию. Ознакомьтесь с кодовой базой и отправляйте отчеты об ошибках или pull-запросы на GitHub.

## Лицензия

Этот проект лицензируется по лицензии GNU General Public License v3.0 - подробности см. в файле [LICENSE](../LICENSE).
