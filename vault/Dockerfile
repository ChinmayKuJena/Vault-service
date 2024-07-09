# Use the official OpenJDK as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
# WORKDIR /app
COPY build/libs/vault-0.0.1-SNAPSHOT.jar app.jar

# # Copy the build.gradle and settings.gradle files
# COPY build.gradle settings.gradle /app/

# # Copy the gradle folder
# COPY gradle /app/gradle

# # Copy the source code
# COPY src /app/src

# # Copy the gradlew files
# COPY gradlew /app/
# COPY gradlew.bat /app/

# # Grant execute permission for the gradlew script
# RUN chmod +x gradlew

# # Build the application
# RUN ./gradlew build

# Expose the port the application runs on
EXPOSE 8080

# Run the application
# CMD ["java", "-jar", "build/libs/pratice-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar", "/app.jar"]