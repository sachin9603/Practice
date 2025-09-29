package oops;

// this is example of Encapsulation 
// binding data into single unit is known as encapsulation 
// and java bean  
public class Employee {
	
	

	private String  enpName ;
	private String enpAddress  ;
	private String enpdeparment  ;
	
	// for access this private varible wehave to create a method 
	
	// getter 
	public String getEnpName() {
		return this.enpName ;
	}
	
	// to set enpName ---setter 
	
	public void setEnpName(String namee)  {
		if (namee.contains(" ") ) {
			System.out.println("this name is incorrect");
		}else {
			this.enpName  = namee  ;
		}
		}

	public String getEnpAddress() {
		return enpAddress;
	}

	public void setEnpAddress(String enpAddress) {
		this.enpAddress = enpAddress;
	}

	public String getEnpdeparment() {
		return enpdeparment;
	}

	public void setEnpdeparment(String enpdeparment) {
		this.enpdeparment = enpdeparment;
	}

	public Employee(String enpName, String enpAddress, String enpdeparment) {
	
		this.enpName = enpName;
		this.enpAddress = enpAddress;
		this.enpdeparment = enpdeparment;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [enpName=" + enpName + ", enpAddress=" + enpAddress + ", enpdeparment=" + enpdeparment + "]";
	}
	
	
	
	
	
}
