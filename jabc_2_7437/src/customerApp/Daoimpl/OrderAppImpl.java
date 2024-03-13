package customerApp.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import customerApp.Dao.OrderDao;
import customerApp.Model.Orders;
import customerApp.util.Dao;
import customerApp.util.QueryUtil;

public class OrderAppImpl implements OrderDao {

	@Override
	public String doingOrder(Orders c) {
         String msg  = "not odered" ;
		
		try(Connection con = Dao.provideConnection()){
			
			PreparedStatement ps  = con.prepareStatement(QueryUtil.insertorder());
			//ps.setInt(1, c.getOrderId());
			ps.setString(1, c.getOrdername());
			ps.setDouble(2, c.getOrdervalue());
			ps.setInt(3, c.getCusid());
			
			int row  = ps.executeUpdate() ;
			
		if(row>0) {
			msg  = "data get inserted";
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
		}

	@Override
	public String deleteorders(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getAllordersbycusid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders highestValuedOrderOfParticularCustomer(int cusId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getAllordervalue(int cusid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void customerWiseTotalOrder() {
		// TODO Auto-generated method stub
		
		
	}
	

}
