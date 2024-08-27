package aug27;

import java.util.Objects;

public class Student {
	
	private int id  ; 
	private String name  ;
    public static String college  = "IES" ;
    private String address ;
    
	
	
	
	public Student() {} ;

	public Student(int id, String naam, String add  ) {
	
		this.id = id;
		this.name  = naam  ;
		this.address  = add;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	public   void study() {
		college  = "MANIT" ;
		
		
		
		System.out.println("pad rahe hai ");
	}
	
	public   void scrolling() {
		college  = "farzi sa college " ;
		System.out.println(" doing time waste and life waste  ");
	}

}
