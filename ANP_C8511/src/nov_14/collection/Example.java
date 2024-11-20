package nov_14.collection;

import java.util.*;

public class Example {

	
	public static void main(String[] args) {
		
		
		Integer [] arr = new Integer[5]  ;
		arr[0] = 12  ;
		arr[1] = 122  ;
		arr[2] = 122  ;
		arr[3] = 142  ;
		arr[4] = 152  ;
		
		System.out.println(Arrays.toString(arr));
		
		
		// suppose i want to add one more student then is no chance to add element into same object 
		// it is not dynamic in size 
		// 
		// Collection framework  --- which multiple classes and interface 
		
		// what is Collection and Collections 
		
		// iterable ------ collection
		//list , queue  , set 
		// list  ---  ordered , it will allow duplicate  ,it will allow multiple nulll
		
		ArrayList<Integer> numList= new ArrayList<> () ;
		// it will be better for iteration perspective 
		// for searching also this is good 
		
		numList.add(78);
		numList.add(78);
		numList.add(78);
		numList.add(78);
		numList.add(738);
		numList.add(728);
		numList.add(7842);
		numList.add(7228);
		numList.add(null);
		numList.add(null);
		numList.add(null);
		numList.add(null);
		
		for(int i  =0  ;i<numList.size() ; i++) {
			System.out.println(numList.get(i));
		}
		
		numList.remove(5) ;
		
		boolean d  = numList.remove(new Integer(7228));
		
		System.out.println(numList);
		
		
		ArrayList<Integer> newList =new ArrayList<> ()  ;
		newList.add(232323232) ;
		newList.addAll(numList) ;
		
		
		
		System.out.println(newList);
		
		Boolean and  =newList.contains(232323232) ;
		System.out.println(and);
		for(Integer kkkkk:newList) {
			System.out.println(kkkkk);
		}
		
		System.out.println("///////////////////////linked list//////////////");
		
		List<String > linkedListt  = new LinkedList<>()   ;
		
		linkedListt.add("Rohan") ;
		linkedListt.add("Rohan") ;
		linkedListt.add("pawan") ;
		linkedListt.add("pooja") ;
		linkedListt.add("Puneet") ;
		linkedListt.add("Shailley") ;
		linkedListt.add("Sobha") ;
		
		linkedListt.add(null) ;
		linkedListt.add(null) ;
		linkedListt.add(null) ;
		linkedListt.add("Rohan") ;
		
		Iterator itrtr =  linkedListt.iterator() ;
		
		while(itrtr.hasNext()) {
			System.out.println(itrtr.next());
		}
		
		System.out.println(linkedListt);
		// when you have to do too much deletion and addition operation some where in to between of list 
		// then must have to linked list 
		
		
		
		// vector is exact same as arraylist but it is single thread (syncronized) it is legacy 
		
		System.out.println("////////////////////////////////////////vector///////////////////////////////////");
		List<String > vectr  = new Vector<>()   ;
				
		vectr.add("Bhalla") ;
		vectr.add("Rohan") ;
		vectr.add("pawan") ;
		vectr.add("pooja") ;
		vectr.add("Puneet") ;
		vectr.add("Shailley") ;
		vectr.add("Sobha") ;
		
		System.out.println(vectr);
		
		System.out.println("////////////////////////////////////////Stack///////////////////////////////////");

		
		Stack<String > stk  = new Stack<>()   ;
		
		stk.add("Rancho") ;
		stk.add("Rohan") ;
		stk.add("pawan") ;
		stk.add("pooja") ;
		stk.add("Puneet") ;
		stk.add("Shailley") ;
		stk.add("Sobha") ;
		stk.push("Deepika");
		
		System.out.println(stk);
		
		//		// stk is exact same as vector but it follow Lifo(Last in fist out )
		
		
		stk.pop() ;
		stk.pop() ;
		
		
		System.out.println(stk); // pop() , push ()  , peek()  ;
		
		String kl  = stk.peek()  ;
		
		System.out.println(kl);
		
		System.out.println(stk); // pop() , push ()  , peek()  ;
		
		
		//Set -- 0 duplicacy
		System.out.println("////////////////////////////////////////Hashset///////////////////////////////////");

		Set<String >  set  = new HashSet<>()  ;
		set.add("sachin");
		set.add("sachin");
		set.add("sachin");
		set.add("Rahul");
		set.add("Rahul");
		set.add("Lucky");
		set.add("priya");
		set.add("Satish");
		set.add("poonam");
		
		set.add(null);
		set.add(null);
		/// HashSet will not all dulicate value 
		// will not maintain any insertion order 
		// will not allow more than one null value 
		
	System.out.println(set);
	System.out.println("////////////////////////////////////////LinkedHashSet///////////////////////////////////");

	LinkedHashSet<String>  lhset = new LinkedHashSet<> ()  ;
	
		
	lhset.add("sachin");
	lhset.add("sachin");
	lhset.add("sachin");
	lhset.add("Rahul");
	lhset.add("Rahul");
	lhset.add("Lucky");
	lhset.add("priya");
	lhset.add("Satish");
	lhset.add("poonam");
	
	lhset.add(null);
	lhset.add(null);
	/// LinkedHashSet will not all dulicate value 
	// will  maintain insertion order 
	// will not allow more than one null value 
	
  System.out.println(lhset);
  
  
  
  System.out.println("////////////////////////////////////////TreeSet///////////////////////////////////");

  TreeSet<String>  tset = new TreeSet<> ()  ;
	
		
  tset.add("sachin");
  tset.add("sachin");
  tset.add("sachin");
  tset.add("Rahul");
  tset.add("Rahul");
  tset.add("Lucky");
  tset.add("Attya");
  tset.add("priya");
  tset.add("satish");
  tset.add("poonam");
	
  
	/// TreeSet will not all dulicate value 
	// will  maintain shorted order
	// will not allow any null value 
	
System.out.println(tset);


System.out.println("/////////////////////////////////something IMP//////////////////////////////");
		

 
   
   
   ///// comparable and comparator 
   
   TreeSet<Integer>  k  = new TreeSet<>() ;
   k.add(12) ;
   k.add(124) ;
   k.add(12442) ;
    k.add(3) ;
    System.out.println(k);
  
    
    TreeSet<Student>  kk  = new TreeSet<>() ;
    kk.add(new Student(23  , "Surya" , 89)) ;
    kk.add(new Student(23  , "Purvi" , 8923)) ;
    kk.add(new Student(243  , "Vaibhav" , 839)) ;
    
    kk.add(new Student(1  , "Raakesh" , 839)) ;
    kk.add(new Student(999  , "Vikas" , 839)) ;
    
    System.out.println(kk);
    
    Student s1  = new Student(89 , "mohan pyare" , 90) ;
    Student s2  = new Student(9 , "mohan pyare" , 90) ;
    
    ;
    System.out.println( s1.compareTo(s2));
    
    
    
    
    ArrayList<Student> ll = new ArrayList() ;
    
    ll.add(new Student(23  ,"Surya" , 89)) ;
    ll.add(new Student(223  ,"Purvi" , 8923)) ;
    ll.add(new Student(243  ,"Vaibhav" , 839)) ;
    ll.add(new Student(43  , "Abhay" , 839)) ;
    ll.add(new Student(24  , "Zyan" , 839)) ;
    
  //  Collections.sort(ll , new NameComaprator()) ;
    
    
//    Collections.sort(ll);
//    
//    
//    for (Student p:ll) {
// 	  System.out.println(p);
//    
//   
//    }
//
//   
    
    Queue<Integer> tt =  new LinkedList<> ();
    
    // fifo 
    tt.add(121) ;
    tt.add(11) ;
    tt.add(5) ;
    tt.add(7) ;
    
    tt.add(1211) ;
    tt.offer(99) ;
    
   tt.remove() ;
   
   
   int kll  = tt.peek() ;
   
   int h =  tt.poll()  ;
   
   
   System.out.println(kll);
   System.out.println(tt);
   System.out.println(h);
   
   System.out.println(tt);
    tt.clear() ;
    
    
    int kjl = tt.poll() ;
    System.out.println(kjl);
    
   

		
		
		

		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}
}
