package Com.Anudip.StudentManager_____2.daoimpl;

import javax.persistence.EntityManager;

import Com.Anudip.StudentManager_____2.Dao.AddressDao;
import Com.Anudip.StudentManager_____2.Model.Address;
import Com.Anudip.StudentManager_____2.Model.Student;
import Com.Anudip.StudentManager_____2.Utility.Dao;

public class AddressDaoimpl  implements AddressDao{

	@Override
	public String saveAddess(Address s) {
		EntityManager em  = Dao.provoideConnection() ;
		em.getTransaction() .begin(); 
		em.persist(s); 
		em.getTransaction().commit(); 
		em.close();
		
		return "data inserted successfully " ;
	}

	@Override
	public Address getAddressbyID(int id) {
		
		EntityManager em  = Dao.provoideConnection() ;
		em.getTransaction() .begin(); 
	    Address as =   em.find(Address.class,id );
		em.getTransaction().commit(); 
		em.close();
		
		return as ;
		
		
	}

}
