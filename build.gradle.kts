plugins {
    java
    id("net.serenity-bdd.serenity-gradle-plugin") version "4.2.22"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("net.serenity-bdd:serenity-core:4.2.22")
    testImplementation("net.serenity-bdd:serenity-junit:4.2.22")
    implementation("net.serenity-bdd:serenity-screenplay:4.2.22")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:4.2.22")
    implementation("net.serenity-bdd:serenity-cucumber:4.2.22")
    implementation("net.serenity-bdd:serenity-ensure:4.2.22")
    implementation("net.serenity-bdd:serenity-reports:4.2.22")

    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnit()
    systemProperty("file.encoding", "UTF-8")
    testLogging {
        events("passed", "skipped", "failed")
    }
}

serenity {
    reports = listOf("single-page-html", "html", "json")
}
