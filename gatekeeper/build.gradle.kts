plugins {
    kotlin("jvm")
    alias(libs.plugins.springBoot)
    alias(libs.plugins.kotlinSpring)
}

group = "com.theunderroot"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.springCloudStarterGateway)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}