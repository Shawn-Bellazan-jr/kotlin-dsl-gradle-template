
// build-logic/build.gradle.kts

plugins {
    `kotlin-dsl` // Enables Kotlin DSL support
}


repositories {
    mavenCentral()
    gradlePluginPortal()
}


dependencies {
    implementation(libs.kotlin.gradle.plugin)
}


