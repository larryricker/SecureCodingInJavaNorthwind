package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long> {
	
	List<Customers> findByCompanyName(String companyName);
	Customers findByCustomerID(String id);

}
