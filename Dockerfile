# Step 1: Use an official Gradle image with Gradle 8.8 and JDK 22 as the base image
FROM gradle:8.8-jdk22 AS build

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the Gradle wrapper and project files into the container
COPY gradlew ./
COPY gradle/ ./gradle
COPY build.gradle settings.gradle ./

# Step 4: Copy the rest of your application source code
COPY src/ ./src

# Step 5: Build the application using Gradle
RUN gradle build --no-daemon

#Step 6: Run to build Jar 
RUN gradle BuildJar --no-daemon
RUN gradle copyResources --no-daemon
RUN gradle createZip --no-daemon

# Step 7: Use a smaller base image for the final application
FROM openjdk:22-jdk

# Step 8: Copy the built JAR from the build stage
COPY --from=build /app/build/libs/blackfriday-1.0-SNAPSHOT.jar /app/blackfriday.jar

# Step 9: Set the entry point for the container to run the CLI application
ENTRYPOINT ["java", "-jar", "/app/blackfriday.jar"]

# Optional: If you want to pass arguments to your CLI application
#CMD ["arg1", "arg2"]
