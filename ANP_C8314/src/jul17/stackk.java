package jul17;

import java.util.Stack;

public class stackk {

	static final int MAX =   1000 ;
	
	int top  ;
	
	int arr[]  = new int[MAX] ;
	
	boolean isEmpty() {
//		if (top <0 ) {
//			return true  ;
//		}else {
//			return false  ;
//			
//		}        -1< 0  == true 
		return top < 0 ;
	}
	stackk() {
		top  =  -1 ;
	}
	
	boolean push(int x ) {
		
		if(top>=MAX) {
			System.out.println("stack overflow ");
			
			return false  ;
			
		}
		arr[++top] = x  ;
		System.out.println("value pushed into stack successfully  ");
		return true ;
	}
	
	int pop() {
		if(top<0) {
			System.out.println("stack upnder flow");
			return 0  ;
		}
		return arr[top--] ;
	
	}
	
	int peek() {
		if(top<0) {
			System.out.println("stack under flow");
			return 0  ;
		}
		
		return arr[top] ;
	}
	
	void print() {
		for (int i  =top  ;i>= 0  ;i--) {
			System.out.print(arr[i]+" ");
		}
	}
			
	
	
	
	
	

  public static void main(String[] args) {
	  stackk st  = new stackk();// top   = -1 
	  
	  st.push(12);
	  st.push(23);
	  st.push(34);
	  st.push(24);
	  
	  
	  System.out.println(st.pop());
	  
	  System.out.println("top element" + st.peek());
	  
	  st.print();
	  
	  
	
	
	}

}
