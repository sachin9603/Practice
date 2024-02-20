package feb19;

import java.util.Comparator;

public class EmployeeIDComaparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpID() == o2.getEmpID()) {
			return 0  ;
			
		}else if (o1.getEmpID() > o2.getEmpID()) {
			return 1 ;
		}else {
			return -1  ;
			
		}
		
//		return o1.getEmpID().;
	}

}
