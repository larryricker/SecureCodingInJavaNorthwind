package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {

	List<OrderDetails> findByProductID(Integer productID);
	OrderDetails findByOrderID(Integer orderID);
}
