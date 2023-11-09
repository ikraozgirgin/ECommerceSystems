package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserCheckService {
	boolean checkPassword(User user);
	boolean checkEmail(User user);
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkUsedEmail( User user, List<User> users);
	boolean eMailConfirmation(boolean click);
	
}
