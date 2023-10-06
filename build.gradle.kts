import java.net.URI

plugins {
    kotlin("jvm") version "1.9.10"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "gg.flyte"
version = "0.0.1"

repositories {
    mavenCentral()
    maven {
        url = URI("https://repo.inventivetalent.org/content/groups/public/")
        isAllowInsecureProtocol = true
    }
}

dependencies {
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    implementation("org.spiget:data:1.0.0-SNAPSHOT")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("gg.flyte.spigetWrapper.MainKt")
}