#!/bin/bash
curl -i -H "Content-Type:application/json" -d '{"firstName":"Joe","lastName":"Blow"}' http://localhost:8080/employees
