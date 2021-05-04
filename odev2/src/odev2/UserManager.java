package odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " Eklendi");
		
	}
	
	public void login(User user) {
		System.out.println("Giriþ yapýldý");
	}
	
	public void logout(User user) {
		System.out.println("Çýkýþ yapýldý");
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
