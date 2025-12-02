package multiThreadingg.deadlock;
class Main {
public static void main(String[] args) {
	A a1 = new A();
	B b1 = new B();
	
	ThreadA t1 = new ThreadA(a1, b1);
	ThreadB t2 = new ThreadB(a1, b1);
	
	t1.start();
	t2.start();
}
}
