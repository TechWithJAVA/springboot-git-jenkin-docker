FROM openjdk:8
EXPOSE 8081
ADD target/spring-boot-jenkin-docker-integration-test.jar spring-boot-jenkin-docker-integration-test.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkin-docker-integration-test.jar"]