#!/bin/bash
echo "restcustomers/test"
curl http://localhost:8080/restcustomers/test
echo ""
echo "restcustomers/customer"
curl http://localhost:8080/restcustomers/customer?id=1
echo ""
echo "restcustomers/customers"
curl http://localhost:8080/restcustomers/customers?ids=1,2,3,4
