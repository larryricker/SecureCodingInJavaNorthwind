package northwind.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees, Long> {

	List<Employees> findByLastName(String lastName);
	Employees findByEmployeeID(long employeeID);
	
	@Query(value = "SELECT e FROM Employees e ORDER BY e.employeeID")
	List<Employees> findAllEmployeesWithPagination();

	@Query(value = "FROM Employees e WHERE UPPER(firstName) LIKE %?#{[0].toUpperCase()}%")
	List<Employees> findByFirstNameContainingIgnoringCase(String firstName);

	
}
