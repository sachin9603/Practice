package jul15;
import java.util.* ;


public class LinkedList {

   Node  head;
   
   static class Node{
	   
	   int data  ;
	   Node next  ;
	   
	   Node(int da){
		   this.data  = da ;
		   next  = null ;
		}
	   
   }
   
  public static LinkedList insert(LinkedList list ,int data ) {
	   
	   Node new_Node  = new Node(data) ;
	   
	   if (list.head == null) {
		   list.head = new_Node ;
		   
	   }else {
		   Node last  = list.head ;
			// 12 ,14 , 13, 15 , 
		   while(last.next != null) {
			   last = last.next;
			   
		   }
		   last.next = new_Node ;
		   
	   }
	   
	   return list  ;
	   
   }
  
  
    public static void printlist(LinkedList  list) {
    	Node currentnode  = list.head ;
    	System.out.println("linked list ");
    	
    	while(currentnode != null ) {
    		System.out.println(currentnode.data);
    		currentnode = currentnode.next ;
    		}
    	
    x}
    
    
    
  public static void main(String[] args) {
	 LinkedList list =  new LinkedList() ;
	  
	  list.insert(list, 12) ;
	  list.insert(list, 13) ;
	  list.insert(list, 19) ;
	  list.insert(list, 18) ;
	  list.insert(list, 20) ;
	  
	  
	  
	  printlist(list);
//	  
//	  LinkedList<String> al=new LinkedList<String>();  
//	  al.add("Ravi");  
//	  al.add("Vijay");  
//	  al.add("Ravi");  
//	  al.add("Ajay");  
//	  Iterator<String> itr=al.iterator();  
//	  
}
  
  
   
   
   
   
    
	

}
