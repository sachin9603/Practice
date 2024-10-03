package BaiscCrudOperation;

public class VeryExpensiveREsource {
	
	public static VeryExpensiveREsource  obj ;
	
	
	public static VeryExpensiveREsource getInstance() {
		if (obj  ==  null) {
			obj = new VeryExpensiveREsource() ;
			
		}
		
		return obj ;
		
	}
	
	
	
	private VeryExpensiveREsource() {
		
	}

}
