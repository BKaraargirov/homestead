plugins {
    kotlin("jvm")
    alias(libs.plugins.kotlinPluginSerialization)
}

group = "com.theunderroot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.bundles.springService)
    implementation(project(":sdk"))

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}