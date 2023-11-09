package business.concretes;

import java.util.List;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService,VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		
	}
	@Override
	public void signUp(User user, List<User> users) {
			if(userCheckService.checkUsedEmail(user, users) && userCheckService.checkEmail(user) && userCheckService.checkFirstName(user) && userCheckService.checkLastName(user) && userCheckService.checkPassword(user) && userCheckService.eMailConfirmation(true)) {
				userDao.addUser(user);
				System.out.println("Kayıt başarılı: " + user.getFirstName() + " " + user.getLastName());
			}
			else {
				System.out.println("Kayıt yapılamadı!");
			}
		
	}
	@Override
	public void logIn(User user) {
		if (userDao.getEmail(user.getePosta()) && userDao.getPassword(user.getParola()) && verificationService.checkMailVerificated(user.getePosta())) {
			System.out.println("Giriş başarılı: " + user.getePosta());
		} else if (userDao.getEmail(user.getePosta()) && userDao.getPassword(user.getParola())) {
			System.out.println("Lütfen eposta hesabınıza gönderilen mail'den hesabınızı doğrulayın.");
		} else {
			System.out.println("Kullanıcı adı veya şifre hatalı.");
		
	}

	
	
	}
}
