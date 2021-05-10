package homework1day5.dataAccess.abstracts;

import homework1day5.entities.concretes.User;

public interface UserDao {

	void save(User user);

	void logIn(User user);

	User get(int id);

	void add(User user);

	void delete(User user);

	Object getByEmail(String email);

}
