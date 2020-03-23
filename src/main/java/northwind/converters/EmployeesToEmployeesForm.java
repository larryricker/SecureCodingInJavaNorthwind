package northwind.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import northwind.entity.Employees;
import northwind.form.EmployeesForm;

@Component
public class EmployeesToEmployeesForm implements Converter <Employees, EmployeesForm> {

	@Override
	public EmployeesForm convert(Employees employees) {
		EmployeesForm employeesForm = new EmployeesForm();
		employeesForm.setEmployeeID(employees.getEmployeeID());
		employeesForm.setAddress(employees.getAddress());
		employeesForm.setBirthDate(employees.getBirthDate());
		employeesForm.setCity(employees.getCity());
		employeesForm.setCountry(employees.getCountry());
		employeesForm.setExtension(employees.getExtension());
		employeesForm.setFirstName(employees.getFirstName());
		employeesForm.setHireDate(employees.getHireDate());
		employeesForm.setHomePhone(employees.getHomePhone());
		employeesForm.setLastName(employees.getLastName());
		employeesForm.setNotes(employees.getNotes());
		employeesForm.setPhoto(employees.getPhoto());
		employeesForm.setPhotoPath(employees.getPhotoPath());
		employeesForm.setPostalCode(employees.getPostalCode());
		employeesForm.setRegion(employees.getRegion());
		employeesForm.setReportsTo(employees.getReportsTo());
		employeesForm.setTitle(employees.getTitle());
		employeesForm.setTitleOfCourtesy(employees.getTitleOfCourtesy());
		return employeesForm;
	}
	

}

/*
@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
*/