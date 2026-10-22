plugins{
    `java-library`
}
dependencies{
    // Source: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation("org.junit.jupiter:junit-jupiter-api:6.1.3")
    // Source: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
    testImplementation("org.junit.jupiter:junit-jupiter-engine:6.1.3")

    // Source: https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.1.3")
}
tasks {
    test {
        useJUnitPlatform();
    }
}