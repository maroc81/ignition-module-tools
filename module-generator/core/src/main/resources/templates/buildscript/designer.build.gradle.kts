plugins {
    id "java-library"
}

sourceCompatibility = JavaVersion.VERSION_11
targetCompatibility = JavaVersion.VERSION_11

dependencies {
    compileOnly("com.inductiveautomation.ignitionsdk:designer-api:${sdk_version}")
    compileOnly("com.inductiveautomation.ignitionsdk:ignition-common:${sdk_version}")
}