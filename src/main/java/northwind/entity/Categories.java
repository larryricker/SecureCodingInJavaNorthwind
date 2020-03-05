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
@Table(name="categories")
public class Categories {

	protected Categories() {}
	
	public Categories(long categoryID, String categoryName, String description) {
		this.setCategoryID(categoryID);
		this.setCategoryName(categoryName);
		this.setDescription(description);
	}

	@Override
	public String toString() {
		return "categories [categoryID=" + categoryID + ", categoryName=" + categoryName + ", description="
				+ description + "]";
	}

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"CategoryID\"", table="categories")
	private long categoryID;
	@Column(name="\"CategoryName\"", table="categories")
	private String categoryName;
	@Column(name="\"Description\"", table="categories")
	private String description;
	public long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
