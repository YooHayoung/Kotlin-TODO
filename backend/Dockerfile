FROM openjdk:20-ea-11
VOLUME /tml
ARG jar_file=build/libs/backend-0.0.2-SNAPSHOT.jar
COPY ${jar_file} backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]