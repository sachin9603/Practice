package dec12.Collectionn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableOrComparator {
	
	
   public static void main(String[] args) {
		// collection or Collections mai antar 
		
		List<Student> studentList  = new ArrayList<> ()  ;
		studentList.add(new Student(12  , "Vishavash" , 121)) ;
		
		studentList.add(new Student(121  , "Pooja" , 112)) ;
		studentList.add(new Student(11  , "Swati" , 212)) ;
		studentList.add(new Student(11  , "Parag" , 1212)) ;
		studentList.add(new Student(110  , "Suzan" , 112)) ;
		studentList.add(new Student(11  , "Atya" , 1212)) ;
		
		// suppose i have to short this Student List of the baisses of maarks or roll number 
		
		//Collections.sort(studentList);  // by comparable 
		
		Collections.sort(studentList ,new RollNumberComparator()); // by comparator 
		
		
		System.out.println(studentList);
	}

}
