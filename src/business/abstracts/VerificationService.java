package business.abstracts;

import entities.concretes.User;

public interface VerificationService {
	void sendEmail(User user);
	boolean checkMailVerificated(String email);
}
