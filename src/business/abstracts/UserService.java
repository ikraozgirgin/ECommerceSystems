package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	void logIn(User user);
	void signUp(User user, List<User> users);
}
