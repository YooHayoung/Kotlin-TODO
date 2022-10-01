FROM openjdk:20-ea-11
VOLUME /tml
COPY build/libs/backend-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]