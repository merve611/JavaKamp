package InterfaceAbstractDemoHomework.concrete;

import InterfaceAbstractDemoHomework.abstracts.CustomerCheckSerivce;
import InterfaceAbstractDemoHomework.entities.Customer;

public class CustomerCheckManager implements CustomerCheckSerivce{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {		//Bu biz yazd�k test ortam� fakat mernis ger�ek sistemde adapt�r� kullan�r�z
		
		return true;
		
	}

	

}
