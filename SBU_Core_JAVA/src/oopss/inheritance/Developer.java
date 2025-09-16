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
	public String toString() {
		return "Developer [shift=" + shift + ", bonus=" + bonus + ", name=" + name + ", salary=" + salary + ", email="
				+ email + ", password=" + password + ", userID=" + userID + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	Developer() {
		super() ; // parent defaut constructor ko access
		
	}
}
