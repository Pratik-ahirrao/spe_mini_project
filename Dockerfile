FROM openjdk:11
COPY ./target/temp-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","temp-1.0-SNAPSHOT-jar-with-dependencies.jar"]