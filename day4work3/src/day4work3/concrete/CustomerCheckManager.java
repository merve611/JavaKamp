package day4work3.concrete;

import day4work3.abstracts.CustomerCheckService;
import day4work3.abstracts.CustomerService;
import day4work3.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {		//Simule test ortamý
		
		return true;
	}

	

}
