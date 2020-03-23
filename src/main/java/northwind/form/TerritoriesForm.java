/**
 * 
 */
package northwind.form;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author larryricker
 *
 */
public class TerritoriesForm {

	private String territoryID;
	private String territoryDescription;
	private short regionID;
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
	/**
	 * @return the territoryDescription
	 */
	public String getTerritoryDescription() {
		return territoryDescription;
	}
	/**
	 * @param territoryDescription the territoryDescription to set
	 */
	public void setTerritoryDescription(String territoryDescription) {
		this.territoryDescription = territoryDescription;
	}
	/**
	 * @return the regionID
	 */
	public short getRegionID() {
		return regionID;
	}
	/**
	 * @param regionID the regionID to set
	 */
	public void setRegionID(short regionID) {
		this.regionID = regionID;
	}

}
