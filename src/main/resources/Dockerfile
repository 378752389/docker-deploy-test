FROM java:alpine
VOLUME /tmp
ADD docker-deploy-test-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Xms256m","-Xmx256m","-jar","/app.jar"]
