package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface SuppliersRepository extends CrudRepository<Suppliers, Long> {
	
	List<Suppliers> findByCompanyName(String companyName);
	Suppliers findBySupplierID(long supplierID);

}
