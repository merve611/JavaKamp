package odev2;

public class StudentManager extends UserManager {

	@Override
	public void login(User user) {
		System.out.println("Öðrenci Giriþi yapýldý");
	}
	
	@Override
	public void logout(User user) {
		System.out.println("Öðrenci Çýkýþý yapýldý");
	}
}
