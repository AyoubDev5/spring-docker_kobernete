FROM openjdk:11
WORKDIR /opt
EXPOSE 8080
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java *JAVA_OPTS -jar app.jar