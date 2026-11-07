plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation(platform("org.junit:junit-bom:6.1.3"))         // ensures version alignment
    testImplementation("org.junit.jupiter:junit-jupiter")              // JUnit Jupiter API + engine
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")      // JUnit Platform launcher (required in Gradle 9+)
}
tasks.test {
    useJUnitPlatform()
}
tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "9.9.0"
}
