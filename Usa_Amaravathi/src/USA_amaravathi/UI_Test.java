package USA_amaravathi;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UI_Test extends HttpServlet{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cust_Interface ci = Cust_Factory.getObj("demo");
		
		 boolean c = ci.UpdateProfile("1000", "sowmith", "pentaparthy", "parthy@gmail.com");
		System.out.println(c);
		//System.out.println(ci.validateUser("6", "xyz"));;
/*		UserState u = UserState.Active;
*/
/*		Customer c = new Customer("10", "xyz", "DJ", "DJ", "DJ2@gmail.com", u);
		 System.out.println(ci.Register(c));;;;;;;;;;;;;;*/
		//System.out.println(ci.UpdateProfile(c));
		;
	}

}