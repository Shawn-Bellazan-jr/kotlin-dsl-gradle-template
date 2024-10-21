pluginManagement {
    repositories {
        gradlePluginPortal() // Ensure this is included to resolve Gradle plugins
        mavenCentral()
    }
}
plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"

}

rootProject.name = "kotlin-dsl-gradle-template"
includeBuild("build-logic")
// Include the core subprojects
include("app", "ui", "utilities", "config")

