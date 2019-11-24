FROM openjdk:12-jdk-alpine
VOLUME /tmp
ADD ./build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.awt.headless=true","-Duser.timezone=America/Bogota","-jar","/app.jar"]