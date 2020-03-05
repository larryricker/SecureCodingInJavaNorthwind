package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
	
	List<Orders> findByCustomerID(String customerID);
	List<Orders> findByEmployeeID(Integer employeeID);
	Orders findByOrderID(long orderID);

}
