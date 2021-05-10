package homework1day5.business.abstracts;

import homework1day5.entities.concretes.User;

public interface UserService {

	Object add(User user);

	Object getByEmail(String geteMail);

	void delete(User user);

	void sendEmail(User user);

}
