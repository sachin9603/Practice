package feb19;

import java.util.Comparator;

public class nameComaparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		if(o1.getEmpName() == o2.getEmpName() ) {
//			return 0  ;
//			
//		}else if (o1.getEmpName().c o2.getEmpName() ) {
//			return 1 ;
//			
//		}else {
//			return -1  ;
//			
//		}
     return o2.getEmpName().compareTo( o1.getEmpName());
	
	}

}
