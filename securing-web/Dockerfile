# Sử dụng JDK 17 chính thức
FROM eclipse-temurin:17-jdk

# Thư mục làm việc trong container
WORKDIR /app

# Copy file jar vào container
COPY target/*.jar app.jar

# Expose cổng chạy Spring Boot
EXPOSE 8080

# Lệnh khởi chạy ứng dụng
ENTRYPOINT ["java","-jar","app.jar"]
