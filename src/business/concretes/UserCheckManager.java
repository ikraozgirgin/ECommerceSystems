package business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkPassword(User user) {
		if (user.getParola().isEmpty()) {
			System.out.println("Lütfen şifre giriniz.");
			return false;
		}else if(user.getParola().length() < 6){
			System.out.println("Parola 6 karakterden az olamaz.");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

		if (user.getePosta().isEmpty()) {
			System.out.println("Email boş bırakılamaz.");
			return false;
		} else if (pattern.matcher(user.getePosta()).find() == false) {
			System.out.println("Geçersiz email formatı. Örnek: tester@mymail.com");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkUsedEmail(User user, List<User> users) {		
		boolean sonuc = true;
		  for (User userr: users) {
			if(userr.getePosta() == user.getePosta()) {
				sonuc = false;
				System.out.println("Bu eposta zaten kayıtlı! " + userr.getePosta() );
			}
		  }
		  if(sonuc == true) {
			  return true;
		  }else {
			  return false;
		  }
	    
	}

	@Override
	public boolean eMailConfirmation(boolean click) {
		if (click) {
			System.out.println("Email doğrulandı!");
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("İsim boş bırakılamaz.");
			return false;
		} else if(user.getFirstName().length()<2) {
			System.out.println("İsim 2 karakterden az olamaz.");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println("Soyisim boş bırakılamaz.");
			return false;
		} else if(user.getLastName().length()<2) {
			System.out.println("Soyisim 2 karakterden az olamaz.");
			return false;
		} else {
			return true;
		}
	}


}
