package june24.Finall;

public class Student {
	
	int rollnumber ;
	String name  ;
	final String college ;
	
	
	public Student(String name ) {
		this.college = name;
		
	}
	
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", college=" + college + "]";
	}


	public static void main(String[] args) {
		
		
		Student s  = new Student("NRI") ;
		s.name = "Tushar" ;
		s.rollnumber =11212;
		//s.college = "SISTEC" ;
		
		System.out.println(s);
		

		Student ss = new Student("Dvv") ;
		ss.name = "Tushar" ;
		ss.rollnumber =11212;
		//s.college = "SISTEC" ;
		
		System.out.println(ss);
				
	}

}
