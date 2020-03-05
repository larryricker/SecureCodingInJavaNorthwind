FROM openjdk:12
ADD build/libs/northwind.jar northwind.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "northwind.jar"]