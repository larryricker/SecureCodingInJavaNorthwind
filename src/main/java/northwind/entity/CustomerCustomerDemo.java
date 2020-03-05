/**
 * 
 */
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
@Table(name="customercustomerdemo")
public class CustomerCustomerDemo {
	
	protected CustomerCustomerDemo() {}
	
	public CustomerCustomerDemo(String customerID, String customerTypeID) {
		this.setCustomerID(customerID);
		this.setCustomerTypeID(customerTypeID);
	}

	@Override
	public String toString() {
		return "customerCustomerDemo [customerID=" + customerID + ", customerTypeID=" + customerTypeID + "]";
	}

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"CustomerID\"", table="customercustomerdemo")
	private String customerID;
	@Column(name="\"CustomerTypeID\"", table="customercustomerdemo")
	private String customerTypeID;
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerTypeID() {
		return customerTypeID;
	}
	public void setCustomerTypeID(String customerTypeID) {
		this.customerTypeID = customerTypeID;
	}

}
