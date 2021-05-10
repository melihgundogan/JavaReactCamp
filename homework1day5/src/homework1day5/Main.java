package homework1day5;

import homework1day5.business.concretes.AuthManager;
import homework1day5.business.concretes.UserManager;
import homework1day5.core.GoogleAuthAdapter;
import homework1day5.dataAccess.concretes.CheckUserDao;
import homework1day5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		new AuthManager(new UserManager(new CheckUserDao()));
		
		new UserManager(new CheckUserDao());
		
		new GoogleAuthAdapter();
		
		new User(1, "Muhammed Melih", "Gundogan", "m.melih84@gmail.com", "12345678ab");
		
	}

}
