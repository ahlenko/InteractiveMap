plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.interactivemap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.interactive.map.ust.edu"
        minSdk = 24
        targetSdk = 34
        versionCode = 3
        versionName = "3.0"

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
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Default dependency
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.2")
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2024.06.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("com.google.android.gms:play-services-measurement-api:22.0.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.06.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation("androidx.compose.material:material:1.6.8")
    implementation ("androidx.compose.foundation:foundation:1.6.8")
    implementation ("com.jakewharton.threetenabp:threetenabp:1.3.0")
    implementation ("com.google.accompanist:accompanist-permissions:0.34.0")

    // Moshi dependency
    implementation ("com.squareup.moshi:moshi:1.12.0")
    implementation ("com.squareup.moshi:moshi-adapters:1.12.0")
    implementation ("com.squareup.moshi:moshi-kotlin:1.12.0")

    // Dialog dependency
    implementation ("com.maxkeppeler.sheets-compose-dialogs:core:1.2.1")
    implementation ("com.maxkeppeler.sheets-compose-dialogs:list:1.2.1")
    implementation ("com.maxkeppeler.sheets-compose-dialogs:calendar:1.2.1")

    // Google maps dependency
    implementation ("com.google.maps.android:maps-compose:2.11.5")
    implementation ("com.google.android.gms:play-services-maps:18.2.0")

    // Retrofit dependency
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:okhttp:4.10.0")

    // Glide dependency
    implementation ("com.github.bumptech.glide:glide:4.15.1")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")

    // GSON dependency
    implementation("com.google.code.gson:gson:2.10.1")
}