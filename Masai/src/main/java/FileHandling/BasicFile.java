package FileHandling;

import java.io.File; 
import java.io.IOException;
public class BasicFile {
//	File handling implies how to read from and write to file in Java. Java provides the basic 1/0 package for reading
//	and writing streams. java.io package allows to do all Input and Output tasks in Java
//	
//	import java.file.
	
	// stream are two types Byte streams and chracter 
//	canRead()
//	canWrite()
//	createNewFi1e()
//	Delete()
//	Exists()
//	getName()
//	getAbs01utePath( )
//	Length()
//	List()
//	Mkdir()
//	Tests whether file is readable or not
//	Tests whether the file is writable or not
//	Creates an empty file
//	Deletes a file
//	Tests whether the file exists or not
//	Returns the name of the file
//	Returns the absolute pathname of the file
//	Returns the size of the file in bytes
//	Returns the array of the file in the directory
//	Creates a directory
	
	
	public static void main(String[] args) {
//		
//		try {
//			File myobj  = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Desktop\\FileFile\\Filef1.txt") ;
//			if(myobj.createNewFile()) {
//				System.out.println("File has been created : " + myobj.getName());
//			}else {
//				System.out.println("file alredy there");
//			}
//		}catch(IOException e){
//			e.printStackTrace();
//			
//		}
		


 File myobj  = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Desktop\\FileFile\\Filef1.txt") ;

	if (myobj.exists())	{
		System.out.println("File name " +myobj.getName() );
		
		System.out.println("Absolute path :  " +myobj.getAbsolutePath() );

		System.out.println(" writeable " +myobj.canWrite() );

		System.out.println(" Readable" +myobj.canRead() );

		System.out.println("File size in bytes " +myobj.length() );

		
	}else {
		System.out.println("file does not exit .");
	}
		
	}
	
	
	
	
}
