FROM openjdk:17
WORKDIR /cube-docker

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN chmod +x mvnw
RUN ./mvnw package
ADD target/*.jar cube-docker.jar 
CMD ["java","-jar","/cube-docker.jar"]
