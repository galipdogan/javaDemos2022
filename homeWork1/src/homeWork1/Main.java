package homeWork1;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;

		System.out.println(sayi1);

		/* Array referans tiptir sadece adres bilgisini tutar. */
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 10, 20, 30 };
		sayilar1 = sayilar2;

		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer();
		customer.id=1;
		customer.city="Izmir";
		//customer.nationalIdentity="123456789012";
		
		//CustomerManager customerManager=new CustomerManager(customer);
		//customerManager.Save();
		//customerManager.Delete();
		
		Person person=new Person();
		person.nationalIdentity="123456789012";
		person.firstName="Galip";
		person.lastName="Dogan";
		
		Company company=new Company();
		company.taxNumber="1213";
		company.compnayName="Arcelik";
		
		CustomerManager customerManager2=new CustomerManager(new Company(),new CarCreditManager());
		customerManager2.GiveCredit();
		customerManager2.Save();
		CustomerManager customerManager3=new CustomerManager(new Person(),new TeacherCreditManager());
		customerManager3.GiveCredit();
		customerManager3.Save();
		CustomerManager customerManager4=new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager4.GiveCredit();
		customerManager4.Save();
		
	
	}

}
