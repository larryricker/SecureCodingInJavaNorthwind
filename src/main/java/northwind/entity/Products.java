package northwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;

/**
 * @author larryricker
 *
 */
@Entity
@Table(name="products")
public class Products {
	
	protected Products() {}
	
	public Products(Integer productID, String productName, Integer supplierID, Integer categoryID
			, String quantityPerUnit, BigDecimal unitPrice, Integer unitisInStock, Integer unitsOnOrder
			, Integer reorderLevel, Integer discontinued) {
		this.setProductID(productID);
		this.setProductName(productName);
		this.setSupplierID(supplierID);
		this.setCategoryID(categoryID);
		this.setQuantityPerUnit(quantityPerUnit);
		this.setUnitPrice(unitPrice);
		this.setUnitsInStock(unitisInStock);
		this.setUnitsOnOrder(unitsOnOrder);
		this.setReorderLevel(reorderLevel);
		this.setDiscontinued(discontinued);
	}

	@Override
	public String toString() {
		return "products [productID=" + productID + ", productName=" + productName + ", supplierID=" + supplierID
				+ ", categoryID=" + categoryID + ", quanityPerUnit=" + quantityPerUnit + ", unitPrice=" + unitPrice
				+ ", unitsInStock=" + unitsInStock + ", unitsOnOrder=" + unitsOnOrder + ", reorderLevel=" + reorderLevel
				+ ", discontinued=" + discontinued + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ProductID\"", table="products")
	private Integer productID;
	@Column(name="\"ProductName\"", table="products")
	private String productName;
	@Column(name="\"SupplierID\"", table="products")
	private Integer supplierID;
	@Column(name="\"CategoryID\"", table="products")
	private Integer categoryID;
	@Column(name="\"QuantityPerUnit\"", table="products")
	private String quantityPerUnit;
	@Column(name="\"UnitPrice\"", table="products")
	private BigDecimal unitPrice;
	@Column(name="\"UnitsInStock\"", table="products")
	private Integer unitsInStock;
	@Column(name="\"UnitsOnOrder\"", table="products")
	private Integer unitsOnOrder;
	@Column(name="\"ReorderLevel\"", table="products")
	private Integer reorderLevel;
	@Column(name="\"Discontinued\"", table="products")
	private Integer discontinued;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(Integer supplierID) {
		this.supplierID = supplierID;
	}
	public Integer getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(Integer unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public Integer getUnitsOnOrder() {
		return unitsOnOrder;
	}
	public void setUnitsOnOrder(Integer unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}
	public Integer getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(Integer reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public Integer getDiscontinued() {
		return discontinued;
	}
	public void setDiscontinued(Integer discontinued) {
		this.discontinued = discontinued;
	}

}
