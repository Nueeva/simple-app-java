# Simple Counter App — Android (Java)

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
└── app/
    ├── build.gradle              # App-level Gradle config
    └── src/main/
        ├── AndroidManifest.xml   # App manifest
        ├── java/com/example/simplecounterapp/
        │   └── MainActivity.java # Main activity (logic)
        └── res/
            ├── layout/
            │   └── activity_main.xml     # UI layout
            ├── values/
            │   ├── strings.xml           # String resources
            │   ├── colors.xml            # Color resources
            │   └── themes.xml            # App theme
            └── drawable/
                └── counter_background.xml # Counter circle shape
```

## Requirements

- Android Studio (latest stable)
- Android SDK 24+ (Android 7.0 Nougat)
- Java 8

## How to Build & Run

1. Open **Android Studio**
2. Select **Open an existing project**
3. Navigate to the `android-app/` folder and open it
4. Wait for Gradle sync to complete
5. Click **Run ▶** or press `Shift+F10`
6. Choose an emulator or connected device

## Tech Stack

| Technology | Version |
|------------|---------|
| Java | 8 |
| Android SDK | 34 (Android 14) |
| Min SDK | 24 (Android 7.0) |
| Gradle | 8.1.0 |
| Material Components | 1.10.0 |
| ConstraintLayout | 2.1.4 |
