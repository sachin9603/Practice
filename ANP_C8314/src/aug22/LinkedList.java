package aug22;

public class LinkedList {
	
	
	
	static class Node{
		
		int data  ;
		Node  next  ; // uski jesa agla object 
		
		Node(int d) {
			data  =  d  ;
			next  = null  ;
		}
		
		
		public static void printLinkedList(Node n) {
			
			Node curr  = n ;
			
			while( curr != null) {
				
				System.out.print(curr.data + " ");
				curr = curr.next ;
				
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
		
		public static Node reverseList(Node head) {
			
			Node curr  = head  ;
			Node previousNode = null  ;
			Node next  ;
			//  23 -> 33 -> 55 -> 66 -> 675 -> null
			
			while(curr != null) {
				
				// 
				next = curr.next ;
				curr.next  = previousNode  ;
				previousNode = curr   ;
				 curr =   next ;
				
			}
			
			return previousNode;
			
		}
		
		public static void main(String[] args) {
			Node n3  = new Node(55) ;
			
			Node n4  = new Node(66) ;
		
			
			Node n2  = new Node (44) ;
			Node head  = new Node( 23)  ;
			
			
			head.next = n2  ;
			head.next.next  = n3  ;
			head.next.next.next = n4 ;
			//n4.next  =  new Node(675);
			
			
			
			// suppose head of linked list is n and you dont any idea how many nodes then you have to find last node value 
			
			// please write your code here  head   23 -> 33 -> 55 -> 66 -> 675 -> null
			// you have reverse these linked list  null <- 23<--33 <- 55 <- 66 <- 675   head 
			  // 33
	
			
			printLinkedList(head);
			
			
			
			System.out.println("////////////////////////////////////////////////////////////////////////");
			
			System.out.println();
			
			
			printLinkedList(reverseList(head)) ;
			System.out.println();
		Node s  =	deleteLastNode(head);
		
			
		
			
			
			
			
			
		}
		
	}
	
	
	
	

}
