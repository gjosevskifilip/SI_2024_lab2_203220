plugins {
    id 'java'
}

group 'com.si_lab'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.7.0'
}

test {
    useJUnitPlatform()
}
