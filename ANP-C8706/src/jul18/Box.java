package jul18;

public class Box<T>{
	
	
	T container  ;
	
	
	public Box (T cc ) {
		
		this.container  = cc  ;
		
		
	}
	
	public Object getValue() {
		return  this.container ;
		
	}
	

}
