# Gradle Kotlin DSL Setup Information

This directory contains the **Gradle Kotlin DSL** configuration files and settings for the project. The build is managed using **Kotlin DSL** rather than Groovy, and the project uses several key tools and libraries. Below is an overview of the tools and libraries used, along with the latest available versions as of September 2024.

## Tool and Library Versions

### Gradle
- **Current Version**: 8.10.2
- **Latest Release**: [Gradle Releases Page](https://gradle.org/releases/)

Make sure the project uses the latest version of Gradle to leverage performance improvements, new features, and bug fixes. Gradle wrapper configuration is managed in Kotlin DSL.

### Kotlin
- **Current Version**: Managed via `build.gradle.kts` or `libs.versions.toml`.
- **Latest Release**: [Kotlin Releases Documentation](https://kotlinlang.org/docs/releases.html)

Kotlin is updated regularly, with major releases every six months. Make sure your project uses the latest version to take advantage of new language features and tooling improvements.

### ktlint
- **Current Version**: Managed in the build script using Kotlin DSL.
- **Latest Release**: [ktlint GitHub Releases](https://github.com/pinterest/ktlint/releases)

`ktlint` is a Kotlin linter that helps enforce consistent code style. The latest version should be used for proper code formatting and bug fixes.

### JUnit
- **Current Version**: Managed through Kotlin DSL in the test module.
- **Latest Release**: [JUnit 5 Release Notes](https://junit.org/junit5/docs/current/release-notes/index.html)

JUnit 5 is the main testing framework for the project. Be sure to stay up to date to utilize the newest testing features and bug fixes.

### XMLUnit
- **Current Version**: Managed through Kotlin DSL in the test module.
- **Latest Release**: [XMLUnit GitHub Releases](https://github.com/xmlunit/xmlunit/releases)

XMLUnit is used to test XML-related functionality. Keeping it up to date ensures you have the latest improvements for testing XML.

---

## Updating Versions Using Kotlin DSL

To update the versions of these tools and libraries, follow these steps:

1. **Check for the Latest Versions** using the links above.
2. **Update the Version Catalog** (preferred method):
   If you are using **Version Catalogs**, you can update the dependency versions in `gradle/libs.versions.toml`:

   Example:

   ```toml
   [versions]
   kotlin = "1.8.0"
   junit = "5.8.0"
   ktlint = "10.2.1"
   xmlunit = "2.9.0"

   [libraries]
   kotlin-stdlib = { module = "org.jetbrains.kotlin:kotlin-stdlib", version.ref = "kotlin" }
   junit-jupiter = { module = "org.junit.jupiter:junit-jupiter-api", version.ref = "junit" }

   [plugins]
   kotlin-jvm = { id = "org.jetbrains.kotlin.jvm", version.ref = "kotlin" }
   ktlint = { id = "org.jlleitschuh.gradle.ktlint", version.ref = "ktlint" }
   ```

3. **Directly Modify the Kotlin DSL `build.gradle.kts`** files if not using a version catalog. Update the dependency versions in your respective `build.gradle.kts` files.

4. **Update the Gradle Wrapper** to the latest version:
   Run the following command to update the Gradle wrapper to the latest version:

   ```bash
   ./gradlew wrapper --gradle-version=<latest-version>
   ```

5. **Verify the build**: After updating, run the Gradle build to ensure everything works properly:

   ```bash
   ./gradlew build
   ```

---

## Version Catalogs in Kotlin DSL

In Kotlin DSL, version management is more streamlined using **Version Catalogs**. You can define versions for libraries and plugins in the `gradle/libs.versions.toml` file, making updates easier across multiple subprojects.

Example:

```toml
[versions]
kotlin = "1.8.0"
junit = "5.8.0"
ktlint = "10.2.1"
xmlunit = "2.9.0"

[libraries]
kotlin-stdlib = { module = "org.jetbrains.kotlin:kotlin-stdlib", version.ref = "kotlin" }
junit-jupiter = { module = "org.junit.jupiter:junit-jupiter-api", version.ref = "junit" }

[plugins]
kotlin-jvm = { id = "org.jetbrains.kotlin.jvm", version.ref = "kotlin" }
ktlint = { id = "org.jlleitschuh.gradle.ktlint", version.ref = "ktlint" }
```

This centralized approach ensures consistency and reduces redundancy across subprojects.

---

### Helpful Links:
- **Gradle Documentation**: [https://docs.gradle.org](https://docs.gradle.org)
- **Kotlin Documentation**: [https://kotlinlang.org/docs/](https://kotlinlang.org/docs/)
- **ktlint Documentation**: [https://github.com/pinterest/ktlint](https://github.com/pinterest/ktlint)
- **JUnit 5 Documentation**: [https://junit.org/junit5/docs/current/user-guide/](https://junit.org/junit5/docs/current/user-guide/)
- **XMLUnit Documentation**: [https://github.com/xmlunit/xmlunit](https://github.com/xmlunit/xmlunit)

