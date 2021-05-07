package InterfaceAbstractDemoHomework.entities;

import java.time.LocalDate;

import InterfaceAbstractDemoHomework.abstracts.Entity;

public class Customer implements Entity{

	
		private int id;
		private String FirstName;
		private String LastName;
		private LocalDate dateOfBirth;
		private String NationalId;
		
		
		public Customer() {}
		
		public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalId) {
			super();
			this.id = id;
			FirstName = firstName;
			LastName = lastName;
			this.dateOfBirth = dateOfBirth;
			NationalId = nationalId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getNationalId() {
			return NationalId;
		}

		public void setNationalId(String nationalId) {
			NationalId = nationalId;
		}

		

		
	

}
