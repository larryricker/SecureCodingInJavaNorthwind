#!/bin/bash
echo "test"
curl http://localhost:8080/customers/test
echo ""
echo "customer"
curl http://localhost:8080/customers/customer?id=1
echo ""
echo "customers"
curl http://localhost:8080/customers/customers?ids=1,2,3,4
