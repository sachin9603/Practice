package com.Anudip.Employee_6878.different;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@MappedSuperclass
public class Myproduct {


		@Id
		private long productId;
		private String name;
		
		
		public long getProductId() {
			return productId;
		}
		public void setProductId(long productId) {
			this.productId = productId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Myproduct(long productId, String name) {
			super();
			this.productId = productId;
			this.name = name;
		}
		
		public Myproduct() {};
			

}
