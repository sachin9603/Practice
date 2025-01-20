package dec12.Collectionn;

import java.util.Comparator;

public class RollNumberComparator  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.marks == o2.marks) {
			return o1.name.compareTo(o2.name);
		}else if (o1.marks < o2.marks) {
			return 1  ;
		}else {
			return -1  ; 
		}
		
		
	}

}
