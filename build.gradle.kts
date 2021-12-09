plugins {
  application
  id("org.jetbrains.kotlin.jvm") version "1.6.0"
  id("idea")
}

repositories {
  mavenCentral()
}

group = "com.adevinta"

kotlin {
  jvmToolchain {
    (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(17))
  }
}

application {
  mainClass.set("com.adevinta.testproject.infrastructure.ApplicationKt")
}
