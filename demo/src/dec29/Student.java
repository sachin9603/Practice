package dec29;

public final class Student {
 
	final void run () {
		System.out.println("student is running");
	}


	String name;
	int age;
	String department;
	//default constructor
	public Student( ) {
		
		this.name="Unknown";
		this.age=20;
		this.department="Unassigned";
		
	}
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		this.department=department;
	}
	 public Student(String name,int age,String department) {
		 this.name=name;
		 this.age=age;
		 this.department=department;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
        Student s2 = new Student("Kanak", 20);
        Student s3 = new Student("Dolly", 18, "Computer Science");

        
        System.out.println("Student 1: Name - " + s1.name + ", Age - " + s1.age + ", Department - " + s1.department);
        System.out.println("Student 2: Name - " + s2.name + ", Age - " + s2.age + ", Department - " + s2.department);
        System.out.println("Student 3: Name - " + s3.name + ", Age - " + s3.age + ", Department - " + s3.department);
    }

}
