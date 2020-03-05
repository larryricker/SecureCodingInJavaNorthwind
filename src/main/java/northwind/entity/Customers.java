package northwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author larryricker
 *
 */
@Entity
@Table(name="customers")
public class Customers {
	
	public Customers() {}
	
	public Customers(String customerID, String companyName, String contactName, String contactTitle
			, String address, String city, String region, String postalCode, String country
			, String phone, String fax) {
		this.setCustomerID(customerID);
		this.setCompanyName(companyName);
		this.setContactName(contactName);
		this.setContactTitle(contactTitle);
		this.setAddress(address);
		this.setCity(city);
		this.setRegion(region);
		this.setPostalCode(postalCode);
		this.setCountry(country);
		this.setPhone(phone);
		this.setFax(fax);
	}

	@Override
	public String toString() {
		return "customers [customerID=" + customerID + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + ", address=" + address + ", city=" + city + ", region=" + region
				+ ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone + ", fax=" + fax + "]";
	}

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"CustomerID\"", table="customers")
	private String customerID;
	@Column(name="\"CompanyName\"", table="customers")
	private String companyName;
	@Column(name="\"ContactName\"", table="customers")
	private String contactName;
	@Column(name="\"ContactTitle\"", table="customers")
	private String contactTitle;
	@Column(name="\"Address\"", table="customers")
	private String address;
	@Column(name="\"City\"", table="customers")
	private String city;
	@Column(name="\"Region\"", table="customers")
	private String region;
	@Column(name="\"PostalCode\"", table="customers")
	private String postalCode;
	@Column(name="\"Country\"", table="customers")
	private String country;
	@Column(name="\"Phone\"", table="customers")
	private String phone;
	@Column(name="\"Fax\"", table="customers")
	private String fax;

	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}

}
