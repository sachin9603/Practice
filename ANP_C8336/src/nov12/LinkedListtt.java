package nov12;
// internal implementation of linkedlist 
public class LinkedListtt {
	
	Node head ;// if you not putting any value inside this head then it will be nulll
	
	// it is node class to create node object 
	
	static class Node {
		
		int data  ;
		Node next  ; // khud k hi type k object ka reference rakhta ahai 
		
		
		Node(int data){
			this.data  = data  ;
			next = null  ;
		}
		
	}
	public static LinkedListtt insert(LinkedListtt l , int data) {
		
		
		Node newNode  = new Node(data) ; //43
		
		if (l.head  ==  null) {
			l.head  = newNode ;
			
		}else {
			
			// I have to add this new node at last position 
			
			Node last  = l.head ;
			
			while(last.next != null ) {
				last = last.next ;
			}
			
			last.next = newNode ;
			
			
		}
		return l;
		
	}
	
	
	public static void printLinkedList(LinkedListtt list) {
		
		System.out.println("This is your linkedList");
		
		Node currNode  = list.head ;
		
		while(currNode.next != null ) {
			System.out.print(currNode.data+" ");
			currNode = currNode.next ;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		LinkedListtt li  = new LinkedListtt ()  ;
		
		li = li.insert(li, 13) ;
		li = li.insert(li, 14) ;
		li = li.insert(li, 16) ;
		li = li.insert(li, 43) ;
		li = li.insert(li, 183) ;
		 li.insert(li, 183).insert(li, 89) ;
		 
		 
		 
		 printLinkedList(li);
		

		
		
		
		
	}
	
	
	

}
