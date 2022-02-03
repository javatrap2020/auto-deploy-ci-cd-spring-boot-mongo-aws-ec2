FROM openjdk:11
COPY target/*.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]