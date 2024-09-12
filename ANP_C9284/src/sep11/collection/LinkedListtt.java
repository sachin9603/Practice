package sep11.collection;

public class LinkedListtt {
	
	Node head ;
	
	
	//Student s  ;
	
	static class Node{
		
		int data ;
		Node next ;// agle vaale iske hi jese object ka refereance 
		
		Node(int data ) {
			this.data  = data ;
			this.next  =  null  ;
			
		}
		
	}
	
	public static LinkedListtt add(LinkedListtt  list  , int data)  {
		
		Node Newnode  = new Node(data) ; // isko kisi linked list mai add karna hai or kaha par last mai 
		
		if(list.head  == null) {
			
			list.head  = Newnode ;
			return list ;
		}
		
		Node curr  = list.head ;
		
		// traversing till last node 
		
		while(curr.next != null) {
			curr = curr.next;
		}
		// adding value into last 
		
		curr.next  = Newnode ;
		
		return list ;
	}
	
	public static void print(LinkedListtt  list ) {
		
		Node curr  = list.head ;
		System.out.println("linked list ");
		// curr null nahi tab tak aage badte jaao 
		
		while(curr != null) {
			
			System.out.print(curr.data+" " );
			curr= curr.next ;
			
		}
		
		
	}
	
	// delte particular data from linked list 
	
	
	
	public static void main(String[] args) {
		
		LinkedListtt list  = new LinkedListtt () ;
		
		list.add(list, 12) ;
		list.add(list, 123) ;
		list.add(list, 54) ;
		list.add(list, 32) ;
		
		list.print(list);
		
		// 2 4 16 88  98
		// 3 7 78 80 100  ; 
		//
		
		
		
		
	}
	
	

}
