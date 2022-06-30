plugins {
    java
}

group = "br.srv.mgs.flow"
version = "flow_TesteMgs"
val skwversion = "4.10b150"
description = "Projeto e-commerce 1.0"

repositories {
    mavenCentral()
    maven {
        url = uri("http://sankhyatec.mgcloud.net.br/api/v4/projects/173/packages/maven")
        name = "GitLab"
        metadataSources {
            artifact()
            mavenPom()
        }
        credentials(HttpHeaderCredentials::class.java) {
            name = "Private-Token"
            value = "YzDkSQZrWVnXYzG1RMQN"
        }
        authentication {
            create<HttpHeaderAuthentication>("header")
        }
    }
}
dependencies {
    testCompile("junit", "junit", "4.12")
    implementation("br.com.sankhya", "mge-modelcore", skwversion)
    implementation("br.com.sankhya", "jape", skwversion)
    implementation("br.com.sankhya", "sanutil", skwversion)
    implementation("br.com.sankhya", "mge-param", skwversion)
    implementation("br.com.sankhya", "sanws", skwversion)
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}