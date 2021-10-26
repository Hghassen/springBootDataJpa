FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/spring-boot-data-jpa-entity-13.0.jar spring-boot-data-jpa-entity-13.0.jar
ENTRYPOINT ["java","-jar","/spring-boot-data-jpa-entity-13.0.war"]