package oops;

public class Demo {

	// Encapsulation in Java is a process of wrapping code and data together into a single unit. 
	// A capsule is the perfect example
	// of encapsulation because a capsule is a mixture of several medicines.
	
	public static void main(String[] args) {
		
		
		Student s  = new Student()  ;
		
		s.setMarks(25);;
		s.setStudentName("Ravi");
		s.setStudentSubject("English");
		
		
		System.out.println(s.getMarks());
		System.out.println(s.getStudentName());
	}
	
}
1