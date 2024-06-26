FROM gradle:8-jdk21 as builder
WORKDIR /
COPY . ./
RUN gradle build

FROM openjdk:21-slim
LABEL authors="marwin.moellers"
COPY --from=builder build/libs .
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod", "/backend-0.0.1-SNAPSHOT.jar"]