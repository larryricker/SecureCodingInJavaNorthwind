package northwind.service;

import java.util.List;

import northwind.entity.Customers;

public interface CustomersService {

	List<Customers> findByContactName(String contactName);
	List<Customers> findByCompanyName(String companyName);
	Customers findByCustomerID(String customerID);
}
