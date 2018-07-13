package USA_amaravathi;

public class Customer {

	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private UserState userstate;

	
	public Customer() {
		
	}
	public UserState getUserstate() {
		return userstate;
	}

	public void setUserstate(UserState userstate) {
		this.userstate = userstate;
	}

	public Customer(String userId, String password, String firstName, String lastName, String email, UserState us) {
		super();
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userstate = us;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
