# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

ADD target/courseWebsite-0.0.1-SNAPSHOT.jar app.jar

# Command to run the JAR file 
ENTRYPOINT ["java", "-jar", "/app.jar"]

# Expose the port that your Spring Boot app runs on
EXPOSE 8080 
