plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects
    id("buildlogic.kotlin-common-conventions")

    // Apply the application plugin for building a CLI or JVM application in Kotlin or Java
    application
}

repositories {
    mavenCentral() // Ensure repository is defined for resolving dependencies
}

dependencies {
    implementation(libs.kotlin.stdlib) // Use Kotlin standard library from version catalog
    implementation(libs.commons.text) // Example: Apache Commons Text
}

application {
    // Specify the main class for the application
    mainClass.set("com.example.MainKt") // Replace with your actual main class
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Specify the Java version for the project
    }
}
