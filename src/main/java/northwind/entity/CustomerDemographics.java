package northwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author larryricker
 *
 */
@Entity
@Table(name="customerdemographics")
public class CustomerDemographics {
	private static final Logger LOGGER = LogManager.getLogger(CustomerDemographics.class.getClass());

	protected CustomerDemographics() {}
	
	public CustomerDemographics(String customerTypeID, String customerDesc) {
		this.setCustomerDesc(customerDesc);
		this.setCustomerTypeID(customerTypeID);
	}

	@Override
	public String toString() {
		return "customerDemographics [customerTypeID=" + customerTypeID + ", customerDesc=" + customerDesc + "]";
	}

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"CustomerTypeID\"", table="customerdemographics")
	private String customerTypeID;
	@Column(name="\"CustomerDesc\"", table="customerdemographics")
	private String customerDesc;
	public String getCustomerTypeID() {
		return customerTypeID;
	}
	public void setCustomerTypeID(String customerTypeID) {
		this.customerTypeID = customerTypeID;
	}
	public String getCustomerDesc() {
		return customerDesc;
	}
	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}

}
