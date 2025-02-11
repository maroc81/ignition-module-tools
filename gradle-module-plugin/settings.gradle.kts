enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
// lets us use 'version catalogs': https://docs.gradle.org/7.0/release-notes.html
enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "gradle-module-plugin"

include(":")

includeBuild("../generator")
