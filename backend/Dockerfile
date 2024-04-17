FROM openjdk:17-jdk-slim
RUN mkdir /app
WORKDIR /app
EXPOSE 8081
ADD ./target/backend-1.0.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]