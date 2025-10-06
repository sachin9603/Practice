package opps.Inheritance.isA;
// developer is a child of Employee 
// developer is sub class of Employee  
// Developer is a Employee 
public class Developer extends Employee  {
	
	
	int bonus  ;
	
	String workingMode  = "WFH";
	
	public void doingCoding() {
		System.out.println("all employee are doing code ");
	}

	public Developer() {
		System.out.println("i am developer constructor ");
	}
	public Developer(int bonus, String workingMode) {
	              // parent k contructor ko access
	
		this()  ;
		
		this.bonus = bonus;
		this.workingMode = workingMode;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getWorkingMode() {
		return workingMode;
	}

	public void setWorkingMode(String workingMode) {
		this.workingMode = workingMode;
	}
	@Override
	public String toString() {
		return "Developer [bonus=" + bonus + ", workingMode=" + workingMode + ",Name = " + getName()
				+ ", Department=" + getDepartment() + ", Salary=" + getSalary() + "]";
	}

	

}
