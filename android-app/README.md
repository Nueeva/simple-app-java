# Simple Counter App — Android (Java)

[![Build APK](https://github.com/Nueeva/simple-app-java/actions/workflows/build-apk.yml/badge.svg)](https://github.com/Nueeva/simple-app-java/actions/workflows/build-apk.yml)

A clean, minimal Android counter app built with Java. Demonstrates core Android development concepts.

## Features

- **Increment** the counter (green button)
- **Decrement** the counter (red button)
- **Reset** the counter to zero (blue button)
- Counter color changes based on value:
  - 🟢 Green = positive
  - 🔴 Red = negative
  - ⚫ Gray = zero
- State is preserved on screen rotation

## Project Structure

```
android-app/
├── build.gradle                  # Project-level Gradle config
├── settings.gradle               # Project settings
├── gradlew / gradlew.bat         # Gradle wrapper scripts
├── gradle/wrapper/               # Gradle wrapper JAR & properties
└── app/
    ├── build.gradle              # App-level Gradle config
    ├── proguard-rules.pro        # ProGuard rules
    └── src/main/
        ├── AndroidManifest.xml   # App manifest
        ├── java/com/example/simplecounterapp/
        │   └── MainActivity.java # Main activity (logic)
        └── res/
            ├── layout/
            │   └── activity_main.xml          # UI layout
            ├── values/
            │   ├── strings.xml                # String resources
            │   ├── colors.xml                 # Color resources
            │   └── themes.xml                 # App theme
            ├── drawable/
            │   ├── counter_background.xml     # Counter circle shape
            │   └── ic_launcher_foreground.xml # Adaptive icon foreground
            └── mipmap-*/
                ├── ic_launcher.png            # App icon
                └── ic_launcher_round.png      # Round app icon
```

## Requirements

- Android Studio (latest stable) or JDK 17+
- Android SDK 34 (compileSdk)
- Min SDK 24 (Android 7.0 Nougat)

## How to Build & Run

### Using Android Studio

1. Open **Android Studio**
2. Select **Open an existing project**
3. Navigate to the `android-app/` folder and open it
4. Wait for Gradle sync to complete
5. Click **Run ▶** or press `Shift+F10`
6. Choose an emulator or connected device

### Using the Command Line

```bash
cd android-app
chmod +x gradlew
./gradlew assembleDebug
```

The debug APK will be generated at `app/build/outputs/apk/debug/app-debug.apk`.

## CI / CD

A GitHub Actions workflow (`.github/workflows/build-apk.yml`) runs on every push and pull request to `main`. It builds the debug APK and uploads it as a downloadable artifact.

## Tech Stack

| Technology | Version |
|------------|---------|
| Java | 8 |
| Android SDK | 34 (Android 14) |
| Min SDK | 24 (Android 7.0) |
| Gradle | 8.2 |
| Android Gradle Plugin | 8.1.0 |
| Material Components | 1.10.0 |
| ConstraintLayout | 2.1.4 |
