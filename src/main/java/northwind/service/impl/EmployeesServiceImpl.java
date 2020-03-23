package northwind.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import northwind.converters.EmployeesFormToEmployees;
import northwind.entity.Employees;
import northwind.entity.EmployeesRepository;
import northwind.form.EmployeesForm;
import northwind.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	private static final Logger LOGGER = LogManager.getLogger(EmployeesServiceImpl.class.getClass());

	private EmployeesRepository repository;
	private EmployeesFormToEmployees employeesFormToEmployees;

	@Autowired
	public EmployeesServiceImpl(EmployeesRepository employeesRepository, 
			EmployeesFormToEmployees employeesFormToEmployees) {
		LOGGER.info("EmployeesServiceImpl.constructor");
		this.repository = employeesRepository;
		this.employeesFormToEmployees = employeesFormToEmployees;
	}
	
//	@Autowired
//	public EmployeesServiceImpl(EmployeesRepository employeesRepository) {
//		LOGGER.info("ES.EmployeesServiceImpl");
//		this.repository = employeesRepository;
//	}
	
	@Override
	public List<Employees> findByLastName(String lastName) {
		LOGGER.info("EmployeesServiceImpl.findByLastName");
		return repository.findByLastName(lastName);
	}

	@Override
	public Employees findByEmployeeID(Short employeeID) {
		LOGGER.info("EmployeesServiceImpl.findByEmployeeID");
		return repository.findByEmployeeID(employeeID);
	}

	@Override
	public Iterable<Employees> findAll() {
		LOGGER.info("EmployeesServiceImpl.findAll");
		return repository.findAll();
	}

	@Override
	public List<Employees> listAll() {
		LOGGER.info("EmployeesServiceImpl.listAll");
		List<Employees> employees = new ArrayList<>();
		repository.findAll().forEach(employees::add); // fun with Java 8
		return employees;
	}

//	@Override
//	public Employees getById(long employeeID) {
//		LOGGER.info("EmployeesServiceImpl.getById");
//		return repository.findById(employeeID).orElse(null);
//	}

	@Override
	public Employees saveOrUpdate(Employees employees) {
		LOGGER.info("EmployeesServiceImpl.saveOrUpdate");
		repository.save(employees);
		return employees;
	}

	@Override
	public void delete(Short id) {
		LOGGER.info("EmployeesServiceImpl.delete");
		repository.deleteById(id);
	}

	@Override
	public Employees saveOrUpdateEmployeesForm(EmployeesForm employeesForm) {
		LOGGER.info("EmployeesServiceImpl.saveOrUpdateEmployeesForm");
		Employees savedEmployees = saveOrUpdate(employeesFormToEmployees.convert(employeesForm));
		LOGGER.info("Saved Employees Id: " + savedEmployees.getEmployeeID());
		return savedEmployees;
	}
	
}
