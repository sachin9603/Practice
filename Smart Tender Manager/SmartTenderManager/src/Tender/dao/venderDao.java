package Tender.dao;

import java.util.List;
import java.util.Map;

import Tender.Exception.VenderException;
import Tender.Model.Bid;
import Tender.Model.Tender;
import Tender.Model.Vender;

public interface venderDao {
	
	public List <Tender> getAllTender();
	public Vender  LoginVender (String username,String Password) throws VenderException ;
    public String  bid_tender ( int TenderId ,int bidId);
     public  Map<Integer, Boolean > bidStatus(int venderId);
    public List<Bid> hisOwnBidHistory (int VenderId);
}
