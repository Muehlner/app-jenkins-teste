#
# Build stage
#
FROM maven:3.6.3-jdk-11

COPY target/app-jenkins-1.0.0.jar app-jenkins-1.0.0.jar

ENTRYPOINT ["java", "-jar", "/app-jenkins-1.0.0.jar"]
