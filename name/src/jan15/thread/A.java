package jan15.thread;

public class A  extends Thread{
	@Override
   public void run() {
		// TODO Auto-generated method stub
		for(int i =20  ;i<=40  ;i++) {
			System.out.println("second thread  --- " + i);
		}
	}
	public static void main(String[] args) {
		A a =new A() ;
		
		B b = new B() ;
		
		b.start();
		
		a.start(); 
		for(int i =0  ;i<=20  ;i++) {
			System.out.println("main --- " + i);
		}
		
		for(int i =40  ;i<=60  ;i++) {
			System.out.println("the end" + i);
		}
	}
}
