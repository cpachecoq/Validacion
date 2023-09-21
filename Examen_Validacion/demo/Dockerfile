FROM ubuntu:latest
LABEL authors="frioquitoc"

ENTRYPOINT ["top", "-b"]

# Establece la imagen base de Java
FROM openjdk:8-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR en el contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Expone el puerto en el que el microservicio escucha dentro del contenedor
EXPOSE 8080

# Comando para ejecutar el microservicio cuando se inicie el contenedor
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

