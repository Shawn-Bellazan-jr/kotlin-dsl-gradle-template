// build-logic/src/main/kotlin/buildlogic.kotlin-application-conventions.gradle.kts

plugins {
    id("buildlogic.kotlin-common-conventions")
    application // Apply the application plugin for running applications
}

application {
    // Define the main class for the application, if applicable
    mainClass.set("com.example.MainKt")
}

sourceSets {
    main {
        kotlin {
            srcDir("src/main/kotlin")
        }
    }
}

dependencies {
    // Add standard Kotlin dependencies
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.21")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.example.MainKt" // Ensure the jar file can be executed
    }
}
