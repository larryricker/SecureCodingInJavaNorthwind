/**
 * 
 */
package northwind.form;

/**
 * @author larryricker
 *
 */
public class ShippersForm {
	private long shipperID;
	private String companyName;
	private String phone;
	/**
	 * @return the shipperID
	 */
	public long getShipperID() {
		return shipperID;
	}
	/**
	 * @param shipperID the shipperID to set
	 */
	public void setShipperID(long shipperID) {
		this.shipperID = shipperID;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
