FROM maven:3.8.3-openjdk-17 AS common

EXPOSE 8080
COPY /src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17
COPY --from=common /home/app/target/Common-1.0-SNAPSHOT.jar /usr/local/lib/Common-1.0-SNAPSHOT.jar

