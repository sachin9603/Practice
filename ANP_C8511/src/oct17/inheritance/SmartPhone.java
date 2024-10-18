package oct17.inheritance;

public class SmartPhone extends Device  {

	String operatingSystem  ;
	String cameraResolution  ;
	
	

	
	
	
	public void smartPhoneSPecification() {
		System.out.println( brand + "   "+ model);
		System.out.println("operatingSystem is " +operatingSystem);
		System.out.println("cameraResolution is " + cameraResolution );
		
	}
	
	public void takePhoto() {
		System.out.println("click ");
	}
	
	public static void main(String[] args) {
		
		SmartPhone ss = new SmartPhone() ;
		ss.brand = "samsung" ;
		ss.cameraResolution  = "108 mg" ;
		ss.model = "s21" ;
		ss.operatingSystem =  "latest" ;
		
		
		ss.smartPhoneSPecification();
		ss.powerOn()  ;
	boolean pp  = ss.power ;
	System.out.println(pp);
	
	
	
	
		ss.takePhoto(); 
		
		
		ss.powerOff()  ;
		boolean ppp  = ss.power ;
		System.out.println(ppp);
		
		
	}
	
	
	
//	Question 2: Multilevel Inheritance
//	Scenario: Create a base class called Person, a derived class called Employee that inherits from Person, and a further derived class called Manager that inherits from Employee. The Person class should contain attributes for name and age, along with a method to display personal information. The Employee class should add attributes for employeeId and department, along with a method to display employee-specific information. The Manager class should add an attribute for teamSize and a method to display manager-specific information.
//	Requirements:
//	Implement the Person class with the required attributes and methods.
//	Implement the Employee class that inherits from Person and adds its own attributes and methods.
//	Implement the Manager class that inherits from Employee and adds its own attribute and method.
//	Create an instance of Manager, set its attributes, and demonstrate the usage of all methods.
//	
}
