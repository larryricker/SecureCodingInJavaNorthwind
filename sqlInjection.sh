#!/bin/bash
# echo ""
# curl http://localhost:8080/employees/search/findByLastName?lastName=Blow\'or1=1\"  \-\-
# echo ""
# curl http://localhost:8080/restemployees/search/findByLastName?lastName=Blow\'or1=1\"  \-\-
echo ""
curl http://localhost:8080/employees/search/findByLastName?lastName=1Blow\'+OR+1=1--
echo ""
