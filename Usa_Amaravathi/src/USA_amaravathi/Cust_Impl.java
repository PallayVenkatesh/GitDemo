package USA_amaravathi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.webresources.ExtractingRoot;

public class Cust_Impl implements Cust_Interface{

	@Override
	public boolean Register(Customer c) {
		
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO customer VALUES (?, ?, ?, ?,?,?)");
			ps.setString(1, c.getUserId() );
			ps.setString(2, c.getPassword() );
			ps.setString(3, c.getFirstName());
			ps.setString(4, c.getLastName());
			ps.setString(5, c.getEmail());
			ps.setString(6, c.getUserstate().toString());
			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean login(String userId, String password) {
		
		Connection connection = ConnectionFactory.getConnection();
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean UpdateProfile(String userid,String fname, String lname, String email) {
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE customer SET  firstName=?,lastName=?, email=? WHERE userid=?");
			//ps.setString(1, c.getUserId() );
			//ps.setString(2, c.getPassword() );
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, userid);
			
			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;

		
	}

	
	
	@Override
	public boolean validateUser(String userId, String Password) {
		
				Connection connection = ConnectionFactory.getConnection();
		try {
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM customer" );
	        List<Customer> customers = new ArrayList<>();
	        while (rs.next()) {
				Customer c = extract(rs);
				customers.add(c);
				
			}
		
	       for (Customer customer : customers) {
	    	   
	    	   if((customer.getUserId().toLowerCase().equals(userId.toLowerCase()))&&(customer.getPassword().toLowerCase().equals(Password.toLowerCase()))) {
	    		   return true;
	    	   }
		}
	        return false;
	        
		}
		catch (SQLException e) {
			// TODO: handle exception
		
		
		}	
		
		return false;
	}

	private Customer extract(ResultSet r) {
		
		
		Customer c = new Customer();
			try {
				c.setUserId(r.getString("UserID"));
				c.setPassword(r.getString("Password"));
				c.setFirstName(r.getString("FirstName"));
				c.setLastName(r.getString("LastName"));
				c.setEmail(r.getString("Email"));
				String active = UserState.Active.toString();
				String block = UserState.Block.toString();
				String deactive = UserState.Deactive.toString();
				
				if(r.getString("UserState").toString()==active) {
					c.setUserstate(UserState.Active);	
				}
				if(r.getString("UserState").toString()==block) {
					c.setUserstate(UserState.Block);	
				}
				if(r.getString("UserState").toString()==deactive) {
					c.setUserstate(UserState.Deactive);	
				}
				
			} catch (SQLException e) {
				// TODO: handle exception
			}
		return c;
	}

	@Override
	public Customer getUserInfo(String userId) {
		// TODO Auto-generated method stub
		
		
		Connection connection = ConnectionFactory.getConnection();
		try {
	        Statement stmt = connection.createStatement();
	        
	        //
	        ResultSet rs = stmt.executeQuery("SELECT * FROM customer where userID = "+ userId );
	    
	        Customer c;
	        while (rs.next()) {
						System.out.println("hi");		
				return  extract(rs); 
	        }
	        
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		return null;
		
		
		
	}
	
	
}
