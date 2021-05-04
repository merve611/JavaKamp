package odev2;


public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Merve", "Çakýroðlu", "12345", "merve@mail.com");

		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demiroð");
		user2.setPassword("52634");
		user2.setEmail("engin@mail.com");
		
		System.out.println(user1.getFirstName());
		System.out.println(user2.getFirstName());

		Instructor instructor1 = new Instructor();
		instructor1.setAbout("Java Dili Eðiticisi");
		instructor1.setFirstName("Emirhan");
		
		Instructor instructor2 = new Instructor();
		instructor2.setAbout("C# Dili Eðiticisi");
		instructor2.setFirstName("Ali");
		
		Student student1 = new Student();
		student1.setFirstName("Gönül");
		
		System.out.println(instructor1.getFirstName());
		
		InstructorManager ýnstructorManager = new InstructorManager();
		ýnstructorManager.login(instructor1);
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.login(instructor2);
		
		
		
		

		
		//User[] users =  {user1, user2, instructor1,instructor2};
		//userManager.addMultiple(users);
		
	
	}

}
