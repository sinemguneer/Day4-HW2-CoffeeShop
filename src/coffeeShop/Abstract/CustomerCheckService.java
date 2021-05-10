package coffeeShop.Abstract;

import coffeeShop.Entities.Customer;

public interface CustomerCheckService {
	
	public boolean checkIfRealPerson(Customer customer);
		
}
