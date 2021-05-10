package coffeeShop.Concrete;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Abstract.CustomerCheckService;
import coffeeShop.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)){
           super.save(customer);
           
        }
        else {
            System.out.println("Not a valid person");
        }

    }

	


}
