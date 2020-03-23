package northwind.service;

import java.util.List;

import northwind.entity.Suppliers;

public interface SuppliersService {

	List<Suppliers> findByCompanyName(String companyName);
	List<Suppliers> findByContactName(String companyName);
	Suppliers findBySupplierID(long supplierID);
}
