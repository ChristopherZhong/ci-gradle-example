plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.junit.jupiter:junit-jupiter:6.1.3")
}
tasks.test {
    useJUnitPlatform()
}
tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "9.9.0"
}
