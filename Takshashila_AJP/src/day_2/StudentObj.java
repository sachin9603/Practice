package day_2;

public class StudentObj {

	
	public static void main(String[] args) {
		
		
		Student s1  = new Student()  ;
		
		s1.name=  "Pritam" ;
		s1.address = "Indore" ;
		s1.marks  = 89  ;
		
		s1.displayStudentData();
		s1.study();
		
		System.out.println("--------------------------------------------------");
		
		Student s2  = new Student()  ;
		
		s2.name=  "Pyare" ;
		s2.address = "Jablpur" ;
		s2.marks  = 89  ;
		
		s2.displayStudentData();
		s2.study();
	}
}
