FROM openjdk:17
WORKDIR /square-docker

COPY mvnw .
COPY .mvn .mvn
COPY src src

RUN ./mvnw package
COPY target/*.jar square-docker.jar 
ENTRYPOINT ["java","-jar","/square-docker.jar"]