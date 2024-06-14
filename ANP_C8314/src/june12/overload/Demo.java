package june12.overload;

public class Demo {
	
	
	
	public static  int haiComputerSumKaro(int a  , int b) {
			return a+b ;
	}
	
	// ek hi method k ander number of parameter change kardiye hai or isiko bolte hai overload 
	// compiletime polymorphism
	public static  int haiComputerSumKaro(int a  , int b , int c) {
		return a+b+c;
}
	
	public static  void haiComputerSumKaro() {
	System.out.println("kuch nahi hai ");
}
	
	
	public static void main(String[] args) {
		
		int h  = 12  ;
		int u  = 89  ;
		int gg  = 70 ;
		
		int c   = haiComputerSumKaro(h , u) ;
		haiComputerSumKaro() ;
		int p  = haiComputerSumKaro(h ,u  , gg) ;
		
		System.out.println(p);
		
		
		System.out.println(c);
		
	}

}
