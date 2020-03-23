package northwind.service;

import java.util.List;

import northwind.entity.Orders;

public interface OrdersService {

	List <Orders> findByCustomerID(String customerID);
	Orders findByOrderID(Long orders);
	List <Orders> findByEmployeeID(String employeeID);
}
