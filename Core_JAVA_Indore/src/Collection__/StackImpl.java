package Collection__;

import java.util.Stack;
// humara khud ka stack 
public class StackImpl {
	// can you create you own stack 
			// need a stack implementation in java using array 
			//Stack<String>  st  = new Stack<> ()  ;
			// push --- data add 
			// pop -- last data remove 
			//peek ---- will return that data is about to remove
			
			
		private int size  ;
		private int [] arr ;
		private int top ; // index 
		
		
     public StackImpl (int sizee) {
    	 this.size = sizee  ;
    	 this.arr = new int[sizee] ;
    	 top = -1; // ye hai index ki taraversing k liye internal variable
     }
     public void push(int val) {
    	
    	 if (top == size-1) {
    		 System.out.println("stack is full you can't add element ");
    		 return ;
    	 }
    	 top++;
    	 
    	 arr[top]= val ;
    	 
     }
     // method is used for poping the data which is used to remove last element 
     
     public int pop() {
    	if(top == -1) {
    		// koi element hoi nahi hai toh konsa array nikalna chahate ho
    		System.out.println("stack underflow --- arrya is empty");
    		return -1;
    	}
    	int lastelement  = arr[top--];
    	System.out.println("Poped element is " +lastelement );
        return  lastelement ;
    }
     
     public int peek() {
    	 if(top ==-1) {
    		 System.out.println("Stack is empty ");
    		 return -1 ;
    	 }
    	 int lastelement  = arr[top];
     	System.out.println("peek element is " +lastelement );
         return  lastelement ;
     }
     
     public boolean isEmpty() {
    	 return top == -1 ;
    	 
     }
     
     
     public static void main(String[] args) {
		 
    	 StackImpl st = new StackImpl(5)  ;
    	 st.push(78);
    	 st.push(8);
    	 st.push(787);
    	 st.push(768);
    	 st.push(58);
    	 st.pop()  ;
    	 st.pop()  ;
    	 st.pop()  ;
    	 st.pop()  ;
    	 st.pop()  ;
    	 
    	 
    	 
    	 st.peek();
    
    	 st.peek();
    	 st.peek();
    	 boolean ans = st.isEmpty();
    	 System.out.println(ans);
    	 
    	 
	}
     
	
	
	
	
	
	
	
	
	

}
