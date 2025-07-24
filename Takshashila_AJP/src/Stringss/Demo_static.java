package Stringss;

public class Demo_static {

	static {
		System.out.println(" i am static ");
		
	}
	

	public static void main(String[] args) {
		// 10000 bacche 
		
		// static ko hum without object bhi access kar sakte hai 
		
		Student.reelScrolling();
		
		String s  = Student.college ;
		

		System.out.println(s);
		Student s1  = new Student(232 , "RAKA")  ;
		//s1.college  = "VIT" ;
		
		s1.khubPado();
		
		Student s2  = new Student(32 , "Gaytri")  ;
		//s2.college  ="VIT" ;
		
		System.out.println(s2.college);
		
		
		Student s3  = new Student(2 , "piyush")  ;
		//s3.college  ="VIT" ;
		
		// suppose some data is same for all object so what 
		// i will do i declare that word at class level 
		

		
		
		
		
		
		
		
		
	}
	{
		System.out.println(" i am normal ");
	
	}
	
}
