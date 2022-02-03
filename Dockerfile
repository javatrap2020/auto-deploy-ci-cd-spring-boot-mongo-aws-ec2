FROM maven:3.6.0-jdk-11-slim AS build
COPY auto-deploy-ci-cd-spring-boot-mongo-aws-ec2 /home/app/sauto-deploy-ci-cd-spring-boot-mongo-aws-ec2
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM openjdk:11-jre-slim
COPY --from=build /home/app/auto-deploy-ci-cd-spring-boot-mongo-aws-ec2/target/*.jar /usr/local/lib/auto-deploy-ci-cd-spring-boot-mongo-aws-ec2-app.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/auto-deploy-ci-cd-spring-boot-mongo-aws-ec2-app.jar"]