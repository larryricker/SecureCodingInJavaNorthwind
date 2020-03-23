#!/bin/bash
echo ""
curl http://localhost:8080/orders/search/findByCustomerID?customerID=VINET+OR+1=1--
echo ""
curl http://localhost:8080/restorders/search/findByCustomerID?customerID=VINET+OR+1=1--
echo ""
