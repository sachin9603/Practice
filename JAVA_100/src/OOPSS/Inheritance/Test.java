package OOPSS.Inheritance;



class A {
	  public static void display() {  
	        System.out.println("Static method in A");  
	    }  
	    public void show() {  
	        System.out.println("Instance method in A");  
	    }  
}
class B extends A {
	public static void display() {  
        System.out.println("Static method in B");  
    }  
    @Override  
    public void show() {  
        System.out.println("Instance method in B");  
    }  
}
public class Test {
	
	  public static void main(String[] args) {  
	        A a = new B();  
	        a.display();  
	        a.show();  
	    }  

}
