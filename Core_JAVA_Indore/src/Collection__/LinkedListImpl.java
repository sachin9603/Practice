package Collection__;

import java.util.LinkedList;

public class LinkedListImpl {
	
//	public static void main(String[] args) {
//		LinkedList<Integer>  list  = new LinkedList<>() ;
//		list.add(45) ; /// a node of 45 will get create 
//		list.add(456) ; // vaule , next node ka address 
//		list.add(56) ;}
//	
	
	
	 Node  head   ; // head of linked list and it is always fist node
	 
	
	static class Node {
		
		int data ;
		Node next ;
		
		Node (int d) {
			this.data = d ;
			next = null ;
		}
	}
	
	
	public static LinkedListImpl add (LinkedListImpl  oldLinkedList, int data ) {
		
		Node newNode  = new Node(data);
		
		if (oldLinkedList.head == null ) {
			oldLinkedList.head = newNode;
			
		}else {
			// we will traversse this old list till last 
			//we will add this newnode into last 
			
			Node LastNode  = oldLinkedList.head ;
			while(LastNode.next != null) {
				LastNode = LastNode.next ;
			}
			
			LastNode.next = newNode ;
			
			}
		
		return oldLinkedList;
		}
	
	public static void printList(LinkedListImpl  list) {
		
		Node curr = list.head ;
		
		
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next ;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedListImpl list = new LinkedListImpl()  ;
		
		list.add(list, 12) ;
		list.add(list, 125) ;
		list.add(list, 12332) ;
		list.add(list, 1892) ;
		list.add(list, 712) ;
		
		printList(list);
		
		
	}

}
