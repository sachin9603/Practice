package oops_concept.encapsulation;

public class Demo {
	public static void main(String[] args) {
		
		
		Student s  = new Student() ; /// default ki help se 
		s.setSid(12 );;
		s.setSname("Raka");
		s.setSub("AI");
		
		
		Student ss = new Student(11212, "ALPIN" , "ML") ; // prameter constor ki help se 
		System.out.println(ss);
		

		
		
		Employee dd = new Employee();
		
		dd.setEmpId(232);
		
		dd.setEmpName("Rahul");
		
		
		Address add = new Address() ;
		
		add.setCity("Indore");
		add.setPincode("232323");
		add.setState("MP");
		
	     dd.setEmpAdd(add);
	     
		System.out.println(dd);
		
		
		
		// composition  
		Engine e  = new Engine("10 km/l" , "petrol") ;
		
		// you can not create a car if you ar not passing engine 
		Car c  = new Car(e)  ;
		
		
		System.out.println(c);
		
	}

}
