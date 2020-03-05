package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShippersRepository extends CrudRepository<Shippers, Long> {
	
	List<Shippers> findByCompanyName(String companyName);
	Shippers findByShipperID(long shipperID);

}
