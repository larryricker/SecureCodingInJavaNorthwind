#!/bin/bash
curl -i -H "Content-Type:application/json" -d '{
	"employeeID":102,"firstName":"Jane","lastName":"Doe","title" : "Associate Java Developer", "titleOfCourtesy" : "Mz.", "birthDate" : "2020-03-03T05:00:00.000+0000", "hireDate" : "2020-03-03T05:00:00.000+0000", "address" : "123 High Street", "city" : "London Bridge", "postalCode" : "85085", "region" : "Arizona", "country" : "USA", "homePhone" : "602-555-1212", "extension" : "1234", "photo" : null, "notes" : "Sympathetic listener", "reportsTo" : 2, "photoPath" : "/opt/wildfly/photos/"}' http://localhost:8080/employees
