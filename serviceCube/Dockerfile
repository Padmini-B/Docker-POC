FROM openjdk:17
WORKDIR /cube-docker

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw package
CMD target/*.jar cube-docker.jar 
ENTRYPOINT ["java","-jar","/cube-docker.jar"]
