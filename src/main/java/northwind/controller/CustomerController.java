//package northwind.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import northwind.entity.Customers;
//import northwind.entity.CustomersJDBCRepository;
//
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//@RestController
//@RequestMapping("restcustomers")
//public class CustomerController {
//	private static final Logger LOGGER = LogManager.getLogger(CustomerController.class.getClass());
//
//    @Autowired
//    private CustomersJDBCRepository customers;
//
//    @RequestMapping("test")
//    public String test() {
//        LOGGER.info("Test");
//        return "OK";
//    }
//
//    @RequestMapping("customer")
//    public Customers getCustomer(@RequestParam("id") String id) {
//        LOGGER.info("Get customer");
//        return customers.getCustomer(id);
//    }
//
//    @RequestMapping("customers")
//    public List<Customers> getCustomers(@RequestParam("ids") String[] ids) {
//        LOGGER.info("Get customers");
//        return customers.getCustomers(ids);
//    }
//
//
//}
