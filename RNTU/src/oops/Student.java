package oops;

public class Student {
	// variable state 
	int roll ;
	String name  ;
	String address  ;
	
	
	// method or behaviour
	
	public void mocktest()  {
		System.out.println("All you to give this test ");
	}
	
	// default constructor  --->> ye aumatic har class mai hota hi hai 
	Student() {
		// ye esa doikat hai 
		// return type --- none but implicitly it is returning object of student 
	}
	
	
	// parameter contructor  --- yadi aap parameter constructor banate ho tohaapko default bhi bannaa hi hai 
	// aap parameter jese hi banate ho toh default nahi automatic aayega phir aapko dfault banana  hi hai 
	
	Student (int r , String na , String address) {
	// this is key word which is give refrrence of current class only 
		
	this.roll  = r ;
	this.address  = address ;
	this.name = na ;
		
		
	}
	
	
	public void display()  {
		System.out.println("student name is "+ this.name);
		System.out.println("Student address  is  "+ this.address);
		System.out.println("student roll number is " + this.roll);
	}
	
	
	

}
