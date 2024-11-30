FROM openjdk:17-jdk-slim

WORKDIR /app

COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

COPY target/mentor-diana-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["/wait-for-it.sh", "localhost:5432", "--", "java", "-jar", "app.jar"]
