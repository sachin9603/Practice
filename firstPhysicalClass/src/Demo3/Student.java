package Demo3;

import java.util.Objects;

public class Student {
	
	 /// bubble sort , selection sort 
	   int id  ; 
	 String name  ;
	int rollNumber  ;
	
	
	// parameter constructor 
    
	 public Student(int id, String name, int rollNumber) {
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
	}
// jese hi parameter vala constructor banaya 
// jo jvm se mil raha tha default vala  vo gayab ho jaayega 
	// contructor 
	 
		 // ek esi method hai jo class ka object deti hai class
		 /// iska return type kuch nahi  hota hai 
		 
		 
		 // default const  ----phle se hi j
			 
	 public Student() {
		 System.out.println("ramram");
	 } ;
	 
	


	public void shiftTimeBatao() {
		 
System.out.println("10 baje aana hai or  2 baje jana hai ");
	 }
	 
	 public void shiftTimeBatao(int in  , int out ) {
		 
		  int hours  = out - in ;
		 System.out.println(" aapne itnae  ghante pade " + hours );
		 	 }
	 
	 public char gradeBatao(int marks ) {
		 
		 
		 System.out.println();
		 
		 System.out.println();
		 
		 
		 if(marks >500  ) {
			 return 'A' ;
		 }else if(marks <500 && marks > 300 ) {
			 return 'B' ;
			 
		 }else {
			 return 'c' ;
		 }
	 }
	 
	 

	 @Override
	public int hashCode() {
		return Objects.hash(id, name, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
	 
	 
	 
	 
		 
}
