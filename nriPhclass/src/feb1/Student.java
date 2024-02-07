package feb1;

public class Student {

	// normal student  class 
	// mujhe isko  banana hai java bean 
	//  in java bean all variables will be private 
	// it have getter and setter to access this private varible 
	
  private int roll ;
	
  private String name ;
	
  private int marks ;
	
  private String branch ;
				
				public int getRoll() {
					return roll;
				}
				
				public void setRoll(int roll) {
					this.roll = roll;
				}
				
				public String getName() {
					return name;
				}
				
				public void setName(String name) {
					this.name = name;
				}
				
				public int getMarks() {
					return marks;
				}
				
				public void setMarks(int marks) {
					this.marks = marks;
				}
				
				public String getBranch() {
					return branch;
				}
				
				public void setBranch(String branch) {
					this.branch = branch;
				}
				
				public Student(int roll, String name, int marks, String branch) {
					super();
					this.roll = roll;
					this.name = name;
					this.marks = marks;
					this.branch = branch;
				}
				
				public Student() {
				
				}

				@Override
				public String toString() {
					return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", branch=" + branch + "]";
				}
				
//				public void display() {
//					System.out.println("Student name " + this.name);
//					System.out.println("Student roll " + this.roll);
//					System.out.println("Student marks " + this.marks);
//					System.out.println("Student Branch " + this.branch);
//					
//				}
				  
				  // bhai getter setter  ek esi method jiski help se aap ye varible ko bahar access kar sakte hai
				  // or datat ko set  or get kar sakte hai 
				 
				public void preprationForExam() {
					System.out.println("we all doing hardwork for exam ");
				}
	
	
	
	

}
