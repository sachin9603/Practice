package Anudip.BasicDaoUsingHibernate8706.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import Anudip.BasicDaoUsingHibernate8706.Exception.ProductException;
import Anudip.BasicDaoUsingHibernate8706.dao.ProductDao;
import Anudip.BasicDaoUsingHibernate8706.model.Product;
import Anudip.BasicDaoUsingHibernate8706.util.EmUtil;

public class ProductImpl  implements ProductDao{

	@Override
	public boolean addProduct(Product p) throws ProductException {
		
		boolean  ans = false  ;
		//@Transaction
		EntityManager em  = EmUtil.provideEntityManager();
		em.getTransaction().begin();
		
		em.persist(p); 
		ans = true ;
		
		em.getTransaction().commit(); 
		em.close();
		
		return ans;
		
	}

	@Override
	public boolean deleteProduct(int id) throws ProductException {
	
		boolean ans  = false   ;
		
		EntityManager em = EmUtil.provideEntityManager() ;
		Product p  = em.find(Product.class, id);
		
		if (p != null) {
			
			em.getTransaction().begin(); 
			em.remove(p);
			ans = true ;
			em.getTransaction().commit(); 
			em.close();
		}else {
			
			throw new ProductException("product not found" );
			
		}
		
		return ans ;
	}

	@Override
	public boolean updateProduc(Product p) throws ProductException {
		// TODO Auto-generated method stub
		// we have used setmethod of java bean to update things  but currently we are using merge method 
		

		boolean ans  = false   ;
		
		EntityManager em = EmUtil.provideEntityManager() ;
		
		    em.getTransaction().begin(); 
		    
			em.merge(p);
			ans = true ;
			em.getTransaction().commit(); 
			em.close();
		
		return ans ;
		
	
	}

	@Override
	public List<Product> findAllProduct() throws ProductException {
		// TODO Auto-generated method stub
		
		EntityManager em = EmUtil.provideEntityManager() ;

		 CriteriaBuilder cb = em.getCriteriaBuilder();
		    CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		    
		    Root<Product> rootEntry = cq.from(Product.class);
		    
		    CriteriaQuery<Product> all = cq.select(rootEntry);

		    TypedQuery<Product> allQuery = em.createQuery(all);
		    
		    return allQuery.getResultList();
		
	}

	@Override
	public Product findSingleProduct(int id) throws ProductException {
		// TODO Auto-generated method stub
       boolean ans  = false   ;
		
		EntityManager em = EmUtil.provideEntityManager() ;
		Product p  = em.find(Product.class, id);
		
		return p;
	}
	
	
	

}
