package jul17;

public class Mainnnn {
	
	
	public static void main(String[] args) {
		
//		Box  box  = new Box("this is String") ; 
//		System.out.println(box.getValue());
//		
//		
		
//		Box  box2  = new Box(30) ; 
//		
//		box2.container = true  ;
//		
//		System.out.println(box2.getValue());
		
		Box<String> tt  =  new Box<String>("VIVO") ; 
		
		//tt.container  = true ;
		
		System.out.println(tt.getValue().getClass().getName());
		
		
		
		Box<Integer> ll  = new Box<Integer>(12121) ;
		ll.container = 4545  ;
		System.out.println(ll.getValue().getClass().getName());

		
		
		
	}

}
