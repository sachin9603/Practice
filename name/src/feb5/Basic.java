package feb5;

public class Basic {
	
	
	public static void main(String[] args) {
		
		
		
		//function interface 
		///SAM --- Sigle As
		
		//Comparable  v  = new 
		//Runnable 
		
//		//Comparator 
//		FunctionImpl ii  = new FunctionImpl() ;
//		
//		ii.nameOfSt(0);
//		
//		//Comparator 
//		functionalImpl2 i  = new functionalImpl2() ;
//		
//		i.nameOfSt(0);
//		
		
		//Anonymous class
		
		FunctionFucction ppp  = new FunctionFucction(){
              @Override
			public int squareOF(int a) {
				//System.out.println(" mai hu Anonymous class ");
				return a*a ;
			}
		} ;
		
		
		//Anonymous class
		
				FunctionFucction ppp1  = new FunctionFucction(){
		              @Override
					public int squareOF(int a) {
						//System.out.println(" mai hu Anonymous class ");
						return a*a *a*a;
					}
				} ;
		
		
				FunctionFucction oopp  =(int a) -> a*a *a*a;
				
			System.out.println(oopp.squareOF(5));
		
		
		
		FunctionFucction pp  =  (a) ->   a*a ;
			
		
		
		System.out.println(pp.squareOF(5));
		
		
		//FunctionFucction pp  =  (a) -> System.out.println(" mai hu lambda class " + a);
			
	
		
		// yadi koi method ka kuch return type hai toh  uska kese lamda mai 
		
		
		
		
	//	pp.nameOfSt(654324567);
		
		// lambda expression  
		
		//noname , no modifier  , no return type
		
		
		
		
		FunctionImpl ii  = new FunctionImpl() ;
		
		System.out.println(ii.squareOF(24)) ;
		
	
		
		
	}
 
}
