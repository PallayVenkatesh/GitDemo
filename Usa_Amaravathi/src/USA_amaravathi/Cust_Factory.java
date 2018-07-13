package USA_amaravathi;


public class Cust_Factory {
	public static Cust_Interface getObj(String user) {

		if (user == null) {
			return null;
		}

		else
			return new Cust_Impl();
	}
}

