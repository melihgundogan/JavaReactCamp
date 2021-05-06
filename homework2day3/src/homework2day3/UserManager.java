package homework2day3;

public class UserManager {
	public void createAccount(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giri� bilgilerine sahip " + user.getId() + " numaral� kullan�c� kayd� olu�turdu.");
	}
	
	public void signIn(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giri� bilgilerine sahip " + user.getId() + " numaral� kullan�c� giri� sa�lad�.");
	}
	
	public void logOut(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giri� bilgilerine sahip " + user.getId() + " numaral� kullan�c� ��k�� sa�lad�.");
	}
	
	public void delete(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giri� bilgilerine sahip " + user.getId() + " numaral� kullan�c� kayd�n� sildi.");
	}
	

}
