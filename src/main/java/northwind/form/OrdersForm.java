/**
 * 
 */
package northwind.form;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author larryricker
 *
 */
public class OrdersForm {
	private Long orderID;
	private String customerID;
	private Integer employeeID;
	private Timestamp orderDate;
	private Timestamp requiredDate;
	private Timestamp shippedDate;
	private Integer shipVia;
	private BigDecimal freight;
	private String shipName;
	private String shipAddress;
	private String shipCity;
	private String shipRegion;
	private String shipPostalCode;
	private String shipCountry;
	/**
	 * @return the orderID
	 */
	public Long getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the employeeID
	 */
	public Integer getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the orderDate
	 */
	public Timestamp getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the requiredDate
	 */
	public Timestamp getRequiredDate() {
		return requiredDate;
	}
	/**
	 * @param requiredDate the requiredDate to set
	 */
	public void setRequiredDate(Timestamp requiredDate) {
		this.requiredDate = requiredDate;
	}
	/**
	 * @return the shippedDate
	 */
	public Timestamp getShippedDate() {
		return shippedDate;
	}
	/**
	 * @param shippedDate the shippedDate to set
	 */
	public void setShippedDate(Timestamp shippedDate) {
		this.shippedDate = shippedDate;
	}
	/**
	 * @return the shipVia
	 */
	public Integer getShipVia() {
		return shipVia;
	}
	/**
	 * @param shipVia the shipVia to set
	 */
	public void setShipVia(Integer shipVia) {
		this.shipVia = shipVia;
	}
	/**
	 * @return the freight
	 */
	public BigDecimal getFreight() {
		return freight;
	}
	/**
	 * @param freight the freight to set
	 */
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	/**
	 * @return the shipName
	 */
	public String getShipName() {
		return shipName;
	}
	/**
	 * @param shipName the shipName to set
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	/**
	 * @return the shipAddress
	 */
	public String getShipAddress() {
		return shipAddress;
	}
	/**
	 * @param shipAddress the shipAddress to set
	 */
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	/**
	 * @return the shipCity
	 */
	public String getShipCity() {
		return shipCity;
	}
	/**
	 * @param shipCity the shipCity to set
	 */
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	/**
	 * @return the shipRegion
	 */
	public String getShipRegion() {
		return shipRegion;
	}
	/**
	 * @param shipRegion the shipRegion to set
	 */
	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}
	/**
	 * @return the shipPostalCode
	 */
	public String getShipPostalCode() {
		return shipPostalCode;
	}
	/**
	 * @param shipPostalCode the shipPostalCode to set
	 */
	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}
	/**
	 * @return the shipCountry
	 */
	public String getShipCountry() {
		return shipCountry;
	}
	/**
	 * @param shipCountry the shipCountry to set
	 */
	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}
}
