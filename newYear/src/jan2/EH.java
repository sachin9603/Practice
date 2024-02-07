package jan2;

public class EH {
	
	public static void main(String[] args) {
		
		System.out.println("Harshit");
		System.out.println("Harshit");
		System.out.println("Harshit");
		System.out.println("Harshit");
		System.out.println("Harshit");
		int a  = 10  ;
		 int b  = 0 ;
		 
		 try {
//			 int [] arr  = new int[5] ;
//			 
//			 System.out.println(arr[9]);
//			 
//			 
//			 System.out.println(a/b); 
			 
			 String s="1$232374";  
			 int i=Integer.parseInt(s);//NumberFormatException 
			 System.out.println(i);
		 }catch(Exception e) {
			 System.out.println(e);
		 }finally {
			 
			 System.out.println("ram ram");
		 }
		
		
		System.out.println("Harshit");
		System.out.println("Harshit");
		System.out.println("Harshit");
		System.out.println("Harshit");
		
		
		//except Runtime exception all the classes which are extending Exception class that are check exception 
		// all exceptions which are extending that runtime class are called unchecked , runtime exception 
		
		
	}

}
