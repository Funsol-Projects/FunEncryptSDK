plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.example.funencryptsdk"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.funencryptsdk"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(files("libs/funsolauthenticationsdk-release.aar"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.github.Funsol-Projects"
                artifactId = "FunEncryptSDK"
                version = "1.0"

                artifact(file("libs/funsolauthenticationsdk-release.aar")) {
                    extension = "aar"
                }
            }
        }
    }
}

