#!/bin/bash
echo ""
curl http://localhost:8080/orders/search/findByCustomerID?customerID=VINET
echo ""
curl http://localhost:8080/restorders/search/findByCustomerID?customerID=VINET
echo ""
