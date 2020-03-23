package northwind.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restorders", path = "restorders")
public interface OrdersRestRepository extends PagingAndSortingRepository<Orders, Long> {

	@Query("SELECT o FROM Orders o WHERE orderID = :orderID")
	Orders findByOrderID(@Param("orderID") Long orderID);
	
	// working query in pgAdmin tool:
	// select * from public.orders where "CustomerID" = 'VINET'
	// @Query(value = "select * from public.orders where \"CustomerID\" = \':customerID\'", nativeQuery = true) // not found
	@Query("SELECT o FROM Orders o WHERE customerID = :customerID")
	List<Orders> findByCustomerID(@Param("customerID") String customerID);
	
	@Query("SELECT o FROM Orders o WHERE employeeID = :employeeID")
	List<Orders> findByEmployeeID(@Param("employeeID") Integer employeeID);
	
}
