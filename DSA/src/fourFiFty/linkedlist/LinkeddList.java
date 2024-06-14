package fourFiFty.linkedlist;

public class LinkeddList {
	
	static Node head; 
	
	
	static class Node{
		int data  ;
		Node next ;
		
		Node (int d){
			 data  = d  ;
			next  = null  ;
			}
	}
	
	Node reverse(Node node ) {
		
		Node pre  = null ;
		Node next  =  null  ;
		Node curr  =   node  ;
		
	
	while(curr != null ) {
		
		next = curr.next ;
		
		curr.next = pre  ;
		pre  = curr ;
		curr = next ;
	}
	node = pre;
	
    return node;
	}
	
	 void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	 
	 
	 // Driver Code
	    public static void main(String[] args)
	    {
	    	LinkeddList list = new LinkeddList();
	        list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);

	        System.out.println("Given linked list");
	        list.printList(head);
	        head = list.reverse(head);
	        System.out.println("");
	        System.out.println("Reversed linked list ");
	        list.printList(head);
	    }

}
