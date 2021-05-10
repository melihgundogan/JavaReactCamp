package abstracts;

import entities.Customer;

public abstract class CustomerManager implements CustomerService{
	public void save(Customer customer) {
		System.out.println("Saved to db: "+ customer.firstName);
	}

}
