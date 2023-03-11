FROM openjdk:8
VOLUME /tmp
ADD ./target/docker-deploy-test-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Xms256m","-Xmx256m","-jar","/app.jar"]
