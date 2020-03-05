package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDemographicsRepository extends CrudRepository<CustomerDemographics, String> {
	
	List<CustomerDemographics> findByCustomerDesc(String customerDesc);
	CustomerDemographics findByCustomerTypeID(String id);

}
