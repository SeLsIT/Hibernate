plugins {
    id("java")
}

group = "ru.hibernate"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.hibernate.orm:hibernate-core:6.4.4.Final")
    implementation("mysql:mysql-connector-java:6.0.3")
    implementation("org.projectlombok:lombok:+")

}

tasks.test {
    useJUnitPlatform()
}