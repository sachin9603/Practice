package Tender.Usecase;

import java.util.List;
import java.util.Scanner;

import Tender.Model.Bid;
import Tender.dao.adminDao;
import Tender.daoImpl.adminDaoImpl;

public class getAllBidOfAVenderUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println(" enter vender ID to see his all bids ");
		
		int venderId = sc.nextInt();
		
		adminDao dao = new adminDaoImpl ();
	List<Bid> bids = dao.getAllBidOfAVender(venderId);
	
	for (Bid bid : bids) {
		System.out.println(bid);
	}
		
		
		
	}

}
