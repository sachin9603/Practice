package nov12;


// stack implementation using array 
public class Stackk {
	
	int [] arr  ;
	int top  ;
	int max_size  ;
	
	
	public Stackk(int s) {
		
		this.max_size  = s  ;
		arr  = new int [max_size] ;
		top  = -1  ;
		
	}
	public void push(int data) {
		if (top == max_size-1) {
			System.out.println("stack is full");
			return ;
		}
		++top  ;
		arr[top]  = data  ;
		System.out.println("data inserted successfully ");
		
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("stack is empty ");
			return -1  ;
		}
		
		int  data = arr[top--]   ;
		return data  ;
		
		
	}
	public int peek()  {
		if(top == -1) {
			System.out.println("stack is empty ");
			return -1  ;
		}
		int  data = arr[top]   ;
		return data  ; 
	}
	
	public void print() {
		for(int  i =0  ;i<=top ;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Stackk st  = new Stackk(5)  ; 
		st.push(12);
		st.push(122);
		st.push(123);
		st.push(124);
		st.push(129);
		
		st.print();
		st.peek() ;
	int data= 	st.pop() ;
	System.out.println(data);
		
		st.print();
		
		
		
	}
	

}
