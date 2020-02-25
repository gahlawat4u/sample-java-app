FROM openjdk:8-jdk-alpine
#RUN yum -y install java-1.8.0*
COPY ./target/spring-boot-jpa-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
#CMD nohup java -jar spring-boot-jpa-0.0.1-SNAPSHOT.jar &
CMD java -jar spring-boot-jpa-0.0.1-SNAPSHOT.jar
