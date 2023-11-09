package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User get(int id);
	boolean getEmail(String email);
	boolean getPassword(String password);
    List<User> getAll();
    
}
