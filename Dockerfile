FROM openjdk:17

WORKDIR /app

COPY target/HealthProject1Yr3-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "HealthProject1Yr3-0.0.1-SNAPSHOT.jar"]