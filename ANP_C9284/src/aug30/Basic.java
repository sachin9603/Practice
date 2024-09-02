package aug30;

import java.util.List;

// java mai jo bhi nahi chije aap use kar rhe ho uska package import karna padata hai
// java mai  java. lang package automatic import rehata hai there is no need import explicitly 

public class Basic {
	
	// class area ,   heap area   , stack area 
	
	public static void doingSomeTask(){
		System.out.println("work done "); 
		
		
		
	}
	
	public static void main(String[] args) {
		
	
		
		int i   = 10 ; 
		
		// but ye data user type kar raha hai 
		int j  =  10 ;
		
		int task  = i/j ; // shayad ye line kuch error dede but 
		
		System.out.println(task);
		
		System.out.println(" 10000 lines of code ");
		
		
		doingSomeTask() ;
		
// unchecked ---- matlab ki program ko jab run kar rahe hai tab isse aarha ahai
		// they are called as runtime Exception 
		
		// error kisko bolte 
		
		int [] arr  =  new int[5] ;
		
		arr[0] = 12  ;
		arr[1] = 13 ;
		arr[2] = 14  ;
		arr[3] =15  ;
		arr[4]  = 17  ;
		
		
		
//		arr[5] = 89 ; // 65 th position itna pehale se decide nahi hai 
//		
//		System.out.println(arr[5]);
//		
		
		String k  = "sachin";
		System.out.println(k.charAt(5));
		
		String age  = "eighteen" ; 
		
		
//		if{
//			
//			// agar chale toh theek hai 
//		}else {
//			// there is proplem 
//		}
		
		try {
			
			int agee = Integer.parseInt(age);
			
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("1000000 line chalegi ");
		
		
		
		
		
		// notes ---- Exception jo bhi class extend kar rahi hai  all are
		// checked exception except Runtime exception
		
		// notes  --- jo bhi class Runtime  Exception ko extend kar rahi hai vo saariu
		
		// uncheckexception hoti hai 
		
		
		
		// jab aap code likh rahe ho tab hi exception aajaye  
		// matlab ki ki compiler hi bata de ki ye line kuch error de sakti hai 
		// checked yaa complie time exception hai 
		
		
		
		
		 
				
		
	}

}
