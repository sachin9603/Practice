package nov6;

import java.util.*;

public class Basic22 {
	
	
	public static void main(String[] args) {
		// it is legacy class 
		// it have special methods push pop peek
		// it follow LIFO ( Last In First out )
		
		/// internal working of each class 
		
		Stack<Integer>  st   = new Stack<> () ;
		
		st.add(121) ;
		st.add(1) ;
        st.add(14) ;
        st.add(190) ;
		st.push(89) ;
		
		System.out.println(st);
		
		Integer rem  = st.pop();
		
		st.peek() ;// konsa  element nikalega uski jaankaari dena ,
		//it will those those element which is going to be removed 
		
		st.peek() ;
		int  k = 	st.peek() ;
		System.out.println(k);
		System.out.println("after single pop");
		System.out.println(st);
		
		
		// SET  ---- >  
		
		// it will not allow any  duplicate value  
		// it will not maintain  any insertion order 
		// it will not allow more than one null value 
		
		
		
		
		Set<String > set  = new HashSet<> () ;
		
		set.add("sankalp") ;
		set.add("sankalp") ;
		set.add("sankalp") ;
		set.add("shree") ;
		set.add("samr") ;
		set.add("Sachin") ;
		set.add(null) ;
		set.add(null) ;
		
		for(String  kk  : set ) {
			System.out.println(kk);
		}
		
		
		LinkedHashSet  <Integer> lhst=  new LinkedHashSet<>() ;
		
		lhst.add(90) ;
		lhst.add(90) ;
		lhst.add(90) ;
		lhst.add(95) ;
		lhst.add(96) ;
		lhst.add(99) ;
		lhst.add(null) ;
		lhst.add(null) ;
		

		for(Integer  kk  : lhst ) {
			System.out.println(kk);
		}
		
		
		TreeSet<Integer>  treeSet = new TreeSet<> ();
		treeSet.add(12) ;
		treeSet.add(224) ;
		treeSet.add(2) ;
		treeSet.add(1) ;
		treeSet.add(118) ;
		
		
		System.out.println(treeSet);
		
		ArrayList<Student> studentList = new ArrayList<> ()  ;
		studentList.add(new Student(182  , "Ruhul" , "java"));
		studentList.add(new Student(193  , "Pritam" , "java"));
		studentList.add(new Student(193  , "Zyan malik " , "java"));
		studentList.add(new Student(193  , "Arayan " , "java"));
		studentList.add(new Student(144 , "panner" , "java"));
		studentList.add(new Student(175  , "Prattek" , "java"));
		
		System.out.println("student's data by using arraylist short ");
		
		Collections.sort(studentList , new IdComaparatorrr());
		
		Collections.sort(studentList );
		
		System.out.println(studentList);
		
		
		TreeSet<Student>  treeSet3 = new TreeSet<> ();
		
		treeSet3.add(new Student(12  , "PAnkaj" , "java")) ;
		treeSet3.add(new Student(89  , "Ruhul" , "java")) ;
		treeSet3.add(new Student(89  , "Ruhul" , "java")) ;
		treeSet3.add(new Student(13 , "Priya" , "Python")) ;
		
		System.out.println(treeSet3);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
