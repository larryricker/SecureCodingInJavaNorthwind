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
@Table(name="employeeterritories")
public class EmployeeTerritories {

	
	protected EmployeeTerritories() {}
	
	public EmployeeTerritories( long employeeID, String territoryID) {
		this.setEmployeeID(employeeID);
		this.setTerritoryID(territoryID);
	}
	
	@Override
	public String toString() {
		return "employeeTerritories [employeeID=" + employeeID + ", territoryID=" + territoryID + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"EmployeeID\"", table="employeeterritories")
	private long employeeID;
	@Column(name="\"TerritoryID\"", table="employeeterritories")
	private String territoryID;
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getTerritoryID() {
		return territoryID;
	}
	public void setTerritoryID(String territoryID) {
		this.territoryID = territoryID;
	}
}
