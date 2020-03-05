package northwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author larryricker
 *
 */
@Entity
@Table(name="orders")
public class Orders {
	
	protected Orders() {}
	
	public Orders(long orderID, String customerID, Integer employeeID, Timestamp orderDate
			, Timestamp requiredDate, Timestamp shippedDate, Integer shipVia, BigDecimal freight
			, String shipName, String shipAddress, String shipCity, String shipRegion
			, String shipPostalCode, String shipCountry) {
		this.setOrderID(orderID);
		this.setCustomerID(customerID);
		this.setEmployeeID(employeeID);
		this.setOrderDate(orderDate);
		this.setRequiredDate(requiredDate);
		this.setShippedDate(shippedDate);
		this.setShipVia(shipVia);
		this.setFreight(freight);
		this.setShipName(shipName);
		this.setShipAddress(shipAddress);
		this.setShipCity(shipCity);
		this.setShipRegion(shipRegion);
		this.setShipPostalCode(shipPostalCode);
		this.setShipCountry(shipCountry);
	}

	@Override
	public String toString() {
		return "orders [orderID=" + orderID + ", customerID=" + customerID + ", employeeID=" + employeeID
				+ ", orderDate=" + orderDate + ", requiredDate=" + requiredDate + ", shippedDate=" + shippedDate
				+ ", shipVia=" + shipVia + ", freight=" + freight + ", shipName=" + shipName + ", shipAddress="
				+ shipAddress + ", shipCity=" + shipCity + ", shipRegion=" + shipRegion + ", shipPostalCode="
				+ shipPostalCode + ", shipCountry=" + shipCountry + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"OrderID\"", table="orders")
	private long orderID;
	@Column(name="\"CustomerID\"", table="orders")
	private String customerID;
	@Column(name="\"EmployeeID\"", table="orders")
	private Integer employeeID;
	@Column(name="\"OrderDate\"", table="orders")
	private Timestamp orderDate;
	@Column(name="\"RequiredDate\"", table="orders")
	private Timestamp requiredDate;
	@Column(name="\"ShippedDate\"", table="orders")
	private Timestamp shippedDate;
	@Column(name="\"ShipVia\"", table="orders")
	private Integer shipVia;
	@Column(name="\"Freight\"", table="orders")
	private BigDecimal freight;
	@Column(name="\"ShipName\"", table="orders")
	private String shipName;
	@Column(name="\"ShipAddress\"", table="orders")
	private String shipAddress;
	@Column(name="\"ShipCity\"", table="orders")
	private String shipCity;
	@Column(name="\"ShipRegion\"", table="orders")
	private String shipRegion;
	@Column(name="\"ShipPostalCode\"", table="orders")
	private String shipPostalCode;
	@Column(name="\"ShipCountry\"", table="orders")
	private String shipCountry;
	public long getOrderID() {
		return orderID;
	}
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public Timestamp getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(Timestamp requiredDate) {
		this.requiredDate = requiredDate;
	}
	public Timestamp getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Timestamp shippedDate) {
		this.shippedDate = shippedDate;
	}
	public Integer getShipVia() {
		return shipVia;
	}
	public void setShipVia(Integer shipVia) {
		this.shipVia = shipVia;
	}
	public BigDecimal getFreight() {
		return freight;
	}
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipRegion() {
		return shipRegion;
	}
	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}
	public String getShipPostalCode() {
		return shipPostalCode;
	}
	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}
	public String getShipCountry() {
		return shipCountry;
	}
	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}

}
