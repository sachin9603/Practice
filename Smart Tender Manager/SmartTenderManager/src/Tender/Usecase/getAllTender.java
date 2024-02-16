package Tender.Usecase;

import java.util.List;

import Tender.Exception.VenderException;
import Tender.Model.Tender;
import Tender.Model.Vender;
import Tender.dao.adminDao;
import Tender.daoImpl.adminDaoImpl;

public class getAllTender {

	public static void main(String[] args) {
		
		adminDao dao = new adminDaoImpl();
	try {
		List <Tender> tenders =	dao.getAllTender();
		
		for (Tender tender : tenders) {
			System.out.println(tender);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}

}
