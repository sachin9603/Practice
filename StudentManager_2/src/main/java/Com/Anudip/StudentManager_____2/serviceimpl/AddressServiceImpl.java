package Com.Anudip.StudentManager_____2.serviceimpl;

import java.util.List;

import Com.Anudip.StudentManager_____2.Dao.AddressDao;
import Com.Anudip.StudentManager_____2.Dao.StudentDao;
import Com.Anudip.StudentManager_____2.Exception.StudentException;
import Com.Anudip.StudentManager_____2.Model.Address;
import Com.Anudip.StudentManager_____2.Model.Student;
import Com.Anudip.StudentManager_____2.daoimpl.AddressDaoimpl;
import Com.Anudip.StudentManager_____2.daoimpl.studentDaoImpl;
import Com.Anudip.StudentManager_____2.service.AddressService;
import Com.Anudip.StudentManager_____2.service.studentService;

public class AddressServiceImpl implements AddressService {

	AddressDao  adDao = new AddressDaoimpl() ;
	
	@Override
	public String saveAddess(Address s) {
		// TODO Auto-generated method stub
		return adDao.saveAddess(s);
	}

	@Override
	public Address getaddressById(int id) {
		// TODO Auto-generated method stub
		return adDao.getAddressbyID(id);
	}

	

}
