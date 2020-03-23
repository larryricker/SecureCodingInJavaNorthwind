/**
 * 
 */
package northwind.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import northwind.entity.Employees;
import northwind.form.EmployeesForm;

/**
 * @author larryricker
 *
 */

@Component
public class EmployeesFormToEmployees implements Converter<EmployeesForm, Employees>{

	@Override
	public Employees convert(EmployeesForm employeesForm) {
		Employees employees = new Employees();
		if (employeesForm.getEmployeeID() > -1 
				&& !StringUtils.isEmpty(employeesForm.getEmployeeID())) {
			employees.setEmployeeID(employeesForm.getEmployeeID());
		}
		employees.setAddress(employeesForm.getAddress());
		employees.setBirthDate(employeesForm.getBirthDate());
		employees.setCity(employeesForm.getCity());
		employees.setCountry(employeesForm.getCountry());
		employees.setExtension(employeesForm.getExtension());
		employees.setFirstName(employeesForm.getFirstName());
		employees.setHireDate(employeesForm.getHireDate());
		employees.setHomePhone(employeesForm.getHomePhone());
		employees.setLastName(employeesForm.getLastName());
		employees.setNotes(employeesForm.getNotes());
		employees.setPhoto(employeesForm.getPhoto());
		employees.setPhotoPath(employeesForm.getPhotoPath());
		employees.setPostalCode(employeesForm.getPostalCode());
		employees.setRegion(employeesForm.getRegion());
		employees.setReportsTo(employeesForm.getReportsTo());
		employees.setTitle(employeesForm.getTitle());
		employees.setTitleOfCourtesy(employeesForm.getTitleOfCourtesy());
		return employees;
	}

}

