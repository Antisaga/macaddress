FROM maven:3.5.3-jdk-8-alpine
MAINTAINER Stan Norman <sn0rm8n@gmail.com>
ARG APIKEY
ENV APIKEY=at_5XE12Lr24TfIyYJNMxSdr3ZqmO08T
COPY ./. /
COPY src /home/app/src
COPY pom.xml /home/app
WORKDIR /home/app
RUN mvn clean package
RUN mvn exec:java -Dexec.mainClass="hello.MacAddress" -Dexec.args="44:38:39:ff:ef:57"
