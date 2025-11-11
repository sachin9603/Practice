package OOPSS.polymorphism;

public class Demo {
	
	//poly
	//morphism
	
	///-compile time polymorphism-- Method overloding --- ek hi class , changing in number of parameters of one method and creating other methods of same name  
	
	
	// overloading 
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public String  add(double a, double b) {
		System.out.println(a+b);
		return "done" ;
	}
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo() ;
		d.add(4.5, 2.6);
		d.add(45, 89);
		d.add(89, 10, 75);
		
	}
	
	

}
