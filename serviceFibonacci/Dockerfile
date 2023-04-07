FROM openjdk:17
EXPOSE 8282
ADD target/fibonacci-docker.jar fibonacci-docker.jar 
ENTRYPOINT ["java","-jar","/fibonacci-docker.jar"]