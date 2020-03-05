//package northwindWeb;
//
//import java.io.Serializable;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.ManagedBean;
//import javax.enterprise.context.SessionScoped;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import northwind.entity.NorthwindDataJpaApplication;
//import northwind.entity.Categories;
//import northwind.entity.CategoriesRepository;
//import northwind.entity.Employees;
//import northwind.entity.EmployeesRepository;
//
//
//@ManagedBean(value="employees")
//@SessionScoped
//public class EmployeesBean implements Serializable {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//
//	private static final Logger LOGGER = LogManager.getLogger(EmployeesBean.class.getClass());
//
//	@Autowired
//	EmployeesRepository repository;
//	
//	public List<Employees> getEmployeesList() throws SQLException{
//		
//		List<Employees> employeesList = new ArrayList<Employees>();
//		LOGGER.info("Employees found with findAll()");
//		LOGGER.info("---------------------------------------------------------------------------");
//		for (Employees employee : repository.findAll()) {
//			if (employee.getEmployeeID() != 2) {
//				LOGGER.info(employee.toString());
//				employeesList.add(employee);
//			}
//		}
//		
//		/*
//		LOGGER.info("---------------------------------------------------------------------------");
//		LOGGER.info("Employees found with findWithLastName(\"Blow\")");
//		LOGGER.info("---------------------------------------------------------------------------");
//		repository.findByLastName("Blow").forEach( blow -> {
//			LOGGER.info(blow.toString());
//		});
//
//		LOGGER.info("---------------------------------------------------------------------------");
//*/
//		return employeesList;
//		
//	}
//}
