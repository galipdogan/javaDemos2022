package intefaces;

public class CustomerManager {

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// is kodlarinin yazildigi yer
		customerDal.add();
	}
}
