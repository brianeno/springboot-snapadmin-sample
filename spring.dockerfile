#FROM openjdk:17-alpine
FROM openjdk:21-slim-bullseye

#RUN addgroup -S spring && adduser -S spring -G spring

#USER spring:spring

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]