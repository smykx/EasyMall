package easymall.pojo;

public class UserForm {
	
	private String username;
	private String password;
	private String repassword;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	
	@Override
	public String toString() {
		return "UserForm [username=" + username + ", password=" + password + ", repassword=" + repassword + "]";
	}
	

}
