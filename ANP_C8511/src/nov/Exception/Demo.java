package nov.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Demo {

	
	
	public static void main(String[] args) {
		
		
		System.out.println(2);
		System.out.println(2*2);
		System.out.println(2*3);
		
	
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		System.out.println(2*10);
		// 1000 lines code 
		
		Demo d = new Demo() ;
		
		
		
		
		
		
		
		
	// checked exception (Compile time exception )
		
		// unchecked exception  (Runtime excetpion)
		//NumberFormatException , arry out of bond  , / by zero (arithametic exception )  
		// StringIndexout of bond 
		// nullpointerexception 
		/// ..... all exception which would be exception Runtime class will be Runtime time or compiletime exception 
		
		
		
		
		// those exception which are extending runtimeException  class all aree Unchecked Excetion 
		
		
		
		String s2  = "sachin" ;
	//	System.out.println(s2.charAt(8)); /// stringindexoutof bond exception  
		// 0 1 2 3
		
		int[] arr  = new int[3] ;
		
		arr[0] = 12  ;
		arr[1] = 13  ;
		arr[2] = 14  ;
		
		System.out.println(arr[2]);
		
		String kk  = "78999" ; // it was string 
		System.out.println(kk+kk);
		
		Integer num  = Integer.parseInt(kk) ; // now its data type is number 
		
		System.out.println(num+num);
		
		
		String gg  = "80980"  ;
		System.out.println(gg.length());
		
		
		try {
			FileInputStream ffff = new FileInputStream("ANP8511.txt");
			
			// if there would be exception 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
