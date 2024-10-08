package oct4.Encapsulation;
import oct3.Car ;

public class Test extends Car {
	
	static {
		System.out.println("mai hu static block ");
	}
	
	
	
	public static void main(String[] args) {
		Student.busfeeS();
//		Student s  = new Student( "Kaali" , "Mum" , "76878hih98987")  ;
//		s.busfeeS();
//		
//		System.out.println(s.addess);
//		System.out.println(s.name);
//		System.out.println(s.adhar);
		
//		Car   c1  = new Car() ;
//		c1.feature();
//		c1.manufacturingCost() ;
//		c1.s
//		
		
		
		Student pp  = new Student()  ;
		
	     pp.setName("Raam Gopal" );
	     
	     System.out.println(pp.getName());
		
		
		Test c2 = new Test()  ;
		c2.manufacturingCost();
		
		
		Student s5  = new Student()  ;
		s5.setAddess("Indore");
		s5.setName("Kulpratap") ;
		s5.setAdhar("657898765789");
		s5.Collegename  =  "IES" ;
		
		Student s6 = new Student()  ;
		System.out.println(Student.Collegename);
		System.out.println(s6.Collegename);
		
		
		
				
		
		System.out.println(s5);
		
		
		
	}
	

}
