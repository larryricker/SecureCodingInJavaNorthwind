package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TerritoriesRepository extends CrudRepository<Territories, Long> {
	
	List<Territories> findByTerritoryDescription(String territoryDescription);
	Territories findByTerritoryID(long territoryID);

}
