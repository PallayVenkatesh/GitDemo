package USA_amaravathi;

public interface Cust_Interface {

	
	public boolean Register(Customer c);
	
	public boolean login(String userId, String password);
	
	public boolean UpdateProfile(String userid,String fname,String lname, String email);
	
	public boolean validateUser(String userId , String Password);
	public Customer getUserInfo(String userId);
	
}
