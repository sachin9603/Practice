package aug16;

public class ForLoop {
	
	public static void main(String[] args) {
		
//		System.out.println(25*1);
//		System.out.println(25*2);
//		System.out.println(25*3);
//		System.out.println(25*4);
//		System.out.println(25*5);
//		System.out.println(25*6);
//		System.out.println(25*7);
//		System.out.println(25*8);
//		System.out.println(25*9);
//		System.out.println(25*10);
		
		 // 1            //2    //4     1234 - 234 -234 -234 -234 -234
		for(int i =1  ;i<=10 ;i++ ) {
			
			//3	
			System.out.println(25*i);
			
			        // 1     // 2    // 4
			for (int j  = 0  ;j<5 ;j++) {
				
				// 3
				System.out.println(j);
			}
			
		
		}
		// bahar language 
		
		
		System.out.println("////////////////////////////////////////");
		
		
		int count  = 0 ;
		
		for(int i = 0 ; i< 5 ;i++) { //0 1 2 3 4
			
	 for(int j =0 ;j<5  ;j++) {
		 System.out.print("* ");
	 }
	 System.out.println();
	}
	System.out.println(count);
		
	
	//* 
	//* * 
	//* * * 
	//* * * *
	//* * * * *
	
	
	
	System.out.println("////////////////////////////////////////");
	
	
	for (int i = 0; i < 5; i++) { // 0 1 2 3 4

		for (int j = 0; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
			
	    //* * * * *
		//* * * *
		//* * * 
		//* * 
		//* 
System.out.println("////////////////////////////////////////");
	
	
	for (int i = 4; i >=0; i--) { // 0 1 2 3 4

		for (int j = 0; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	    //* * * * *
		//  * * * *
		//    * * *
		//      * *
		//        *
	
	 
System.out.println("////////////////////////////////////////");


for ( int i = 0; i <5 ; i++ ) { // 0 1 2 3 4
 
	for (int j = 0; j <5; j++) {
		
		if(j<i) {
			System.out.print("  ");
		}else {
			System.out.print("* ");
		}
		
	}
	System.out.println();
}

	}

}
