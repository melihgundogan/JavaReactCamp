package homework1day5.business.abstracts;

import homework1day5.entities.concretes.User;

public interface AuthService {

	void register(User user);

	void login(User user);

}
