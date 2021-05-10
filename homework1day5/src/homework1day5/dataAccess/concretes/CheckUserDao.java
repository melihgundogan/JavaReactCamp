package homework1day5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import homework1day5.dataAccess.abstracts.UserDao;
import homework1day5.entities.concretes.User;

public class CheckUserDao implements UserDao {
	
	static List<User> users = new ArrayList<User>(Arrays.asList(new User(1,"Fatih","Kayan","fatih@gmail.com","123456")));
	
	@Override
	public void save(User user) {
		System.out.println("Sisteme kayýt yapýldý: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapýldý: " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public User get(int id) {
		return null;
	}
	

}
