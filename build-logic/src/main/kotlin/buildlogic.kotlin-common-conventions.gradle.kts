plugins {
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    mavenCentral()
    google() // If needed for Android libraries or applications
}

dependencies {
    // Define dependency versions as constraints
    constraints {
        implementation("org.apache.commons:commons-text:1.12.0") // Use version defined in version catalog
    }
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.11.3")
        }
    }
}

kotlin {
    jvmToolchain(17)
}
