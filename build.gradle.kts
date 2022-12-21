plugins {
    id("java")
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}