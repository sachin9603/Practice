package jan8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListtt {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		list.add("Rohan"); 
		list.add("Pinki"); 
		
		//Traversing list through Iterator 
		
		Iterator itr=list.iterator();  
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		for(String eee  :list) {
			System.out.println(eee+" chouhan");
		}
		
		
		System.out.println("-------------------------------");
		
		int arr[] = {2334,454,5656,56,76} ;
		
		ArrayList<Integer>  ooo = new ArrayList<Integer>();
		
		for(int ff : arr){
			
			ooo.add(ff) ;
			
			
		}    
		
		
		
		
		
		
		
		
		
	}
}
