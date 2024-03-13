package basic;

import java.net.MulticastSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
//	//687
//	6 
//	8
//	7
//	

	private static Scanner sc = new Scanner(System.in);

	private static Connection con = null ;

	private static Demo dao = new Demo() ;

	public static void main(String[] args) {
		

		// second step
		String url = "jdbc:mysql://localhost:3306/batch7437";
		String username = "root";
		String password = "1999";
        try {
             con = DriverManager.getConnection(url, username, password);
			boolean flg = true;

			while (flg) {
				System.out.println("Enter 1 for insert data ");
				System.out.println("Enter 2 for get all data ");
                System.out.println("Enter 3 for update  data ");

				System.out.println("Enter 4  for delete data ");

				System.out.println("Enter 5  for exit ");

				int choice = sc.nextInt();

				switch(choice) {

				case 1:
					dao.insertdata();
					break;

				case 2:
					dao.getAlldata();
					break;

				case 5:
					flg  = false;
					System.out.println("Thankyou for visiting 😎😎😎😎😎😎");
					break;

				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertdata() throws SQLException {
		 
		//step three Create the Statement object 
		 System.out.println("enter your Student id ");
		int sid  = sc.nextInt() ;
		
		System.out.println("enter student name  ");
		
		String name   = sc.next() ;
		
		System.out.println("enter your student address");
		
		String address  = sc.next();
		
		PreparedStatement ps   = con.prepareStatement("insert into student values(?, ?, ?)") ;
			ps.setInt(1,sid );
			ps.setString(2, name);
			ps.setString(3,address) ;
			
		int row = ps.executeUpdate() ;
		if (row > 0) {
		System.out.println("data get inserted successfully ");
		}
	
	
	
}
	
	public void getAlldata() throws SQLException {
		
		PreparedStatement ps   = con.prepareStatement("select * from student") ;
	    
		ResultSet rs = ps.executeQuery() ;
		
		
	while(rs.next()) {
		int id  = rs.getInt("StudentId");
		String name  =rs.getString("StudentName");
		String address  =rs.getString("StudentAddress") ;
		
		System.out.println( "student -->" +id +" " +name + " " + address);
	}
	
}
}
