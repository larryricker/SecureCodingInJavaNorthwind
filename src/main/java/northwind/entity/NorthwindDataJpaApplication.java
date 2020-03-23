package northwind.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/*
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
*/
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// EnableSwagger2
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* JBOSS Example
@SpringBootApplication
@EnableSwagger2
public class SpringBootDemoApplication extends SpringBootServletInitializer {
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
    return builder.sources(SpringBootDemoApplication.class);
  }
  public static void main(String[] args){
    SpringApplication.run(SpringBootDemoApplication.class, args);
  }
}
*/

@SpringBootApplication
// @EnableSwagger2
 @ComponentScan(basePackages = {"northwind.entity", "northwind.controller", "northwind.converters", "northwind.form", "northwind.service", "northwind.service.impl", "northwindWeb"})
// @EnableJpaRepositories(basePackageClasses = EmployeesRepository.class)
public class NorthwindDataJpaApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(NorthwindDataJpaApplication.class.getClass());
	
	  // @Override
	  // protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	  //   return builder.sources(NorthwindDataJpaApplication.class);
	  // }

	  public static void main(String[] args) {
		    SpringApplication.run(NorthwindDataJpaApplication.class, args);
	  }
	  
	  /*
	  @Bean
	  public CommandLineRunner territories(TerritoriesRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding Territories");
			  Territories prod = new Territories("20170", "Sonoma", (short)2);
			  repository.save(prod);
			  LOGGER.info("Territories found with findAll()");
			  LOGGER.info("---------------------------------------------------------------------------");
			  for (Territories aProd : repository.findAll()) {
				  LOGGER.info(aProd.toString());
			  }
			  LOGGER.info("---------------------------------------------------------------------------");

		  };

	  }
	  */

	  /*
	  @Bean
	  public CommandLineRunner suppliers(SuppliersRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding Suppliers");
			  Suppliers prod = new Suppliers(30l, "Ebony Vineyards", "Sara Black", "Wine Aficionado"
					 , "123 Sonoma Rd", "Sonoma", "CA", "20170", "USA"
					 , "707-555-1212", "707-555-0000", "https://www.ebonyvineyards.com/");
			  repository.save(prod);
			  LOGGER.info("Orders found with findAll()");
			  LOGGER.info("---------------------------------------------------------------------------");
			  for (Suppliers aProd : repository.findAll()) {
				  LOGGER.info(aProd.toString());
			  }
			  LOGGER.info("---------------------------------------------------------------------------");

		  };

	  }
	  */

	  /*
	  @Bean
	  public CommandLineRunner shippers(ShippersRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding Shippers");
			  Shippers prod = new Shippers(7l, "United States Postal Service", "(800) 275-8777");
			  repository.save(prod);
				LOGGER.info("Orders found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (Shippers aProd : repository.findAll()) {
					LOGGER.info(aProd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };

	  }
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner products(ProductsRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding Products");
			  Products prod = new Products(Integer.valueOf(78), "CBD Oil", Integer.valueOf(12)
					  , Integer.valueOf(10) , "1-500MG Bottle", BigDecimal.valueOf(45.50)
					  , Integer.valueOf(3), Integer.valueOf(7)
						, Integer.valueOf(5), Integer.valueOf(0));
			  repository.save(prod);
				LOGGER.info("Orders found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (Products aProd : repository.findAll()) {
					LOGGER.info(aProd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */

	  /*
	  @Bean
	  public CommandLineRunner orders (OrdersRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding Orders");
			  Orders od = new Orders(11078l, "SBLACK", Integer.valueOf(101), new Timestamp(new Date().getTime())
						, new Timestamp( new Date().getTime()), new Timestamp(new Date().getTime())
						, Integer.valueOf(5), BigDecimal.valueOf(6.75) 
						, "Joe Blow", "123 Sonoma Rd", "Sonoma", "CA"
						, "20170", "USA");
			  repository.save(od);
				LOGGER.info("Orders found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (Orders aOd : repository.findAll()) {
					LOGGER.info(aOd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner orderdetails (OrderDetailsRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding OrderDetails");
			  OrderDetails od = new OrderDetails(Integer.valueOf(11078),Integer.valueOf(73)
					  ,BigDecimal.valueOf(15.45),Integer.valueOf(3),Double.valueOf(0.10));
			  repository.save(od);
				LOGGER.info("OrderDetails found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (OrderDetails aOd : repository.findAll()) {
					LOGGER.info(aOd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner employeeterritories (EmployeeTerritoriesRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding EmployeeTerritories");
			  EmployeeTerritories cd = new EmployeeTerritories( 101l, "20170");
			  repository.save(cd);
				LOGGER.info("EmployeeTerritories found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (EmployeeTerritories aCd : repository.findAll()) {
					LOGGER.info(aCd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner customers (CustomersRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding Customers");
			  Customers cd = new Customers("SBLACK", "Ebony Vinyards", "Sara Black", "Wine Aficionado"
						, "123 Sonoma Rd", "Sonoma", "CA", "95476", "USA"
						, "707-555-1212", "707-555-0000");
			  repository.save(cd);
				LOGGER.info("CustomerDemographics found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (Customers aCd : repository.findAll()) {
					LOGGER.info(aCd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner customerdemographics(CustomerDemographicsRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding CustomerDemographics");
			  CustomerDemographics cd = new CustomerDemographics("1", "Likes her deliveries in Paper bags");
			  repository.save(cd);
				LOGGER.info("CustomerDemographics found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (CustomerDemographics aCd : repository.findAll()) {
					LOGGER.info(aCd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  };
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner customercustomerdemo(CustomerCustomerDemoRepository repository) {
		  return (args) -> {
			  LOGGER.info("Adding CustomerCustomerDemo");
			  CustomerCustomerDemo ccd = new CustomerCustomerDemo("1", "Large");
			  repository.save(ccd);
				LOGGER.info("CustomerCustomerDemo found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (CustomerCustomerDemo aCcd : repository.findAll()) {
					LOGGER.info(aCcd.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */
	  
	  /*
	  @Bean
	  public CommandLineRunner categories(CategoriesRepository repository) {
		  return (args) -> {
			  // add a new Categories
			  LOGGER.info("Adding Notes");
			  Categories cat = new Categories(10l, "Health", "Health and Beauty Products");
			  repository.save(cat);
				LOGGER.info("Categories found with findAll()");
				LOGGER.info("---------------------------------------------------------------------------");
				for (Categories aCat : repository.findAll()) {
					LOGGER.info(aCat.toString());
				}
				LOGGER.info("---------------------------------------------------------------------------");

		  };
	  }
	  */
	  
	  @Bean
	  public CommandLineRunner employees(EmployeesRepository repository) {
		  return (args) -> {
			  // add a new Employee
			LOGGER.info("Adding Joe Blow");
			Employees empl = new Employees((short)101, "Joe", "Blow", "Associate Java Developer"
						, "Mr.", new Timestamp(new Date().getTime())
						, new Timestamp(new Date().getTime()), "123 Main Street"
						, "Herndon", "VA", "20170", "Washington", "USA"
						, "202-555-1212", "1234", null, "Good listener"
						, (short)2, "/opt/wildfly/photos/"); 
			LOGGER.info("Created employee Joe Blow");
			repository.save(empl);
			
			LOGGER.info("Employees found with findAll()");
			LOGGER.info("---------------------------------------------------------------------------");
			for (Employees employee : repository.findAll()) {
				if (employee.getEmployeeID() != 2) {
					LOGGER.info(employee.toString());
				}
			}
			
			LOGGER.info("---------------------------------------------------------------------------");
			LOGGER.info("Employees found with findWithLastName(\"Blow\")");
			LOGGER.info("---------------------------------------------------------------------------");
			repository.findByLastName("Blow").forEach( blow -> {
//				if (blow.getEmployeeID() == 100) {
//				    repository.delete(blow);
//				}
				LOGGER.info(blow.toString());
			});

//			LOGGER.info("---------------------------------------------------------------------------");
//			//  findAllEmployeesWithPagination
//			LOGGER.info("---------------------------------------------------------------------------");
//			LOGGER.info("Employees found with findAllEmployeesWithPagination(\"Blow\")");
//			LOGGER.info("---------------------------------------------------------------------------");
//			repository.findAllEmployeesWithPagination().forEach( blow -> {
//				if (blow.getEmployeeID() == 0) {
//				    repository.delete(blow);
//				}
//				LOGGER.info(blow.toString());
//			});
//			LOGGER.info("---------------------------------------------------------------------------");
		  
			LOGGER.info("---------------------------------------------------------------------------");
			LOGGER.info("Employees found with findByFirstNameContainingIgnoringCase(\"Joe\")");
			LOGGER.info("---------------------------------------------------------------------------");
			repository.findByFirstNameContainingIgnoringCase("Joe").forEach( blow -> {
				LOGGER.info(blow.toString());
			});
			LOGGER.info("---------------------------------------------------------------------------");
		  
		  };
		  
	  }

}
