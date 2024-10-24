package Anudip.Hibernate9284.Inhertance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Product_type" , discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("100")
public class MyProduct{
	
	
	@Id
	private int productId  ;
	private String productName ;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public MyProduct(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public MyProduct() {
		super();
	}
	
	
	
	
	

}
