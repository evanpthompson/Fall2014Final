import java.util.*;


public class User {
	
	private String userName;
	private String password;
	private GregorianCalendar userCreated;
	
	
	public User(String userName, String password, GregorianCalendar userCreated) {
		this.userName = userName;
		this.password = password;
		new GregorianCalendar();
		this.userCreated = new GregorianCalendar();
	}
	
	public String getUserName() {
		return userName;
	}
	private void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	public GregorianCalendar getUserCreated() {
		return userCreated;
	}
	private void setUserCreated(GregorianCalendar userCreated) {
		this.userCreated = new GregorianCalendar();
	}
	
	
	
	

	@Override
	public String toString() {
		
		return userName + " created account: " + userCreated;
	}
	
	
	
	
	
	
	
}
