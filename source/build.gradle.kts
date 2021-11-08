import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
	kotlin("plugin.jpa") version "1.4.32"
	id("org.springframework.boot") version "2.5.6"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.31"
	kotlin("plugin.spring") version "1.5.31"
	id("org.flywaydb.flyway") version "6.5.0"
	kotlin("plugin.serialization") version "1.5.31"

}

group = "com.rickandmorty"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}
buildscript {
	repositories { mavenCentral() }

	dependencies {
		val kotlinVersion = "1.5.31"
		classpath(kotlin("gradle-plugin", version = kotlinVersion))
		classpath(kotlin("serialization", version = kotlinVersion))
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.5")
	implementation("org.springframework.boot:spring-boot-starter-mustache:2.5.5")
	implementation("org.springframework.boot:spring-boot-starter-web:2.5.5")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
	implementation("org.flywaydb:flyway-core:8.0.1")
	implementation("com.beust:klaxon:5.5")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
	implementation("com.fasterxml.jackson.core:jackson-databind:2.13.0")
	implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.0")
	implementation("com.fasterxml.jackson.core:jackson-core:2.13.0")
	implementation("com.google.code.gson:gson:2.8.9")

	implementation("com.beust:klaxon:5.5")
	implementation("com.jayway.jsonpath:json-path:2.6.0")
	implementation("com.progsbase.libraries:JSON:0.4.0")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
	implementation("com.google.code.gson:gson:2.8.9")
	compileOnly("org.projectlombok:lombok:1.18.22")
	runtimeOnly("mysql:mysql-connector-java:8.0.25")
	runtimeOnly("org.springframework.boot:spring-boot-devtools:2.5.5")
	annotationProcessor("org.projectlombok:lombok:1.18.22")
	testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.5")

	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")



}
repositories {
	mavenCentral()
}



flyway{
	url ="jdbc:mysql://localhost:3306/persondb"
	user ="root" //root
	password= "1qaz1qaz" //1qaz1qaz
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
