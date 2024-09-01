plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.interactivemap"
    compileSdk = 34

    bundle {
        language {
            enableSplit = false
        }
    }

    defaultConfig {
        applicationId = "com.interactive.map.ust.edu"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
        versionCode = 12
        versionName = "12.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    signingConfigs {
        create("release") {
            keyAlias = "InteractiveMap"
            keyPassword = "interactive"
            storeFile = file("../app/keystore.jks")
            storePassword = "interactive"
        }
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
        buildTypes {
            debug {
                buildConfigField("String", "LOCAL_API_KEY", "\"InteractiveMap_XmqChGp5tPVBVG0t8hP95A4tjIpHJDhPAqQ7eSsijLG93s46EZoV6dFxjRuXVUKndlGsLkDXPcDcstYG0D1DXSmE0OX50ipRq0JGEwXIBG3Ti9Hn7O\"")
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
            release {
                buildConfigField("String", "LOCAL_API_KEY", "\"InteractiveMap_XmqChGp5tPVBVG0t8hP95A4tjIpHJDhPAqQ7eSsijLG93s46EZoV6dFxjRuXVUKndlGsLkDXPcDcstYG0D1DXSmE0OX50ipRq0JGEwXIBG3Ti9Hn7O\"")
                isDebuggable = false
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                signingConfig = signingConfigs.getByName("release")
            }
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
        buildConfig = true
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
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation("androidx.activity:activity-compose:1.9.1")
    implementation(platform("androidx.compose:compose-bom:2024.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("com.google.android.gms:play-services-measurement-api:22.1.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.08.00"))
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
    implementation ("com.google.android.gms:play-services-maps:19.0.0")

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