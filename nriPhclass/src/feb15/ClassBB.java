package feb15;

public class ClassBB {

	
	public   void fun2() {
		System.out.println("inside fun2 of BB");
	}
	
public  void funB(ClassAA a) {
		
		System.out.println("inside funB  of BB");
		a.fun1();
		
		System.out.println("end off fun B of BB");
	}
	
}
