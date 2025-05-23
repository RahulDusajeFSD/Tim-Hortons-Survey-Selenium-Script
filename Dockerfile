
#Build
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


#Package
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/SeleniumDemo-0.0.1-SNAPSHOT.jar /usr/local/lib/SeleniumDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/SeleniumDemo-0.0.1-SNAPSHOT.jar"]