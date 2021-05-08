package day4work3.abstracts;

import day4work3.entities.Customer;

public interface CustomerService {

	void Save(Customer customer);
	void Update(Customer customer);
	void Delete(Customer customer);
	
}
