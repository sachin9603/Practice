package oct21.Encapsulationnn;
//java bean 
public class Student  {
	
//id  , name  , marks , section  , Subject , address  , email  , username  , password  , phonenumber 
	
	// making all variable private 
 private int id    ;
 private String name   ; 
 private String adress  ;
 
 
 
  // setter 
 // ek isi method jo ki private name mai value fit karegi 
 
 
 public void setName(String mm) {
	 
	 this.name  = mm  ;
	 
 }
 
 // getter banano 
 // it is method that willl give you name if you will call it  
 
		 
		 public String getName() {
			 
			return this.name ;
			 
		 }
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getAdress() {
			return adress;
		}
		
		public void setAdress(String adress) {
			this.adress = adress;
		}

		public Student(int id, String name, String adress) {
			super();
			this.id = id;
			this.name = name;
			this.adress = adress;
		}
		 
		
		// no-args constructor 
		
		public Student() {}

		@Override
		public String toString() {
			
			return "Student [id=" + id + ", name=" + name + ", adress=" + adress + "]";
		} ;
//		
		
		
		///Constructor
		
			
			

}
