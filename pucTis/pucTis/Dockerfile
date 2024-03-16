FROM maven:3.9.5-amazoncorretto-17 as build
WORKDIR /pucTis
COPY . .
RUN mvn clean package -X -DskipTests

FROM openjdk:17-ea-10-jdk-slim
WORKDIR /pucTis
COPY --from=build ./pucTis/target/*.jar ./pucTis-0.0.1-SNAPSHOT.jar
ENTRYPOINT java -jar pucTis-0.0.1-SNAPSHOT.jar



