package odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " Eklendi");
		
	}
	
	public void login(User user) {
		System.out.println("Giri� yap�ld�");
	}
	
	public void logout(User user) {
		System.out.println("��k�� yap�ld�");
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
