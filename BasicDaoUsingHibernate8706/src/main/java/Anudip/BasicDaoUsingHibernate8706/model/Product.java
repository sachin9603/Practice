package Anudip.BasicDaoUsingHibernate8706.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name  = "product_details")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId  ;
	
	@Column(name= "PName")
	private String ProductName  ;
	private double productPrice  ;
	
	// it will ignore this address thing into our database 
	private String delAddress;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product() {} ;
	
	
	public Product(int productId, String productName, double productPrice, String delAddress, Date date) {
		super();
		this.productId = productId;
		ProductName = productName;
		this.productPrice = productPrice;
		this.delAddress = delAddress;
		this.date = date;
	}
	public String getDelAddress() {
		return delAddress;
	}
	public void setDelAddress(String delAddress) {
		this.delAddress = delAddress;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + ", productPrice=" + productPrice
				+ "]";
	}
	
	

}
