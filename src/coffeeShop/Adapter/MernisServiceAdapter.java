package coffeeShop.Adapter;

import java.rmi.RemoteException;

import coffeeShop.Abstract.CustomerCheckService;
import coffeeShop.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName(),
					customer.getLastName(), 
					customer.getDateOfBirth().getYear());
		} 
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}	