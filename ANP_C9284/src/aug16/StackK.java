package aug16;

import java.util.Arrays;

// stack Implementation 

public class StackK{
//[12,3,1,232,4,2,4,2]
	
	int maxSize ;
	int[] stackArray ;
	int top  ; // ye index hai internal array ka 
	
	
	
	StackK(int data) {
		this .maxSize  = data  ;
		stackArray = new int[maxSize] ;
		top  = -1  ;
	}
	
	public void push(int value) {
		if(top == maxSize -1) {
			System.out.println("stack over flow ");
			return ;
		}
		stackArray[++top] = value  ;
		
		System.out.println("value is added Successfully ");
	
	}
	
	
	public int peek() {
		if(top == -1) {
			System.out.println("stack over flow ");
			return -1;
		}
		int popData  = stackArray[top] ;
		
		
		System.out.println("value is   "+popData );
		return  popData ;
		
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("stack is Empty ");
			return -1;
		}
		int popData  = stackArray[top] ;
		
		top = top -1  ;
		
		System.out.println("value is removed  ");
		return  popData ;
		
	}
	
	
	public Boolean isEmpty() {
		if(top == -1) {
			System.out.println("stack is Empty ");
			return true;
		}
		return false  ; 
		
	}
	
	public void print() {
		
		for (int i  =0  ;i<=top ;i++) {
			System.out.print(stackArray[i]+ " ");
		}
	//	System.out.println(Arrays.toString(stackArray));
		
	}
	
	public static void main(String[] args) {
		
		
		StackK  st  = new StackK(4)  ;
		
		st.push(12);
		st.push(122);
		st.push(132);
		st.push(142);
		
		st.print();
		
		st.pop() ;
		st.pop()  ;
		
		st.peek()  ;
		st.print();
		
	}
	
	
	
	
	
}
