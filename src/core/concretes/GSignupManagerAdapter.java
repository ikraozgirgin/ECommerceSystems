package core.concretes;



import GoogleSignup.GSignupManager;
import core.abstracts.SignupService;
import entities.concretes.User;

public class GSignupManagerAdapter implements SignupService{

	@Override
	public void SignupService(User user) {
		GSignupManager gSignupManager = new GSignupManager();
		gSignupManager.Signup(user.getFirstName() + " " + user.getLastName());
		
		
	}

}
