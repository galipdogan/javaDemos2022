package abtractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager();
		//customerManager.databaseManager = new OracleDatabaseManager();
		// customerManager.databaseManager = new SqlServerDatabaseManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
