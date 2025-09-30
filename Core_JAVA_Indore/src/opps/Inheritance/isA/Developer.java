package opps.Inheritance.isA;
// developer is a child of Employee 
// developer is sub class of Employee  
// Developer is a Employee 
public class Developer extends Employee  {
	
	@Override
	public String toString() {
		return "Developer [bonus=" + bonus + ", workingMode=" + workingMode + ", Name()" + getName()
				+ ", Department=" + getDepartment() + ", Salary=" + getSalary() + "]";
	}

	int bonus  ;
	
	String workingMode  = "WFH";

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
	

}
