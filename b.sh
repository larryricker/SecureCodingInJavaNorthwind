#!/bin/bash
cd ../northwind
gradle clean war
cd ../northwindEAR
gradle clean ear deployLocal

