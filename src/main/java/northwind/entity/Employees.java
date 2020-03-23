package northwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Timestamp;


/**
 * @author larryricker
 *
 */
@Entity
@Table(name="employees")
public class Employees {
	private static final Logger LOGGER = LogManager.getLogger(Employees.class.getClass());

	public Employees() {}
	
	public Employees(Short employeeID, String firstName, String lastName, String title
			, String titleOfCourtesy, Timestamp birthDate, Timestamp hireData, String address
			, String city, String state, String postalCode, String region, String country
			, String homePhone, String extension, byte[] photo, String notes
			, short reportsTo, String photoPath) {
		LOGGER.info("Employees.constructor");
		this.setEmployeeID(employeeID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setTitle(title);
		this.setTitleOfCourtesy(titleOfCourtesy);
		this.setBirthDate(birthDate);
		this.setHireDate(hireDate);
		this.setAddress(address);
		this.setCity(city);
		this.setPostalCode(postalCode);
		this.setRegion(region);
		this.setCountry(country);
		this.setHomePhone(homePhone);
		this.setExtension(extension);
		this.setPhoto(photo);
		this.setNotes(notes);
		this.setReportsTo(reportsTo);
		this.setPhotoPath(photoPath);
	}

	@Override
	public String toString() {
		LOGGER.info("Employees.toString()");
		return "employees [employeeId=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", title=" + title + ", titleOfCourse=" + titleOfCourtesy + ", birthDate=" + birthDate + ", hireDate="
				+ hireDate + ", address=" + address + ", city=" + city + ", postalCode="
				+ postalCode + ", region=" + region + ", country=" + country + ", homePhone=" + homePhone
				+ ", extension=" + extension + ", photo=" + photo + ", notes=" + notes + ", reportsTo=" + reportsTo
				+ ", photoPath=" + photoPath + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"EmployeeID\"", table="employees")
	private Short employeeID;
	@Column(name="\"FirstName\"", table="employees")
	private String firstName;
	@Column(name="\"LastName\"", table="employees")
	private String lastName;
	@Column(name="\"Title\"", table="employees")
	private String title;
	@Column(name="\"TitleOfCourtesy\"", table="employees")
	private String titleOfCourtesy;
	@Column(name="\"BirthDate\"", table="employees")
	private Timestamp birthDate;
	@Column(name="\"HireDate\"", table="employees")
	private Timestamp hireDate;
	@Column(name="\"Address\"", table="employees")
	private String address;
	@Column(name="\"City\"", table="employees")
	private String city;
	@Column(name="\"PostalCode\"", table="employees")
	private String postalCode;
	@Column(name="\"Region\"", table="employees")
	private String region;
	@Column(name="\"Country\"", table="employees")
	private String country;
	@Column(name="\"HomePhone\"", table="employees")
	private String homePhone;
	@Column(name="\"Extension\"", table="employees")
	private String extension;
	@Column(name="\"Photo\"", table="employees")
	private byte[] photo;
	@Column(name="\"Notes\"", table="employees")
	private String notes;
	@Column(name="\"ReportsTo\"", table="employees", nullable = true)
	private short reportsTo;
	@Column(name="\"PhotoPath\"", table="employees")
	private String photoPath;

	public Short getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Short employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleOfCourtesy() {
		return titleOfCourtesy;
	}
	public void setTitleOfCourtesy(String titleOfCourtesy) {
		this.titleOfCourtesy = titleOfCourtesy;
	}
	public Timestamp getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}
	public Timestamp getHireDate() {
		return hireDate;
	}
	public void setHireDate(Timestamp hireDate) {
		this.hireDate = hireDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public short getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(short reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
}
