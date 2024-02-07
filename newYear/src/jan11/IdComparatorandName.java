package jan11;

import java.util.Comparator;

public class IdComparatorandName   implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		 int  idequal  =  Integer.compare(o1.getEmpId(), o2.getEmpId());
		 
		if( idequal == 0 ) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
		return idequal ;
		 
	}

}
