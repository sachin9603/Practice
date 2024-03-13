package Com.Anudip.StudentManager_____2.Dao;

import java.util.List;

import Com.Anudip.StudentManager_____2.Exception.StudentException;
import Com.Anudip.StudentManager_____2.Model.Address;
import Com.Anudip.StudentManager_____2.Model.Student;

public interface AddressDao {
	
	
	public String saveAddess(Address  s);
//	
//	public List<Student> getAllStudent() throws StudentException;
//	
	public Address getAddressbyID(int  id );
//	
//	public String deleteStudentbyId(String Id )throws StudentException ;
//	


}
