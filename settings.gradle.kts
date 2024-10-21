// Root settings.gradle.kts
pluginManagement {
    // Include 'plugins build' to define convention plugins.
    includeBuild("build-logic")

}

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
dependencyResolutionManagement {
//    includeBuild("samples/composite-build")

}

rootProject.name = "kotlin-dsl-gradle-template"

// Include the core subprojects
include("app", "ui", "utilities", "config")

