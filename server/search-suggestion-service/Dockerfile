# we build the image with maven, lightly with alpine, it's name is "build"
FROM maven:3.9.6-eclipse-temurin-17 AS build

# it's our work directory in our container
WORKDIR /app

# we copy the file locally to our container work directory
COPY pom.xml .

# we can have dependencies with our pom, go-offline to pre download all of this
RUN mvn dependency:go-offline

# we copy the file locally to our container work directory
COPY src ./src

# it erase the ancient jar file and make another one
RUN mvn clean package -DskipTests


#we build our runtime image with a java 11 image,lightly with alpine
FROM amazoncorretto:17-alpine3.17

# we use the build of maven, take the jar and paste it to the container in the root of it
COPY --from=build /app/target/*.jar app.jar

# execute it
ENTRYPOINT ["java", "-jar","/app.jar"]