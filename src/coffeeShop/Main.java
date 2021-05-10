package coffeeShop;

import java.time.LocalDate;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Adapter.MernisServiceAdapter;
import coffeeShop.Concrete.NeroCustomerManager;
import coffeeShop.Concrete.StarbucksCustomerManager;
import coffeeShop.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Sinem","Güner",LocalDate.of(1995,10 , 12),"11111111111"));
		

	}

}
