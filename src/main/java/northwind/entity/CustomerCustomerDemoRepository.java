package northwind.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerCustomerDemoRepository extends CrudRepository<CustomerCustomerDemo, String> {
	
	List<CustomerCustomerDemo> findByCustomerTypeID(String customerTypeID);
	
	CustomerCustomerDemo findByCustomerID(String id);

}
