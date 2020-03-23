/**
 * 
 */
package northwind.form;

import java.math.BigDecimal;

/**
 * @author larryricker
 *
 */
public class ProductsForm {
	private Integer productID;
	private String productName;
	private Integer supplierID;
	private Integer categoryID;
	private String quantityPerUnit;
	private BigDecimal unitPrice;
	private Integer unitsInStock;
	private Integer unitsOnOrder;
	private Integer reorderLevel;
	private Integer discontinued;
	/**
	 * @return the productID
	 */
	public Integer getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the supplierID
	 */
	public Integer getSupplierID() {
		return supplierID;
	}
	/**
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(Integer supplierID) {
		this.supplierID = supplierID;
	}
	/**
	 * @return the categoryID
	 */
	public Integer getCategoryID() {
		return categoryID;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @return the quantityPerUnit
	 */
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	/**
	 * @param quantityPerUnit the quantityPerUnit to set
	 */
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	/**
	 * @return the unitPrice
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the unitsInStock
	 */
	public Integer getUnitsInStock() {
		return unitsInStock;
	}
	/**
	 * @param unitsInStock the unitsInStock to set
	 */
	public void setUnitsInStock(Integer unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	/**
	 * @return the unitsOnOrder
	 */
	public Integer getUnitsOnOrder() {
		return unitsOnOrder;
	}
	/**
	 * @param unitsOnOrder the unitsOnOrder to set
	 */
	public void setUnitsOnOrder(Integer unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}
	/**
	 * @return the reorderLevel
	 */
	public Integer getReorderLevel() {
		return reorderLevel;
	}
	/**
	 * @param reorderLevel the reorderLevel to set
	 */
	public void setReorderLevel(Integer reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	/**
	 * @return the discontinued
	 */
	public Integer getDiscontinued() {
		return discontinued;
	}
	/**
	 * @param discontinued the discontinued to set
	 */
	public void setDiscontinued(Integer discontinued) {
		this.discontinued = discontinued;
	}
}
