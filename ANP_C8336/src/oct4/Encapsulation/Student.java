package oct4.Encapsulation;

// java bean  --- bean bag  --- most imp 
public class Student {
	
	// declare all variables as private 
	// create getter setter  
	// create all agrs constructor 
	// create no args constructor 
	// create to String  method also 
	
	private String name  ;
	private String addess  ;
	private String adhar  ;
    public static  String Collegename  = "IES" ;
	
	
	// or in varibal ko access karne k liye aapko do method banan hai ek kaa hai value ko set
	
	// setter
	public void setName(String naam ) {
	
		this.name  = naam  ;
		
	}
	
	// getter 
	public String getName() {
		return this.name ;
		
	}
	
	
	
	public static void busfeeS() {
		System.out.println("sab par aaply hogi ");
	}
	
	
	
	
	
	public String getAddess() {
		return addess;
	}

	public void setAddess(String addess) {
		this.addess = addess;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public Student(String name, String addess, String adhar) {
	
	this.name = name;
	this.addess = addess;
	this.adhar = adhar;
	    
	}
	
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addess=" + addess + ", adhar=" + adhar + "]";
	};
	
	
	

}
