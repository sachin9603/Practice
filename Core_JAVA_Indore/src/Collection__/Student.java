package Collection__;

public class Student {
   
	private int roll  ; 
	private String  name  ;
	private String sub  ;
	
	
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
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public Student(int roll, String name, String sub) {
		super();
		this.roll = roll;
		this.name = name;
		this.sub = sub;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", sub=" + sub + "]";
	}
	
	
	
	
}
