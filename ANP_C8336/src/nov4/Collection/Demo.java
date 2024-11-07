package nov4.Collection;
import java.lang.* ;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
public class Demo {
	
	
	public static void main(String[] args) {
		
		int []arr = new int[5] ;
		
		arr[0] = 45  ;
		arr[1] = 40 ;
		arr[2] =33 ;
		arr[3] = 23  ;
		arr[4] = 49 ;
		
		
		
		for (int i  =0  ;i<arr.length ; i++) {
			System.out.println("marks of Student "+ i);
			System.out.println(arr[i]);
		}
		System.out.println("/////////////////////////////////////////////////////");
		ArrayList<Integer> marksOFStudent = new ArrayList<> () ;
		
		marksOFStudent.add(12) ;
		marksOFStudent.add(50) ;
		marksOFStudent.add(45) ;

		marksOFStudent.add(45) ;

		marksOFStudent.add(45) ;

		marksOFStudent.add(45) ;
		marksOFStudent.add(42) ;
		Integer [] newArray  = ( Integer [])marksOFStudent.toArray() ;
	
		marksOFStudent.removeIf(x -> x>40) ;
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		for (int i  =0  ;i<marksOFStudent.size() ; i++) {
			System.out.println("marks of Student "+ i);
			System.out.println(marksOFStudent.get(i));
		}
		
		
		
		List<Integer> markOFStudent = new LinkedList<> () ;
		
		markOFStudent.add(12) ;
		markOFStudent.add(50) ;
		markOFStudent.add(45) ;
		markOFStudent.add(42) ;
		
		// it will not support multithreading means it is synchronized
		Vector<String> kk  = new Vector<>() ; 
		
		
		kk.add("Ritika") ;
		kk.add("piyush") ;
		
		kk.add("Kunal") ;
		kk.add("Vaibhav") ;
		
		kk.add("Vairagya") ;
		
		boolean ans  = kk.add("Sankalp") ;
		
	String ll=  	kk.remove(0) ;
		
		
		Boolean removeValaObject  = kk.remove("Sankalp") ;
		System.out.println(removeValaObject);
		
		
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
 Vector<String> k = new Vector<>() ; 
		
		
		k.add("Static") ;
		k.add("final") ;
		
		k.add("new") ;
		kk.add("public") ;
		
		k.add("garbage") ;
		
		k.addAll(kk) ;
		k.removeAll(kk) ;
		
		
		
		
		
		for (int i  =0  ;i<k.size() ; i++) {
			System.out.println("Name of Student "+ i);
			System.out.println(k.get(i));
		}
		
		
		
		
		
		
		
		
		}

}
