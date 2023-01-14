plugins {
    id(Dependency.Grdle.ANDROID_APPLICATION)
    id(Dependency.Grdle.KOTLIN)
    id(Dependency.Grdle.HILT)
    kotlin(Dependency.Grdle.KAPT)
}

android {
    namespace = "com.highthon.dokgodie_android"
    compileSdk = Versions.COMPILESDK

    defaultConfig {
        applicationId = "com.highthon.dokgodie_android"
        minSdk = Versions.MINSDK
        targetSdk = Versions.TARGETSDK
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.LIFECYCLE)
    implementation(Dependency.AndroidX.LIFECYCLE_VIEWMODEL)
    implementation(Dependency.Compose.ACTIVITY_COMPOSE)
    implementation(Dependency.Compose.COMPOSE)
    implementation(Dependency.Compose.COMPOSE_PREVIEW)
    implementation(Dependency.Compose.COMPOSE_MATERIAL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.ANDROID_JUNIT)
    androidTestImplementation(Dependency.Test.ESPRESSO)
    androidTestImplementation(Dependency.ComposeTest.COMPOSE_JUNIT)
    debugImplementation(Dependency.ComposeTest.COMPOSE_TOOLING)
    debugImplementation(Dependency.ComposeTest.COMPOSE_MANIFEST)
    implementation(Dependency.Library.HILT)
    kapt(Dependency.Library.HILT_COMPILER)
    implementation(Dependency.Library.RETROFIT)
    implementation(Dependency.Library.OKHTTP)
    implementation(Dependency.Library.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Dependency.Library.RETROFIT_CONVERTER_GSON)
}