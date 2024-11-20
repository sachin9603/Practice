package nov_14.collection;

// this is no origal
public class Linkedlist {
	
	
	Node head ; // yaha kuch nahi matlab null hai 
	
	
	static class Node {
		
		int data  ;
		Node next  ;
		
		Node( int d) {
			this .data  = d  ;
			next = null ;
			
		}
		
	}
	
	
	public Linkedlist insert(Linkedlist  list , int data) {
		
		Node  newNode = new Node(data) ;
		
		
		if (list.head  == null ) {
			list.head   = newNode ;
			
		}else {
			
			Node lastNode  = head  ;
			
			
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			
			lastNode.next  = newNode ;
			
			
		}
		
		
		return list  ;
		
	}
	
	public static void main(String[] args) {
		
		Linkedlist  li  = new Linkedlist() ;
		
	li  = 	li.insert(li,12) ;
	li  = 	li.insert(li,122) ;
	li  = 	li.insert(li,124321) ;
	li  = 	li.insert(li,1232) ;
	
	
		
	Node currentNode  = li.head ;
	
	while(currentNode.next != null) {
		System.out.println(currentNode.data);
		currentNode = currentNode.next;
	}
	System.out.println(currentNode.data);
	
		
		
		
	}
	

}
