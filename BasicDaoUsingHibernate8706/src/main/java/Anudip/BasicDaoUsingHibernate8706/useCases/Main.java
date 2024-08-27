package Anudip.BasicDaoUsingHibernate8706.useCases;

import java.util.Date;

import Anudip.BasicDaoUsingHibernate8706.dao.ProductDao;
import Anudip.BasicDaoUsingHibernate8706.daoImpl.ProductImpl;
import Anudip.BasicDaoUsingHibernate8706.model.Product;

public class Main {
	
	
	public static void main(String[] args) {
		
		ProductDao dao  = new ProductImpl() ;
		
		Product p1  = new Product() ; 
		p1.setProductName("Pencil Box");
		p1.setProductPrice(40);
		p1.setDate(new Date());
		p1.setDelAddress("Indore vijay nagr");
	
		
		boolean ans = dao.addProduct(p1);
		System.out.println(ans);
		
		
		
		
	}

}
