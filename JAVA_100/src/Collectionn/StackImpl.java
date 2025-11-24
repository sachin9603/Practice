package Collectionn;

import java.util.Stack;

public class StackImpl {
	
	private int maxSize ;
	private int [] arr ;
	private int top ; // index 
	
	
	
	public StackImpl(int size)  {
		this.maxSize = size ;
		this.arr = new int[size];
		this.top = -1 ;
		
		
	}
	
	public void push(int data) {
		if(top == maxSize -1) {
			System.out.println("stack is full ");
			
			return ;
		}
		//top++ ;
		arr[++top] = data ;
		System.out.println("data has been pushed "+ data);
		
	}
	
	public int pop() {
		
		if (top == -1) {
			System.out.println("There is no element ");
			return -1 ;
			
		}
		
		int topElement = arr[top--] ;
		//top-- ;
		System.out.println("TOP element is " + topElement);
		return topElement ;
				
		
	}
	
	public int peek()  {
		if (top == -1) {
			System.out.println("There is no element ");
			return -1 ;
			
		}
		
		int topElement = arr[top] ;
		
		System.out.println("last element is " + topElement);
		return topElement ;
				
	}
	public boolean isEmpty()  {
		return top == -1 ;
	}
	
	
	
	public static void main(String[] args) {
		StackImpl stt  = new StackImpl(5)  ;
		
		stt.push(78);
		stt.push(8);
		stt.push(789);
		stt.push(708);
		stt.push(7822);
		
		stt.pop()  ;
		stt.pop()  ;
		
		int last_element = stt.peek() ;
		System.out.println(last_element);
		
		
	}
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		Stack<Integer> st = new Stack<>()  ;
//		// push 
//		// pop --- last data remove 
//		// peek --- jo data remove hone vala hai us data ko show 
//		
//		
//		
//	}

}
