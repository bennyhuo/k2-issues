plugins {
    java
    kotlin("jvm") version "1.9.20"
}

group = "com.bennyhuo.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":library"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
