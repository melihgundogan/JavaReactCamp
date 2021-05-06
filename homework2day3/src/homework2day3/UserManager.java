package homework2day3;

public class UserManager {
	public void createAccount(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giriþ bilgilerine sahip " + user.getId() + " numaralý kullanýcý kaydý oluþturdu.");
	}
	
	public void signIn(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giriþ bilgilerine sahip " + user.getId() + " numaralý kullanýcý giriþ saðladý.");
	}
	
	public void logOut(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giriþ bilgilerine sahip " + user.getId() + " numaralý kullanýcý çýkýþ saðladý.");
	}
	
	public void delete(User user) {
		System.out.println("Email: " + user.getEmail() + " Password: " +  user.getPassword() + " giriþ bilgilerine sahip " + user.getId() + " numaralý kullanýcý kaydýný sildi.");
	}
	

}
