package sep11.collection;

import java.util.Arrays;

public class Stack {
	
	 private int maxSize ;
	 
	 private int top  = -1 ;
	 
	 private int[] stackArray ;
	 
	// stack st  = new Stack(234) ;\\\
	 
	 public Stack(int size ) { 
		 
		 maxSize  = size  ;
		 stackArray  = new int[maxSize] ;
		// yaha par ek max size  banega or ye default arr [0,0,0,0,0,0,0]
		
		 
	}
	 
	 
	 
	 
	 // push methd to insert the data 
	 // push tab tak kaam nahi karega jab tak ki mai nahi kitane size ka array banana hai 
	 
	 public void push (int element) {
		 
		 if(top>= maxSize -1) {
			 System.out.println("stack is full ! stack Overflow !");
			 return ;
		 }
		 
		 stackArray[++top] = element  ;
		 
	 }
	 
	 // it will remove last value of the array oor it is not removing it is just giving you last value 
	 // moving cursor to previous position
	 
	 
	  public int pop() {
		  if (top <  0) {
			  System.out.println("stack is empty  under flow condition");
			  return -1 ;
		  }
		  return 	 stackArray[top--];
		}
	  
	  // peek () method using java 
	  
	  
	  public int peek() {
		  if (top <  0) {
			  System.out.println("stack is empty  under flow condition");
			  return -1 ;
		  }
		  return 	 stackArray[top];
		}
	  
	  public int size() {
		  if (top <  0) {
			  System.out.println("stack is empty " );
			  return 0 ;
		  }
		  return top + 1  ;
		  }
	  
	  
	  public boolean isEmpty() {
		  return (top == -1)  ;
		  
	  }
	  
	  public boolean isFull() {
		  return top  == maxSize -1 ;
	  }
	 
	 
	  
	 
	@Override
	public String toString() {
		
		return "Stack ["+ Arrays.toString(stackArray) + "]" ;
	}




	public static void main(String[] args) {
		
		Stack st = new Stack(5) ;
		
		st.push(23) ;
		st.push(33) ;
		st.push(43) ;
		st.push(22) ;
		st.push(223) ;
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		st.push(96);
		
		//System.out.println(st);
		
		System.out.println(st.peek());
		
		System.out.println(st.size());
	
		
		
	}
	

}
