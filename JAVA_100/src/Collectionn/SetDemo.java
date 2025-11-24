package Collectionn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	
	
	public static void main(String[] args) {
		
		// List 
		// set (Interface)----- no Duplicate , hashset 
		
		/// it will not follow any instertion order 
		// it will not duplicate value 
		// it will not more than one value 
		/// internally it is using hashmap 
		HashSet<String>  jk = new HashSet<>() ;
		jk.add("sachin");
		jk.add("sachin");

		jk.add("sachin");

		jk.add("pooja");

		jk.add("Satish");

		jk.add("aman");
		jk.add(null);

		jk.add(null);
		System.out.println(jk);

		
		/// it will insert in sequence other things are same HashSet
		LinkedHashSet <Integer> kk = new LinkedHashSet<>() ;
		
        kk.add(465) ;
        kk.add(465) ;
        kk.add(null) ;

        kk.add(465) ;

        kk.add(5) ;

        kk.add(54) ;

        kk.add(54) ;
        kk.add(null) ;

        kk.add(null) ;


        
        System.out.println(kk);
        
        
        TreeSet<Student> tset= new TreeSet<> ()  ;
        
        tset.add(new Student() );
//        tset.add(45);
//        tset.add(4);
//
//        tset.add(45);
//
//        tset.add(5);
//        tset.add(null);
        
        System.out.println(tset); 

		
		
		
		
	}

}
