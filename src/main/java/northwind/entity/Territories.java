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
@Table(name="territories")
public class Territories {
	
	protected Territories() {}
	
	public Territories(String territoryID, String territoryDescription, short regionID) {
		this.setTerritoryID(territoryID);
		this.setTerritoryDescription(territoryDescription);
		this.setRegionID(regionID);
	}

	@Override
	public String toString() {
		return "territories [territoryID=" + territoryID + ", territoryDescription=" + territoryDescription
				+ ", regionID=" + regionID + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"TerritoryID\"", table="territories")
	private String territoryID;
	@Column(name="\"TerritoryDescription\"", table="territories")
	private String territoryDescription;
	@Column(name="\"RegionID\"", table="territories")
	private short regionID;
	public String getTerritoryID() {
		return territoryID;
	}
	public void setTerritoryID(String territoryID) {
		this.territoryID = territoryID;
	}
	public String getTerritoryDescription() {
		return territoryDescription;
	}
	public void setTerritoryDescription(String territoryDescription) {
		this.territoryDescription = territoryDescription;
	}
	public short getRegionID() {
		return regionID;
	}
	public void setRegionID(short regionID) {
		this.regionID = regionID;
	}

}
