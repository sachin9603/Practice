package aug16;

import java.util.* ;

public class LinkedListt {
	
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> list   = new ArrayList<>()  ;
//		
//	}
	
	LinkedList
	
 Node head  ;
 
  static class Node {
	  int data  ;
	  Node  next  ;
	  
	  Node(int data) {
		  
		  this. data = data ;
		  next = null  ;
		  
	  }
}
  
  
  public LinkedListt insert( LinkedListt list  , int data) {
	  
	  Node newNode  = new Node(data) ;
	  
	  if(head == null) {
		  head = newNode ;
	  }else {
		  
		 Node lastNode = head  ;
		 
		 while(lastNode.next != null) {
			 
			 lastNode = lastNode.next ;
			 
			 if (lastNode.data == 114) {
				break ; 
			 }
		 }
		Node temp = lastNode.next  ;
		 lastNode.next = newNode  ;
		 newNode.next  =  temp  ;
		 
		 
		  
	  }
	   return list  ; // it using for method chaining 
	 }
  
  
  public void print() {
	  
	  Node currentNode = head  ;
		 
		 while(currentNode.next != null) {
			 System.out.print(currentNode.data + " ");
			 
			 currentNode = currentNode.next ;
			 
		 }
		
		 System.out.println(currentNode.data + " ");
		  
  }
  
  
  // how to insert value after any node 
  public void addValue(  LinkedListt list ,int data , int afterData) {
	  
	  
	  
		 Node newNode = new Node(data)  ;
		 
		 Node currNode = head ; 
		 
		 while(currNode.next != null) {
			 
			 if(currNode.data == afterData) {
				 break  ;
			 }
			 
			 currNode = currNode.next ;
		 }
		 
		Node temp = currNode.next  ;
		currNode.next = newNode  ;
		 newNode.next  =  temp  ;
	}
  
  
  public void addAtFirst( LinkedListt list  , int data) {
	 
		  Node newNode  = new Node(data) ;
		  
		  newNode.next = head   ;
		  
		  
		  
  }
  
  
  public void deleteValue(  LinkedListt list ,int data) {
	  
	  
	  
		 
		 Node currNode = head ; 
		 
		 while(currNode.next != null) {
			 
			 if(currNode.next.data == data) {
				 break  ;
			 }
			 
			 currNode = currNode.next ;
		 }
		 
		 currNode.next =  currNode.next.next ;
		 
		
	}
  
  public static void main(String[] args) {
	 
	  LinkedListt list  = new LinkedListt()  ;
	  
	 list =  list.insert(list, 12) ;
	 list =  list.insert(list, 114) ;
	 list =  list.insert(list, 33) ;
	 list =  list.insert(list, 542) ;
	 list =  list.insert(list, 132) ;
	 
	 list.print();
	 list.addValue(list, 115, 114);
	 
	 list.print();
	 list.deleteValue(list, 132);
	 
	 list.print();
	  
}
  
}
