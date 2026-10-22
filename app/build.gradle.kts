plugins{
    application
    id("com.gradleup.shadow") version "9.6.1"
}
application {
    mainClass = "io.github.skylinebnr334.Store_BuppanManager.App.Main"
}
dependencies{
    implementation("org.apache.logging.log4j:log4j-core:2.26.1")
    implementation("org.apache.logging.log4j:log4j-api:2.26.1")

}