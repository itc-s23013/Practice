plugins {
    kotlin("jvm") version "1.9.23"
}

group = "jp.ac.it_college_std.s23013"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}