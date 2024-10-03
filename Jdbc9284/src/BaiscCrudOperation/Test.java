package BaiscCrudOperation;

public class Test {

	public static void main(String[] args) {
		
		VeryExpensiveREsource  kk  = VeryExpensiveREsource.getInstance() ;
		System.out.println(		kk.hashCode());
		
		
		VeryExpensiveREsource  pp  = VeryExpensiveREsource.getInstance() ;
		System.out.println(		pp.hashCode());
		
		

		
		
	}
}
