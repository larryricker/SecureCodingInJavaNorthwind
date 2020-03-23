#!/bin/bash
echo ""
curl http://localhost:8080/orders/search/findByOrderID/10248
echo ""
curl http://localhost:8080/restorders/search/findByOrderID/10248
echo ""
