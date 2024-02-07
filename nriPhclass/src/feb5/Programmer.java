package feb5;

public class Programmer extends Employee {

	int bonous  ;
	
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Programmer(int empId, String name, double salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}

   @Override
	void shift() {
		System.out.println(" from 10 to 10 ");
	}
   
   /// ek class ander ek hi method ko multiple time likhte jaaraahu but para. change kar raha hu 
   
   
  int add(int a , int b) {
	  return a+b ;
	  
  }
  
  int add(int a , int b ,int c) {
	  return a+b+c;
	  
  }
	
	

}
