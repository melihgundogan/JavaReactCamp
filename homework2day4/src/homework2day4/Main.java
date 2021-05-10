package homework2day4;

import abstracts.CustomerManager;
import concretes.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customermanager = new CustomerManager(NeroCustomerManager);
		

	}

}
