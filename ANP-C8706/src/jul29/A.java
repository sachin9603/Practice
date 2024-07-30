package jul29;

public class A {
	// at once i can call only one synchronized method 
	public synchronized void funA(B b1){
		System.out.println("funA of A starts");
		b1.fun2(); /// no issue yet ye bhai isko call kar raha hai jo niche fun1 hai
		//but
		System.out.println("funA of A ends");
		}
	
		public void fun1(){
		System.out.println("inside fun1 of A");
		}

}
