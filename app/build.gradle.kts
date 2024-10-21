
plugins {

    id("buildlogic.kotlin-application-conventions")
    id("com.example.gradle.app-settings-plugin")
}

appSettings {
    appName = "MyApp"
    version = "1.0.0"
    environment = "production"
    apiUrl = "https://api.myapp.com"
}

application {
    mainClass.set("com.example.MainKt")
}

tasks.register("runApp") {
    dependsOn("run") // Ensure the default 'run' task is executed

    doLast {
        println("Running Kotlin application...")
    }
}
