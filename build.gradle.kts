import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "com.andreaseisele"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val slf4jVersion = "1.7.32"
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("ch.qos.logback:logback-classic:1.2.7")
    implementation("io.github.microutils:kotlin-logging:2.0.11")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")

    val kotestVersion = "5.0.0.M3"
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}