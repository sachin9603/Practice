package opps.Inheritance;

public class StudentExample {
	
	
	public static void main(String[] args) {
		//Student s1 = new Student("Raka" , "Indore Madhyapradesh  465227" , "CS") ;
		//Student s1 = new Student("Raka" , "456565 HADLAY  MP" , "CS") ;

		//System.out.println(s1);
		
		Address add1 = new Address() ;
		add1.setCity("INDORE");
		add1.setPincode("2456465");
		add1.setState("MP");
		
		System.out.println(add1.hashCode());
		
		Student s1  = new Student()  ;
		s1.setStudentAddess(add1);
		s1.setStudentName("RAKA");
		s1.setStudentsubject("MCA");
		
		s1.getStudentAddess().setPincode("46546546");
		
		System.out.println(add1.hashCode());
		
		
		System.out.println(s1);
		
		System.out.println(s1.getStudentAddess().getPincode());
		//System.out.println(s);
	}

}
