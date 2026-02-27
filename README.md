# simple-app-java

[![Build APK](https://github.com/Nueeva/simple-app-java/actions/workflows/build-apk.yml/badge.svg)](https://github.com/Nueeva/simple-app-java/actions/workflows/build-apk.yml)

A simple Android counter application built with Java.

## Android App

The Android project lives in the [`android-app/`](android-app/) directory. It is a minimal counter app that demonstrates core Android concepts like click listeners, state preservation, and Material Design theming.

See the [Android app README](android-app/README.md) for full details on features, project structure, and build instructions.

### Quick Start

```bash
cd android-app
chmod +x gradlew
./gradlew assembleDebug
```

The debug APK is output to `android-app/app/build/outputs/apk/debug/app-debug.apk`.

## CI / CD

A GitHub Actions workflow builds the debug APK on every push and pull request to `main` and uploads it as a downloadable artifact.
