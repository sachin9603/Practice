package keyword;


import java.util.ArrayList;

public class Student  {
	
	
	
    static int rollnumer  ;
    
   static void mv(){
    rollnumer = 100 ;
   }	
    	
    
    
	String name  ;
	static String collegename  = "OUS" ;
	 
	
	
	 
	 public void change()  {
		 collegename = "Truba" ;
		 
	 }
	
	
	public int getRollnumer() {
		return rollnumer;
	}
	public void setRollnumer(int rollnumer) {
		this.rollnumer = rollnumer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	public Student(int rollnumer, String name, String collegename) {
		
		this.rollnumer = rollnumer;
		this.name = name;
		this.collegename = collegename;
	}
	
	
	public Student() {}
	
	
	@Override
	public String toString() {
		return "Student [rollnumer=" + rollnumer + ", name=" + name + ", collegename=" + collegename + "]";
	}  ;
	
	
	public  static void study()  {
		System.out.println("studying ");
	}
	
	
	
	
	
}
