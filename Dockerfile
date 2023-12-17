FROM openjdk:11

MAINTAINER Bahadur Khan info.bahadur6350@gmail.com

COPY target/spring-boot-docker-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-docker-app.jar"]
