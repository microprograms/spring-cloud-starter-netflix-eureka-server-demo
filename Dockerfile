FROM openjdk:8-jre
ADD target/spring-cloud-starter-netflix-eureka-server-demo-1.0.0.jar app.jar
EXPOSE 8761
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]