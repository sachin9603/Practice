package Aug6.DesignPattern.factory;

public class Client {
	
	public static void main(String[] args) {
		 
	//	Employee s  = new AndroidDeveloper() ;
		
	Employee e  =  EmployeeFactory.getEmp("Android Developer") ;
	int s   = e.getSalary();
	System.out.println(s);
		
		
	}

}
