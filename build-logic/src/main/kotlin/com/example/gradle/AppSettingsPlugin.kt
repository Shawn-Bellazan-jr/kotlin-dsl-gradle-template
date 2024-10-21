package com.example.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class AppSettingsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        // Register the extension to make it available in build.gradle.kts
        val extension = project.extensions.create("appSettings", AppSettingsExtension::class.java)

        // Register a custom task to print the app information dynamically
        project.tasks.register("printAppInfo") {
            doLast {
                println("App Name: ${extension.appName}")
                println("App Version: ${extension.version}")
                println("API URL: ${extension.apiUrl}")
                println("Environment: ${extension.environment}")
            }
        }

        // Hook into the build process (e.g., after build) to display the app information
        project.tasks.named("build").configure {
            doLast {
                println("\n--- Build Information ---")
                println("App Name: ${extension.appName}")
                println("Version: ${extension.version}")
                println("Environment: ${extension.environment}")
                println("API URL: ${extension.apiUrl}")
                println("-------------------------\n")
            }
        }
    }
}
