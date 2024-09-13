package sep12.Threads;

public class ListList {
	
   Node head  ;
   
   static class Node{
	   int data ;
	   Node next ;
	    Node(int data){
	    	
	     this.data  = data  ;
	     this.next = null  ;
	     
	    }
	 }
   
   public ListList add (int data  , ListList ll  ) {
	   
	   Node newNode  = new Node (data)  ;
	   
	   Node curr  = ll.head  ;
	   
	   if (curr == null ){
		   
		   ll.head = newNode ;
		   return ll  ;
	   }
	   
	   while(curr.next != null) {
		   curr = curr.next ;
		 
	   }
	   curr.next  = newNode ;
	   
	   return ll  ;
	   
	   
   }
   
   public void print(ListList  kl) {
	  
	  Node curr  = head ;
	  
	  while(curr != null  ) {
		  System.out.println(curr.data);
		  
		  curr  = curr.next ;
		  
	  }
	   
   }
   
   public static void main(String[] args) {
	
	   
	   ListList lp  = new ListList() ;
	   
	   
	   lp.add(23, lp);
	   lp.add(44, lp) ;
	   lp.add(89, lp) ;
	   lp.add(34, lp) ;
	   
	   lp.print(lp);
	   
	   
}
	

}
