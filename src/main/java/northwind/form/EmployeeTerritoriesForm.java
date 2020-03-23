package northwind.form;

import javax.persistence.Column;
import javax.persistence.Id;

public class EmployeeTerritoriesForm {
	private long employeeID;
	private String territoryID;
	/**
	 * @return the employeeID
	 */
	public long getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the territoryID
	 */
	public String getTerritoryID() {
		return territoryID;
	}
	/**
	 * @param territoryID the territoryID to set
	 */
	public void setTerritoryID(String territoryID) {
		this.territoryID = territoryID;
	}
}
