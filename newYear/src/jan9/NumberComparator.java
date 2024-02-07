package jan9;

import java.util.Comparator;

public class NumberComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		
		int rrr  = Integer.compare(o1.studentMarks, o1.studentMarks) ;
		
		
		if (rrr== 0) {
			
			return o1.studentName.compareTo(o1.studentName);
			
			
		}
		
		return rrr ;
		//return o1.studentMarks - o2.studentMarks;
	}

	
	
}
