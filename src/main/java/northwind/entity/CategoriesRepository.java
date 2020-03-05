package northwind.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories, Long> {
	
	List<Categories> findByCategoryName(String categoryName);
	Categories findByCategoryID(long categoryID);

}
