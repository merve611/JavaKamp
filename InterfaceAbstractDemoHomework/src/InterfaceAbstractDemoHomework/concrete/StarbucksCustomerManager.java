package InterfaceAbstractDemoHomework.concrete;

import InterfaceAbstractDemoHomework.abstracts.BaseCustomerManager;
import InterfaceAbstractDemoHomework.abstracts.CustomerCheckSerivce;
import InterfaceAbstractDemoHomework.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	
	private CustomerCheckSerivce customerCheckService; 
	
	public StarbucksCustomerManager(CustomerCheckSerivce customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {	//Bu kiþinin gerçekten doðru bir kiþi mi kontrol etme
			super.Save(customer);							//Geçerli bir kiþi kaydet
		}else {
			System.out.println("Not a valid person");	//Geçerli bir kiþi deðil
		}
		
		
		
	}
	

}
