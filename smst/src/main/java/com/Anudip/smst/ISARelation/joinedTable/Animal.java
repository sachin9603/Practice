package com.Anudip.smst.ISARelation.joinedTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
	
   @Id
   private Integer aid ;
   private String name ;
   
		public Integer getAid() {
			return aid;
		}
		public void setAid(Integer aid) {
			this.aid = aid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Animal(Integer aid, String name) {
			super();
			this.aid = aid;
			this.name = name;
		}
		   
		
		
		public Animal() {}  ;
		
		
		
		

}
