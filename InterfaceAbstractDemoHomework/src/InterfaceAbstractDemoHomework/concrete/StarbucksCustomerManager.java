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
		
		if(customerCheckService.CheckIfRealPerson(customer)) {	//Bu ki�inin ger�ekten do�ru bir ki�i mi kontrol etme
			super.Save(customer);							//Ge�erli bir ki�i kaydet
		}else {
			System.out.println("Not a valid person");	//Ge�erli bir ki�i de�il
		}
		
		
		
	}
	

}
