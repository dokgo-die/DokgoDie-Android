object Dependency {
    object Grdle {
        const val ANDROID_APPLICATION = "com.android.application"
        const val ANDROID_LIBRARY = "com.android.library"
        const val KOTLIN = "org.jetbrains.kotlin.android"
        const val HILT = "com.google.dagger.hilt.android"
        const val KAPT = "kapt"
    }

    object Compose {
        const val ACTIVITY_COMPOSE =
            "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
        const val COMPOSE = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val COMPOSE_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val COMPOSE_MATERIAL =
            "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL}"
        const val COMPOSE_ICON =
            "androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
    }

    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_VIEWMODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VIEWMODEL}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    }

    object ComposeTest {
        const val COMPOSE_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val COMPOSE_MANIFEST = "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE}"
    }

    object Library {
        const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
        const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"
        const val EXOPLAYER =
            "com.google.android.exoplayer:exoplayer:${Versions.EXOPLAYER}"
        const val PAGER = "com.google.accompanist:accompanist-pager:${Versions.PAGER}"
        const val PAGER_INDICATORS = "com.google.accompanist:accompanist-pager-indicators:${Versions.PAGER}"

    }
}