package InterfaceAbstractDemoHomework.concrete;

import InterfaceAbstractDemoHomework.abstracts.CustomerCheckSerivce;
import InterfaceAbstractDemoHomework.entities.Customer;

public class CustomerCheckManager implements CustomerCheckSerivce{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {		//Bu biz yazdýk test ortamý fakat mernis gerçek sistemde adaptörü kullanýrýz
		
		return true;
		
	}

	

}
