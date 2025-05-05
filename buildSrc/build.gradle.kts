plugins {
  // The Kotlin DSL plugin provides a convenient way to develop convention plugins.
  // Convention plugins are located in `src/main/kotlin`, with the file extension `.gradle.kts`,
  // and are applied in the project's `build.gradle.kts` files as required.
  `kotlin-dsl`
}

kotlin {
  jvmToolchain(21)
}

dependencies {
  // Add a dependency on the Kotlin Gradle plugin, so that convention plugins can apply it.
  implementation(libs.kotlinGradlePlugin)
}

allprojects {
  apply {
      plugin("project-report")
  }
}
tasks.register("projectReportAll") {
    // All project reports of subprojects
    allprojects.forEach {
        dependsOn(it.tasks.get("projectReport"))
    }

    // All projectReportAll of included builds
    gradle.includedBuilds.forEach {
        dependsOn(it.task(":projectReportAll"))
    }
}