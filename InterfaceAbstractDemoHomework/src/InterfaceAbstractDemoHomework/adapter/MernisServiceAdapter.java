package InterfaceAbstractDemoHomework.adapter;

import InterfaceAbstractDemoHomework.abstracts.CustomerCheckSerivce;
import InterfaceAbstractDemoHomework.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckSerivce{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

}
