package Collectionn;

import java.util.LinkedList;

public class LinkedListIMPL {
// 5 4 6 7 ---> null 
     Node head  ;
     
    static class Node{
		int data  ;
		Node next  ;
		
		Node(int data)  {
			this.data  =  data  ;
			this.next = null  ;
		}
	}
	
	
public LinkedListIMPL add( LinkedListIMPL list , int data) {
		// head 5 79
		Node newNode = new Node(data)  ;
		if (list.head == null) {
			list.head = newNode  ;
			
		}else {
			Node last = list.head ;
			
			while(last.next != null) {
				last = last.next ;
				
			}
			last.next = newNode ;
		}
		return list;
	}




   public void print(LinkedListIMPL list )  {
	   
	   Node currentNode  = list.head  ;
	   
	   
	   while(currentNode.next  !=  null) {
		   System.out.print(currentNode.data+" ");
		   currentNode  = currentNode.next ;
		   
	   }
	   System.out.print(currentNode.data);
	   
	   
   };
   
   
   public static void main(String[] args) {
	   
	   
	   LinkedListIMPL list = new LinkedListIMPL()  ;
	   list.add(list, 12);
	   list.add(list, 2);

	   list.add(list, 182);

	   list.add(list, 129);
	   list.add(list, 12);
	   list.add(list, 2);

	   list.add(list, 182);

	   list.add(list, 0);
	  list.print(list) ;

	   
	   
	   
	   
	   
	
}
   }




