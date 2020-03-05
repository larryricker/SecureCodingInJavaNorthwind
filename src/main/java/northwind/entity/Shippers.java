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
@Table(name="shippers")
public class Shippers {
	
	protected Shippers() {}
	
	public Shippers(long shipperID, String companyName, String phone) {
		this.setShipperID(shipperID);
		this.setCompanyName(companyName);
		this.setPhone(phone);
	}

	@Override
	public String toString() {
		return "shippers [shipperID=" + shipperID + ", companyName=" + companyName + ", phone=" + phone + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ShipperID\"", table="shippers")
	private long shipperID;
	@Column(name="\"CompanyName\"", table="shippers")
	private String companyName;
	@Column(name="\"Phone\"", table="shippers")
	private String phone;
	public long getShipperID() {
		return shipperID;
	}
	public void setShipperID(long shipperID) {
		this.shipperID = shipperID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
