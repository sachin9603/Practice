package sep6.collectionn;

import java.util.* ;
public class TestStudent {
	
	
	
	public static void main(String[] args) {
		
		Student s1  = new Student(1 , "Aman" , 700) ;
		
		Student s2  = new Student(2 , "ZNimita" , 740) ;
		Student s9  = new Student(3 , "Prateek" , 740) ;
		Student s3  = new Student(3 , "Ashneer" , 800) ;
		Student s4 = new Student(4 , "Dipender" , 600) ;
		
		
		List<Integer> list2  = Arrays.asList(23,52,4,2,53,2,543);
		
		
		
		//TreeSet<Student>  sett  = new TreeSet<>() ;
		
		List<Student>  list  = new ArrayList<>() ;
		list.add(s4);
		list.add(s3);
		list.add(s2);
		list.add(s1);
		list.add(s9);
		
		Collections.sort(list); // assending or decending order mai  on the baises of marks 
		
		
		for (Student gg:list) {
			System.out.println(gg);
		}
		
		/// compareTo method (ascending k liye )
		//  return 0  both equal 
		// this.marks  >  o.marks   return  1 
		//this.mars< o.marks  return  -1 
		
		
		
	
    NewStudent sr1  = new NewStudent(1 , "Aman" , 700) ;
		
    NewStudent sr2  = new NewStudent(2 , "ZNimita" , 740) ;
    NewStudent sr9  = new NewStudent(3 , "NAyaBAccha" , 740) ;
    NewStudent sr3  = new NewStudent(3 , "Ashneer" , 800) ;
    NewStudent sr4 = new NewStudent(4 , "Dipender" , 600) ;
		System.out.println("/////////////////////comparator //////////////////////////////");
		
    List<NewStudent>  listOFNew  = new ArrayList<>() ;
    listOFNew.add(sr4);
    listOFNew.add(sr3);
    listOFNew.add(sr2);
    listOFNew.add(sr1);
    listOFNew.add(sr9);
    
   // Collections.sort(null, null)
    
 Collections.sort(listOFNew  , new NameComparator()); // assending or decending order mai  on the baises of marks 
	
	
	for (NewStudent gg:listOFNew) {
		System.out.println(gg);
	}
	
	
	TreeSet<NewStudent>  treeSet  = new TreeSet<NewStudent>(new NameComparator()) ;
	
	
	treeSet.add(sr4) ;
	treeSet.add(sr2) ;
	treeSet.add(sr1) ;
	treeSet.add(sr3) ;
	
	System.out.println(treeSet);
	
		
	}

}
