FROM openjdk:11-jre-slim-buster
WORKDIR /src
COPY build/libs/employee-0.0.1-SNAPSHOT.jar employee-service.jar
ENTRYPOINT [ "java", "-jar", "/src/employee-service.jar" ]