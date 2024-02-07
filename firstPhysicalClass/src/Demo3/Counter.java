package Demo3;

public class Counter {

     int count=0;//will get memory each time when the instance is created  
	  
	Counter(){  
	count++;  
	System.out.println(count);  
	} 
	  
	public static void main(String args[]){  
	//Creating objects  
	Counter c1=new Counter();  
	Counter c2=new Counter();  
	Counter c3=new Counter();
	
//	System.out.println(c1);
//	System.out.println(c2);
//	System.out.println(c3);

	}  
}
