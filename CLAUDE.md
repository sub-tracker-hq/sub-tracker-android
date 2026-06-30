# Sub-tracker Android

Native Android app. Kotlin + Jetpack Compose. Consumes sub-tracker-api.

## Stack
- Jetpack Compose, MVVM, Hilt (DI), Retrofit + OkHttp
- Auth: Clerk Android SDK. Tokens in EncryptedSharedPreferences. Biometric.

## Conventions
- Money as BigDecimal, never Double/Float
- Models in core/models/ match the API contract
- Push via FCM

## The contract
- API source of truth: ../sub-tracker-api/api/openapi.yaml

## Workflow
- Branch off `dev`, PR into `dev`. feature/android-*, fix/android-*
- Build/test via ./gradlew