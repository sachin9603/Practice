package Stringss;

public class Student {
	
	int rollnumber  ;
	String name  ;
	
	 static String college  = "VIT" ; // at class i have declare something so i will static keyword 
	
	public Student(int rollnumber, String name) {
		
		this.rollnumber = rollnumber;
		this.name = name;
	}
	
	public void khubPado() {
		System.out.println(" all students are doing just acting ");
		
	}
	
	
	
	public static void reelScrolling() {
		System.out.println(" all students are inside the endless loop of reels  ");
		
	}
	
	

}
