# Use a lightweight OpenJDK image to run the application
FROM openjdk:17-jdk-slim

# Set the working directory in the runtime container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY ./target/csm-migration-client-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run the JAR file
CMD ["java", "-jar", "app.jar"]
