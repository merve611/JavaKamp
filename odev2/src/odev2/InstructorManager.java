package odev2;

public class InstructorManager extends UserManager{


	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + "Eklendi");
	}
	
	@Override
	public void login(User user) {
		System.out.println("Eðitmen Giriþi yapýldý");
	}
	
	
	@Override
	public void logout(User user) {
		System.out.println("Eðitmen Çýkýþý yapýldý");
}
}