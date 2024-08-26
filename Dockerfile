FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8080
COPY target/*.jar CourseApp.jar
ENTRYPOINT ["java","-jar","/app/CourseApp.jar"]