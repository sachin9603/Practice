package oct4.Encapsulation;

public class Testnew {
	
	
	public static void main(String[] args) {
		
		Address add  = new Address(89 , "Munnar " , "Kerala") ;
		
		Student s  = new Student() ;
		s.setAddress(add);
		
		s.setAdhar("7862836343");
		
		s.setName("Richard Jhonson");
		
		
//		add.setCity("Delhi");
//		s.setAddress(add);
		
		
		s.getAddress().setCity("MUMBAI");
		
		System.out.println(s.getAddress().getCity());
		
		
		System.out.println(s);
		
		
		
		// you have only this 
		//s 
		
		
	
		
		
		
		
	}

}
