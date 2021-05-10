package homework1day5.business.concretes;

import homework1day5.business.abstracts.AuthService;
import homework1day5.business.abstracts.UserService;
import homework1day5.entities.concretes.User;

public class AuthManager implements AuthService {
    UserService userService;
    public AuthManager(UserService userService) {
        this.userService = userService;
    }



	@Override
    public void register(User user) {
       var userAdded = userService.add(user);
       if((boolean) userAdded){
           System.out.println("Register successfully");
       }

    }

	@Override
    public void login(User user) {
        var userWithEmail = userService.getByEmail(user.geteMail());
        if(userWithEmail != null){
            System.out.println("Login successfully");
            return;
        }
        System.out.println("User doesn't exist with this email");

    }
	
}	
