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
@Table(name="suppliers")
public class Suppliers {
	
	protected Suppliers() {}
	
	public Suppliers(long supplierID, String companyName, String contactName, String contactTitle
			, String address, String city, String region, String postalCode, String country
			, String phone, String fax, String homePage) {
		this.setSupplierID(supplierID);
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
		this.setHomePage(homePage);
	}

	@Override
	public String toString() {
		return "suppliers [supplierID=" + supplierID + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + ", address=" + address + ", city=" + city + ", region=" + region
				+ ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone + ", fax=" + fax
				+ ", homePage=" + homePage + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"SupplierID\"", table="suppliers")
	private long supplierID;
	@Column(name="\"CompanyName\"", table="suppliers")
	private String companyName;
	@Column(name="\"ContactName\"", table="suppliers")
	private String contactName;
	@Column(name="\"ContactTitle\"", table="suppliers")
	private String contactTitle;
	@Column(name="\"Address\"", table="suppliers")
	private String address;
	@Column(name="\"City\"", table="suppliers")
	private String city;
	@Column(name="\"Region\"", table="suppliers")
	private String region;
	@Column(name="\"PostalCode\"", table="suppliers")
	private String postalCode;
	@Column(name="\"Country\"", table="suppliers")
	private String country;
	@Column(name="\"Phone\"", table="suppliers")
	private String phone;
	@Column(name="\"Fax\"", table="suppliers")
	private String fax;
	@Column(name="\"HomePage\"", table="suppliers")
	private String homePage;
	public long getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(long supplierID) {
		this.supplierID = supplierID;
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
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

}
