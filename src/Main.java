

import java.util.ArrayList;
import java.util.List;

import GoogleSignup.GSignupManager;
import business.abstracts.VerificationService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import business.concretes.VerificationManager;
import core.concretes.GSignupManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		User user1 = new User(1,"İkra", "Özgirgin","ozgirgisdvgmail.com", "123456");
		User user2 = new User(2,"İkra2", "Özgirgin","ozgirgwega@gmail.com", "123456");
		User user3 = new User(2,"İ", "Özgirgin","ozgirginikdlkhniarhra@gmail.com", "123456");
		User user4 = new User(2,"İkra", "Özgirgin","ozgiwgagag@gmail.com", "123456");
		UserManager userManager = new UserManager(new HibernateUserDao(users), new UserCheckManager(), new VerificationManager());
		userManager.signUp(user1,users);
		System.out.println("-------------------------");
		userManager.signUp(user2,users);
		System.out.println("-------------------------");
		userManager.signUp(user3,users);
		System.out.println("-------------------------");

		GSignupManagerAdapter gSignupManagerAdapter = new GSignupManagerAdapter();
		gSignupManagerAdapter.SignupService(user4);	
		System.out.println("-------------------------");
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.sendEmail(user4);
		userManager.logIn(user2);
		userManager.logIn(user4);
		
	}

}
