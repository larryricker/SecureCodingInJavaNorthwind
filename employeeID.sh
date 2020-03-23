#!/bin/bash
echo ""
curl http://localhost:8080/orders/search/findByEmployeeID?employeeID=5
echo ""
curl http://localhost:8080/restorders/search/findByEmployeeID?employeeID=5
echo ""
