# Use the official OpenJDK as a parent image
FROM openjdk:17-jdk-slim

COPY build/libs/vault-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]