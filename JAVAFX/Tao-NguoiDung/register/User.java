package register;

public class User {
	private String email;
	private String hoTen;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String email, String hoTen) {
		this.email = email;
		this.hoTen = hoTen;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	

}
