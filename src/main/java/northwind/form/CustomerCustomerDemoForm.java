package northwind.form;

import javax.persistence.Column;
import javax.persistence.Id;

public class CustomerCustomerDemoForm {
	private String customerID;
	private String customerTypeID;
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
	 * @return the customerTypeID
	 */
	public String getCustomerTypeID() {
		return customerTypeID;
	}
	/**
	 * @param customerTypeID the customerTypeID to set
	 */
	public void setCustomerTypeID(String customerTypeID) {
		this.customerTypeID = customerTypeID;
	}
}
