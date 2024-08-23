package aug22;

import aug22.LinkedList.Node;

public class Demoo {
	
	
	
	
	static class Node{
		
		int data  ;
		Node  next  ; // uski jesa agla object 
		
		Node(int d) {
			data  =  d  ;
			next  = null  ;
		}
		
		
		
		
	}
	
	public static Node deleteLastNode(Node head) {
		
		
		//1,3,4346,y543423,23,2,,5,45,34 , nulll 
		
		Node prev = head;
		
        while (prev.next.next != null) {
        	
        	prev = prev.next;
            
        }
        
        prev.next = null;
        return head  ;
	}
	public static void printLinkedList(Node n) {
		
		Node curr  = n ;
		
		while( curr != null) {
			
			System.out.print(curr.data + " ");
			curr = curr.next ;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Node head  = new Node( 23)  ;
		head.next = new Node(12) ;
		head.next.next = new Node(92) ;
		head.next.next.next = new Node(9) ;
		head.next.next.next.next = head  ;
		

		
		
		
	
		
		               
		//72<-23-- > 12-- > 92 ->9  88 72
		
		                 printLinkedList(head);
		
		
		
		//printLinkedList(deleteLastNode(head));
		 
		
		
		
	}
	
	

}
