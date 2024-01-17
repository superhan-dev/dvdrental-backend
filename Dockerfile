FROM openjdk:17-jdk-alpine

VOLUME [ "/data" ]

COPY build/libs/*.jar app.jar

ENTRYPOINT [ "java", "-jar", "/app.jar" ]
