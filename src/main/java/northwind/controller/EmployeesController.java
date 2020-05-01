package northwind.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import northwind.converters.EmployeesToEmployeesForm;
import northwind.entity.Employees;
import northwind.entity.Orders;
import northwind.form.EmployeesForm;
import northwind.service.EmployeesService;

@Controller  
public class EmployeesController {
	private static final Logger LOGGER = LogManager.getLogger(EmployeesController.class.getClass());

	
	private EmployeesService employeesService;
	private EmployeesToEmployeesForm employeesToEmployeesForm;
	
    @RequestMapping("/employeesrest")  
    public String display(Model m)  
    {  
    	LOGGER.info("EmployeesController.display");
    	Short employeeID = 0;
    	String firstName = "";
    	String lastName = "";
    	String title = "";
		String titleOfCourtesy = "";
		Timestamp birthDate = new Timestamp(GregorianCalendar.getInstance().getTimeInMillis());
		Timestamp hireDate = new Timestamp(GregorianCalendar.getInstance().getTimeInMillis());
		String address = "";
		String city = "";
		String state = "";
		String postalCode = "";
		String region = "";
		String country = "";
		String homePhone = "";
		String extension = "";
		byte[] photo = "".getBytes(); 
		String notes = "";
		short reportsTo = 0;
		String photoPath = "";
        m.addAttribute("employeesForm", new Employees(employeeID
        		, firstName,  lastName, title
    			, titleOfCourtesy, birthDate
    			,  hireDate,  address
    			,  city,  state,  postalCode
    			,  region,  country
    			,  homePhone,  extension
    			, photo,  notes
    			,  reportsTo,  photoPath));  
//        return "view";  
        return "employees/employeesform";  
    }  
    @RequestMapping("/employeesrest/search")  
    public String submitForm(@Valid @ModelAttribute("emp") Employees employees, BindingResult br)  
    {  
    	LOGGER.info("EmployeesController.submitForm");
        if(br.hasErrors())  
        {  
            return "employeesrest/search";  
        }  
        else  
        {  
        return "employeesrest/searchresults";  
        }  
    }  
    @Autowired
    public void setEmployeesToEmployeesForm(EmployeesToEmployeesForm employeesToEmployeesForm) {
    	LOGGER.info("EmployeesController.setEmployeesToEmployeesForm");
    	this.employeesToEmployeesForm = employeesToEmployeesForm;
    }
    @Autowired
    public void setEmployeesService(EmployeesService employeesService) {
    	LOGGER.info("EmployeesController.setEmployeesService");
    	this.employeesService = employeesService;
    }
    @RequestMapping("/allemployees")
    public String redirToList() {
    	LOGGER.info("EmployeesController.redirToList()");
    	return "redirect:/employees/list";
    }
    @RequestMapping({"employees/list", "/employees"})	
    public String listEmployees(Model model) {
    	LOGGER.info("EmployeesController.listEmployees");
		model.addAttribute("employees", employeesService.listAll());
		return "employees/list";
    }
    @RequestMapping("employees/show/{id}")
    public String getEmployees(@PathVariable String id, Model model) {
    	LOGGER.info("EmployeesController.getEmployees");
    	model.addAttribute("employee", employeesService.findByEmployeeID(Short.valueOf(id)));
    	return "employees/show";
    }
    @RequestMapping("employees/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
    	LOGGER.info("EmployeesController.edit");
    	Employees employees = employeesService.findByEmployeeID(Short.valueOf(id));
    	EmployeesForm employeesForm = employeesToEmployeesForm.convert(employees);
    	model.addAttribute("employeesForm", employeesForm);
    	return "employees/employeesform";
    }
    @RequestMapping("employees/new")
    public String newEmployees(Model model) {
    	LOGGER.info("EmployeesController.newEmployees");
    	model.addAttribute("employeesForm", new EmployeesForm());
    	return "employees/employeesform";
    }
    @RequestMapping(value = "/employees", method = RequestMethod.POST) 
    public String saveOrUpdateEmployees(@Valid EmployeesForm employeesForm, BindingResult bindingResult) {
    	LOGGER.info("EmployeesController.saveOrUpdateEmployees");
    	if (bindingResult.hasErrors()) {
    		return "employees/employeesform";
    	}
    	Employees savedEmployees = employeesService.saveOrUpdateEmployeesForm(employeesForm);
    	return "redirect:/employees/show/" + savedEmployees.getEmployeeID();
    }
    @RequestMapping("/employees/delete/{id}")
    public String delete(@PathVariable String id) {
    	LOGGER.info("EmployeesController.delete");
    	employeesService.delete(Short.valueOf(id));
    	return "redirect:/employees/list";
   	}
 }
               