plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
}

extra.apply {
    set("precomposeVersion", "1.5.1")

    set("jvmTarget", "11")

    // Android configurations
    set("android-compile", 34)
    set("android-build-tools", "34.0.0")
    set("androidMinSdk", 21)
    set("androidTargetSdk", 34)

    // Js & Node
    set("webpackCliVersion", "5.1.4")
    set("nodeVersion", "16.13.0")

    set("ktlintVersion", "0.50.0")
}