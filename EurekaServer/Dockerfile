FROM gradle:8.10-jdk17-alpine AS build

WORKDIR /app

# Copy project files
COPY . .

# Build the project (this will also install dependencies)
RUN ./gradlew build --no-daemon -x test

# Step 2: Use the official OpenJDK image to run the application
FROM eclipse-temurin:17-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built application jar from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the application port
EXPOSE 8761

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
