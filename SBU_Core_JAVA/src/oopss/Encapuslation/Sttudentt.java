package oopss.Encapuslation;

// java bean  -----all varible private  , and getter setter , and constructor 
public class Sttudentt {
	
	//for security reason  
	
	private String name ;
	private String email ;
	private String sub  ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >3) {
			this.name = name;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	public Sttudentt(String name, String email, String sub) {
		
		this.name = name;
		this.email = email;
		this.sub = sub;
	}
	
	
	
	public Sttudentt() {}
	
	// string representation of object 
	@Override
	public String toString() {
		return "Sttudentt [name=" + name + ", email=" + email + ", sub=" + sub + "]";
	}  ;
	

	
	
	
	
	
	
}
	
	// name ko bahar access karne k liye or 
	