package Anudip.BasicDaoUsingHibernate8706.dao;

import java.util.List;

import Anudip.BasicDaoUsingHibernate8706.Exception.ProductException;
import Anudip.BasicDaoUsingHibernate8706.model.Product;

public interface ProductDao {
	
	public boolean addProduct(Product p) throws ProductException;
	public boolean deleteProduct(int id) throws ProductException ;
	public boolean updateProduc(Product p) throws ProductException;
	public List<Product> findAllProduct()  throws ProductException; 
	public Product findSingleProduct(int id)  throws ProductException; 
	
	
	

}
