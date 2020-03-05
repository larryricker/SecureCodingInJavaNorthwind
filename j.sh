#!/bin/bash
cd ../northwind
gradle clean shadowJar
java -jar build/libs/northwind.jar