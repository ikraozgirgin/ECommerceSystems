package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.VerificationService;
import entities.concretes.User;

public class VerificationManager implements VerificationService{
	private List<String> verifiedMails = new ArrayList<String>();
	
	@Override
	public void sendEmail(User user) {
		System.out.println(user.getePosta() + " mail'ine doğrulama e-postası gönderildi.");
		
	}

	@Override
	public boolean checkMailVerificated(String email) {
		if (verifiedMails.contains(email)) {
			return true;
		}
		return false;
	}

}
