plugins {
    kotlin("jvm") version "1.9.21" apply false
    alias(libs.plugins.shadow)
    alias(libs.plugins.serialization)
}

allprojects {
    group = "net.itemapi"
    version = "0.1-ALPHA"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://jitpack.io")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://repo.codemc.org/repository/maven-public/")
    }
}