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
@Table(name="order_details")
public class OrderDetails {
	
	protected OrderDetails() {}
	
	public OrderDetails(Integer orderID, Integer productID, BigDecimal unitPrice, Integer quantity
			, Double discount) {
		this.setOrderID(orderID);
		this.setProductID(productID);
		this.setUnitPrice(unitPrice);
		this.setQuantity(quantity);
		this.setDiscount(discount);
		
	}

	@Override
	public String toString() {
		return "orderDetails [orderID=" + orderID + ", productID=" + productID + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", discount=" + discount + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"OrderID\"", table="order_details")
	private Integer orderID;
	@Column(name="\"ProductID\"", table="order_details")
	private Integer productID;
	@Column(name="\"UnitPrice\"", table="order_details")
	private BigDecimal unitPrice;
	@Column(name="\"Quantity\"", table="order_details")
	private Integer quantity;
	@Column(name="\"Discount\"", table="order_details")
	private Double discount;
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
