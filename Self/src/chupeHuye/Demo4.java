package chupeHuye;

import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {
	public static void main(String[] args) {
	ArrayList<Student>  s = new ArrayList<Student>() ;
	
	
	s.add(new Student(23 , "sourabh" ));
	s.add(new Student(24 , "akka" ));
	s.add(new Student(3 , "oaaa" ));
	s.add(new Student(26 , "llll" )) ;
	
	Collections.sort(s); 
	  for(Student p:s){ 
		  
          System.out.println(p.id+" "+p.name); 
          
      }  
	}

}
