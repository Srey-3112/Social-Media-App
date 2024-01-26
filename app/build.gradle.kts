plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.social_media_app"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.social_media_app"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding=true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.github.iammert:ReadableBottomBar:0.2")
    implementation ("com.github.florent37:diagonallayout:1.0.9")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("com.github.MrNouri:DynamicSizes:1.0")
}