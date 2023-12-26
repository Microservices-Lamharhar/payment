
FROM openjdk:17
WORKDIR /app
ADD target/payment-0.0.1-SNAPSHOT.jar payment.jar 
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "payment.jar"]
