package OOPSS.polymorphism;
//B is a A
public class B extends A {
    
	@Override
	public void saveData(String s) {
		System.out.println("This is B area");
		System.out.println("We have to save data OF B");
		//return "s" ;
	}
	
	public static void main(String[] args) {
		
		A a = new A()  ;
		a.saveData("PAA"); // A
		
		A a1 = new B() ;// 
		a1.saveData("Sachin");
		
		B a2 = new B() ;
		a2.saveData("Pooja");
		
	}
}
