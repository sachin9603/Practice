package oopss.inheritance;

// now developer is child of Employee class 
// developer is a employee 
public class Developer extends Employee {

	String shift = "9 to 12" ;
	int bonus  = 100000 ;
	
	
	public Developer(String name, int salary, String email, String password, String userID, String shift, int bonus) {
		super(name, salary, email, password, userID);
		this.shift = shift;
		this.bonus = bonus;
	}
     
	@Override
	public void doingJOB() {
		System.out.println("doing code only");
	}
	

	@Override
	public String toString() {
		return "Developer [shift=" + shift + ", bonus=" + bonus + ", name=" + name + ", salary=" + salary + ", email="
				+ email + ", password=" + password + ", userID=" + userID + "]";
	}




	Developer() {
		super() ; // parent defaut constructor ko access
		
	}
	
	
	public void sum(int a , int b)  {
		System.out.println(a+b);
	}
	
	public void sum(int a , int b , int c)  {
		System.out.println(a+b+c);
	}
	
	public void sum(double a , int b)  {
		System.out.println(a+b);
	}
	
}
