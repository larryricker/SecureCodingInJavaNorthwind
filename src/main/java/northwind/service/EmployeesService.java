package northwind.service;

import java.util.List;

import northwind.entity.Customers;
import northwind.entity.Employees;
import northwind.form.EmployeesForm;

public interface EmployeesService {
	List<Employees> listAll();
//	Employees getById(long employeeID);
	Employees saveOrUpdate(Employees employees);
	void delete(Short id);
	Employees saveOrUpdateEmployeesForm(EmployeesForm employeesForm);
	List<Employees> findByLastName(String lastName);
	Employees findByEmployeeID(Short employeeID);

	Iterable<Employees> findAll();
}
