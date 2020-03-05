package northwind.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeesRestRepository extends PagingAndSortingRepository<Employees, Short> {
	List<Employees> findByEmployeeID(@Param("employeeID") Short employeeID);
	List<Employees> findByLastName(@Param("lastName") String lastName);
	List<Employees> findByFirstName(@Param("firstName") String firstName);
	
	@Query(value = "SELECT e FROM Employees e ORDER BY EmployeesID")
	Page<Employees> findAllEmployeesWithPagination(Pageable pageable);
	
}
