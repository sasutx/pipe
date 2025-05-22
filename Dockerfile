FROM openjdk:17
EXPOSE 8080
ADD target/pipelocux.jar pipelocux.jar
ENTRYPOINT ["java", "-jar", "pipelocux.jar"]