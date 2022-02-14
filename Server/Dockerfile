FROM openjdk:11-jre-slim-buster
WORKDIR /src
COPY build/libs/server-0.0.1-SNAPSHOT.jar server-application.jar
ENTRYPOINT [ "java", "-jar", "/src/server-application.jar"]