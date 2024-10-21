plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])

        }

    }
}

gradlePlugin {
    plugins {
        create("appSettingsPlugin") {
            id = "com.example.gradle.app-settings-plugin"
            implementationClass = "com.example.gradle.AppSettingsPlugin"
        }
    }
}

//publishing {
//    publications {
//        create<MavenPublication>("pluginMaven") {
//            // Only include a single component to avoid the error
//            from(components["kotlin"]) // If this is a Gradle plugin, the 'java' component is typically used
//        }
//    }
//
//}
