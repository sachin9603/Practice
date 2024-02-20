package Tender.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Tender.Exception.VenderException;
import Tender.Model.Bid;
import Tender.Model.Tender;
import Tender.Model.Vender;
import Tender.dao.venderDao;
import Tender.utility.Dao;

public class VenderDaoimpl implements venderDao {

	@Override
	public List<Tender> getAllTender() {
		 List<Tender> venders = new ArrayList<>();
			try(Connection conn = Dao.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("select * from tender" );
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					int TenderId = rs.getInt("TenderId");
					String TenderName = rs.getString("TenderName");
					
					
					Tender tender = new Tender ();
					tender.setTenderId(TenderId);
					tender.setTenderName(TenderName);
					
					
					venders.add(tender);
					
					
				}
				
//				
//				for (Vender vender : venders) {
//					System.out.println(vender);
//				}
//				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
				
			}
			
			
			
			return venders;
		
	
		
	
	}

	@Override
	public Vender LoginVender(String username, String Password) throws VenderException {
		Vender  vender = null;
		 
		try(Connection conn = Dao.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from vender where VUsername = ? AND VPassword = ?");
			
				ps.setString(1, username);
				ps.setString(2, Password);
				ResultSet rs = ps.executeQuery();
				
				if (rs.next()) {
					int r = rs.getInt("VID");
					String n = rs.getString("VName");
					String a = rs.getString("VUsername");
					String p = rs.getString("VPassword");
					
					 vender = new Vender (r,n,a,p);		
				}else {
					throw new VenderException("invalid username and password");
				}
				
		}catch(SQLException e) {
			printStackTrace(e);
			
		}
		
		
		
		
		return vender;
	
	}

	private void printStackTrace(SQLException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String bid_tender(int TenderId, int bidId) {
		String message = "not pacled bid againt tender ";
		
		
		try(Connection conn = Dao.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into bid_tender values (? ,?)" );
			ps.setInt(1, TenderId);
			ps.setInt(2, bidId);
	
	int x = ps.executeUpdate();
	if ( x>0) {
		message = "bid palced against tender  successfully ";
	}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			
		}
		
			
	
	
	
	
	
	return message;

	}

	@Override
	public Map<Integer, Boolean> bidStatus(int VenderId) {
		  Map<Integer, Boolean > hm
          = new HashMap<Integer, Boolean>();
	 
		  
		  try(Connection conn = Dao.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("select BidId, Status from bid where VenderId =?" );
				ps.setInt(1, VenderId);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					int BId = rs.getInt("BidId");
				Boolean Status = rs.getBoolean("Status");
					
					
		        hm.put(BId , Status);
		        
		        
//		        for (Map.Entry<String, Integer> me :
//		             hm.entrySet()) {
//		  
//		            // Printing keys
//		            System.out.print(me.getKey() + ":");
//		            System.out.println(me.getValue());
//		        }
//					
				}
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
				
			}
			return hm;
				
	}

	@Override
	public List<Bid> hisOwnBidHistory(int VenderId) {
		 List<Bid> Bids = new ArrayList<>();
			try(Connection conn = Dao.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("select * from bid where venderId = ?" );
				
				ps.setInt(1, VenderId);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					int bId = rs.getInt("BidId");
					int venderID = rs.getInt("VenderId");
					int Fp = rs.getInt("FixedPrice");
					Boolean staus = rs.getBoolean("Status");
					
					
					Bid bid = new Bid ();
					bid.setBidID(bId);
					bid.setVenderId(VenderId);
					bid.setFixedPrice(Fp);
					bid.setStatus(staus);
					
					
					
					Bids.add(bid);
					
					
				}
				
//				
//				for (Vender vender : venders) {
//					System.out.println(vender);
//				}
//				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
				
			}
			
			
			
			return Bids;
		
	}
	
	
}

	
