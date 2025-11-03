package OOPSS.Encapsulation;

public class Demo21 {
	
	public static void main(String[] args) {
		
		Student s  =  new Student() ;
		//s.sname = "Sachin ";
		s.setSname("KAlI");
		s.setSroll(78987); 
		s.setAddress("Indore");
		System.out.println(s);
		
		Student s2 =  new Student() ;
		//s.sname = "Sachin ";
		s2.setSname("Vaibhav");
		s2.setSroll(787); 
		s2.setAddress("MUM");
		
		s2.login(787);
		
		
		System.out.println(s2);
		
		
		
		Address add  = new Address()  ;
		add.setCity("Indore");
		add.setPincode("798798");
		add.setState("MP");
		
		Employee e1  = new Employee() ;
		e1.setEmpAdd(add);
		e1.setEmpDep("IT");
		e1.setEmpName("Rahul");
		
		e1.getEmpAdd().setPincode("4566");
		
		System.out.println(e1);
		
		
	}

}
