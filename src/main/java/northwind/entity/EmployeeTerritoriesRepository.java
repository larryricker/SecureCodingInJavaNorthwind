package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeTerritoriesRepository extends CrudRepository<EmployeeTerritories, Long> {

	List <EmployeeTerritories> findByTerritoryID(String territoryID);
	EmployeeTerritories findByEmployeeID(long employeeID);
}
