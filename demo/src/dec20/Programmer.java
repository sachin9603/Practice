package dec20;

public class Programmer extends Employee{
	
//here Programmer is a employee type 	that is called is a realtion ship
	
	private int rank  ;
	private String language  ;
	private int  bonus  ;
	
	
	public Programmer(int empId, int empName, int rank, String language, int bonus) {
		// yaha parent class k construtor mai chije bhej rhaa hu 
		super(empId, empName);
		
		this.rank = rank;
		this.language = language;
		this.bonus = bonus;
	}


	
	
	
	// over ride aane ka maltb hai 
	
	//jo method signature hum use kar rahe the super class  vo same rahega 
	
	
	public Programmer() {
		super();
	}





	@Override 
	public void  shift() {
		System.out.println(" I am programmer so i can extend my shift ");
		System.out.println("plz make sure there is dinner for me ");
	}





	public Programmer(int empId, int empName) {
		super(empId, empName);
	}





	@Override
	public String toString() {
		return "Programmer [rank=" + rank + ", language=" + language + ", bonus=" + bonus + "]";
	}
	


}
