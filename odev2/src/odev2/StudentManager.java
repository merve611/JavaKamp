package odev2;

public class StudentManager extends UserManager {

	@Override
	public void login(User user) {
		System.out.println("��renci Giri�i yap�ld�");
	}
	
	@Override
	public void logout(User user) {
		System.out.println("��renci ��k��� yap�ld�");
	}
}
