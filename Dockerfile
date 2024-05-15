FROM openjdk:21-slim
LABEL authors="marwin.moellers"
COPY build/libs .
ENTRYPOINT ["java","-jar","/backend-0.0.1-SNAPSHOT.jar"]