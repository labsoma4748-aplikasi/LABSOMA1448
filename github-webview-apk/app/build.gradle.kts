plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

val appUrl = "https://script.google.com/macros/s/AKfycbx7KU5Qd0lJ1PIKLwGW0pehL394vXeo8_KGMVynjfbpGGvsvS8OXe3F2_eizPu_UrBc/exec"

android {
    namespace = "com.pribadi.webview"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.pribadi.webview"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        buildConfigField("String", "APP_URL", "\"$appUrl\"")
    }

    buildFeatures {
        buildConfig = true
    }
}
