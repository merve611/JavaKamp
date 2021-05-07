package InterfaceAbstractDemoHomework;

import java.time.LocalDate;

import InterfaceAbstractDemoHomework.abstracts.BaseCustomerManager;
import InterfaceAbstractDemoHomework.abstracts.CustomerCheckSerivce;
import InterfaceAbstractDemoHomework.adapter.MernisServiceAdapter;
import InterfaceAbstractDemoHomework.concrete.NeroCustomerManager;
import InterfaceAbstractDemoHomework.concrete.StarbucksCustomerManager;
import InterfaceAbstractDemoHomework.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1996, 8, 30);			//Mernis sadece yýla bakar ay ve güne bakmaz
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Merve");
		customer.setLastName("Çakýroðlu");
		customer.setDateOfBirth(date);	
		customer.setNationalId("12345");		//mernis için doðru kimlik no girilmeli
		
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);
	}

}

