FROM openjdk:19-jdk-alpine
COPY target/data_jpa-0.0.1-SNAPSHOT.jar data_jpa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/data_jpa-0.0.1-SNAPSHOT.jar"]