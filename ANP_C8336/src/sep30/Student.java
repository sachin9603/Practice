package sep30;

public class Student {
	
	// inheritance 

	int id   ;
	
	String name  ;
	
	int marks  ;
	
	
	
	
	
	public void study() {
		
		System.out.println("haa padd rahe hai ");
		
	}
	
	public int studentFees(){
		
		return 5000 ;
		
		
	}

	
	
//from each class a object will be created and it will be with the help of constructor 
	
	///default  or no args constructor 
	
	
	// all args or // ye hum khud banate hai 
	
	
	// default   --- this is automatically provided by jvm 
	
	
   /// but you are creating a parameterized constructor then default will be vanish or it will be o
// overloaded 
	public Student(int id, String name, int marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

    
	
	
	// if you are creating parameter constructor then you have to must create  default 
	 
	
	 public Student() {
		super();
	}
		
 
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	   
 
 
}
