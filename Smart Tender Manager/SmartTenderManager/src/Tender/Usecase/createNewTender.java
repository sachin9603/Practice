package Tender.Usecase;

import java.util.Scanner;

import Tender.dao.adminDao;
import Tender.daoImpl.adminDaoImpl;

public class createNewTender {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
System.out.println("Enter tender ID");

    int TenderId = sc.nextInt();
    
    System.out.println("Enter tender Name");
    String tenderName = sc.next();
    
    adminDao Dao = new adminDaoImpl() ;
    String result = Dao.CreateNewTender(TenderId, tenderName);
    System.out.println(result);


	}

}
