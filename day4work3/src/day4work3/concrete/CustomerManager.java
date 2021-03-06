package day4work3.concrete;



import day4work3.abstracts.CustomerCheckService;
import day4work3.abstracts.CustomerService;
import day4work3.entities.Customer;

public class CustomerManager  implements CustomerService{

	CustomerCheckService customerCheck;
	
	
	public CustomerManager(CustomerCheckService customerCheck) {
	
		this.customerCheck = customerCheck;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheck.CheckIfRealPerson(customer)) {
			System.out.println("Kullanıcı Kaydedildi "+customer.getFirstName());
		}else {
			System.out.println("Kullanıcı Kaydedilemedi");
		}
		
	}

	@Override
	public void Update(Customer customer) {
		System.out.println("Kullanıcı Güncellendi "+customer.getFirstName());
		
	}

	@Override
	public void Delete(Customer customer) {
		System.out.println("Kullanıcı Silindi "+customer.getFirstName());
		
	}

}
