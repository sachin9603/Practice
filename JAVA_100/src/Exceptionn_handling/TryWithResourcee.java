package Exceptionn_handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcee {

	
	
	public static void main(String[] args) {
		
//		 FileOutputStream fos = null ;
//		try {
//			
//	          fos  = new FileOutputStream("Trialtextfile.txt") ;
//			 
//			 String s = "This is my First Code " ;
//			 
//			 
//			 byte [] arr = s.getBytes() ;
//			 
//			 fos.write(arr); 
//			 
// ;
//       
//			 
//		}catch (Exception e ) {
//			e.printStackTrace();
//		}finally {
//		    try {
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		
		
		/// Try with Resource 
		
		
		try(FileOutputStream obj   = new FileOutputStream("Trialtextfile.txt") ; ) {
			
				 
				 String s = "This is my First Code " ;
				 
				 
				 byte [] arr = s.getBytes() ;
				 
				 obj.write(arr); 
				 

			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		///final , finally  finalize()
		
		
		
		
	}
}
