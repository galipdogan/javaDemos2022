package intefaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerManager customerManager=new CustomerManager();
		
		//ICustomerDal customerDal=new OracleCustomerDal();
		//customerManager.customerDal= new MySqlCustomerDal();
		//customerManager.customerDal= new OracleCustomerDal();
		
		
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
