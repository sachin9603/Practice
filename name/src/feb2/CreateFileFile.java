package feb2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CreateFileFile {
	
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated constructor stub
//		File myFile = new File("sdfasdfasdfasdfasd.txt") ;
//
//			//	File mFile = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT") ;
//				
//				 myFile.mkdir();
//				 
//				 File myFile1 = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT1") ;
//					
//				 myFile1.mkdir();
//				 
//				 File myFile2 = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT2") ;
//					
//				 myFile2.mkdir();
//				 
//				 File myFile3 = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT3") ;
//					
//				 myFile3.mkdir();
//				 
//			 File mFile = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT\\printp.txt") ;
//			 File mFile1 = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT1\\printp.txt") ;
//
//			 File mFile2 = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe\\TTT2\\printp.txt") ;

			 File mFile3 = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Downloads\\deletMe") ;

                        File [] sss  = mFile3.listFiles() ;
                        
                        for(File fff : sss) {
                        	
                        	System.out.println(fff.getName() );
                        	
                        	
                        	
                        }
                      // System.out.println(Arrays.toString(sss));
				 
//				
//				try {
//					if(mFile.createNewFile()) {
//						System.out.println("file has been created  " +myFile.getName());
//
//					}else {
//						System.out.println("file is already there");
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				try {
//					if(mFile1.createNewFile()) {
//						System.out.println("file has been created  " +myFile1.getName());
//
//					}else {
//						System.out.println("file is already there");
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				try {
//					if(mFile2.createNewFile()) {
//						System.out.println("file has been created  " +myFile2.getName());
//
//					}else {
//						System.out.println("file is already there");
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				try {
//					if(mFile3.createNewFile()) {
//						System.out.println("file has been created  " +myFile3.getName());
//
//					}else {
//						System.out.println("file is already there");
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
	}
	
		
		
	

}
