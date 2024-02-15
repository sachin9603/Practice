package feb15;

public class ClassAA {
	
	public synchronized void  fun1(){
	
		System.out.println(" inside fun1 of AA ");
	}
	
	public synchronized void funA(ClassBB b) {
		
		System.out.println("inside fun A of AA");
		b.fun2();
		
		System.out.println("end off fun A of AA");
	}
	
	

}
