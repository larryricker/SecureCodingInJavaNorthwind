#!/bin/bash
cd ../northwind
gradle clean shadowJar
docker build -f Dockerfile -t 'nor†hwind' .
docker run -p 8080:8080 northwind
