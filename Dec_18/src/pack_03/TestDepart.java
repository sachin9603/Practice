package pack_03;

public class TestDepart {
	// polymorphism
	// encapsulation   ----> what is this 
	// inheritance 
	// abstraction
	
	
	
//	
//static {
//	System.out.println("sachinji ");
//}
//	
	public static void main(String[] args) {
		Department d1 = new Department() ;
		
		d1.setDepartmentId(1 );
		d1.setDepartmentName("IT");
		d1.setCompanyName("LIC");
		
		System.out.println(d1);
		
Department d2 = new Department() ;
		
		d2.setDepartmentId(7);
		d2.setDepartmentName("QA");
		d2.setCompanyName("LIC");
		
		
		int id  = d2.getDepartmentId() ;
		System.out.println(id);
		
		
	}
}
