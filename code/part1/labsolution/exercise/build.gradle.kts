plugins {
  java
  pmd
}

repositories {
	mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
	testRuntimeOnly("org.junit.platform:junit-platform-console:1.2.0")
}

tasks {
    val treatWarningsAsError =
            listOf("-Xlint:unchecked", "-Xlint:deprecation", "-Werror")

    getByName<JavaCompile>("compileJava") {
        options.compilerArgs = treatWarningsAsError
    }

    getByName<JavaCompile>("compileTestJava") {
        options.compilerArgs = treatWarningsAsError
    }
}
 
val test by tasks.getting(Test::class) {
	useJUnitPlatform {}
}

pmd {
    ruleSets = listOf()
    ruleSetFiles = files("./conf/pmd/ruleset.xml")
}
 
defaultTasks("clean", "test", "pmdMain")
