#!/bin/sh
export APIKEY=at_5XE12Lr24TfIyYJNMxSdr3ZqmO08T
mvn install
mvn exec:java -Dexec.mainClass="hello.MacAddress" -Dexec.args="44:38:39:ff:ef:57"
