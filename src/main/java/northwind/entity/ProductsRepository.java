package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
	
	List<Products> findByProductName(String productName);
	Products findByProductID(Integer productID);

}
