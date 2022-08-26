FROM maven:3.6.0-jdk-11-slim AS build
MAINTAINER Stan Norman <sn0rm8n@gmail.com>

ARG APIKEY
ENV APIKEY=at_5XE12Lr24TfIyYJNMxSdr3ZqmO08T
RUN echo "APIKEY = $APIKEY"

COPY src /home/app
COPY pom.xml /home/app
COPY Jenkinsfile.sh /home/app

RUN mvn -f /home/app/pom.xml install
RUN mvn -f /home/app/pom.xml exec:java -Dexec.mainClass="hello.MacAddress" -Dexec.args="44:38:39:ff:ef:57"
