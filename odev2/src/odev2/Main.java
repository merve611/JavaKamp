package odev2;


public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Merve", "Çakıroğlu", "12345", "merve@mail.com");

		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demiroğ");
		user2.setPassword("52634");
		user2.setEmail("engin@mail.com");
		
		System.out.println(user1.getFirstName());
		System.out.println(user2.getFirstName());

		Instructor instructor1 = new Instructor();
		instructor1.setAbout("Java Dili Eğiticisi");
		instructor1.setFirstName("Emirhan");
		
		Instructor instructor2 = new Instructor();
		instructor2.setAbout("C# Dili Eğiticisi");
		instructor2.setFirstName("Ali");
		
		Student student1 = new Student();
		student1.setFirstName("Gönül");
		
		System.out.println(instructor1.getFirstName());
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.login(instructor1);
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.login(instructor2);
		
		
		
		

		
		//User[] users =  {user1, user2, instructor1,instructor2};
		//userManager.addMultiple(users);
		
	
	}

}
