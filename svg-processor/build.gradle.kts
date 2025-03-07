plugins {
    id("org.jetbrains.kotlin.jvm")
    application
}

application { mainClass = "k4ustu3h.forkicons.helper.ApplicationKt" }

dependencies {
    implementation("com.android.tools:sdk-common:31.8.0")
    implementation("org.dom4j:dom4j:2.1.4")
    implementation("commons-io:commons-io:2.18.0")
}
