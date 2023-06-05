#
# Build stage
#
FROM openjdk:11

COPY target/app-jenkins-1.0.0.jar app-jenkins-1.0.0.jar

ENTRYPOINT ["java", "-jar", "/app-jenkins-1.0.0.jar"]
