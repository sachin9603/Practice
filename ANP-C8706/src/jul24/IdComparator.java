package jul24;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.empId  == e2.empId ) {
			return 0  ;
			
		}else if(e1.empId  > e2.empId) {
		return   1 ;
		}else {
			return -1 ;
		}
		
	
	}

}
