package staticDemo;

import java.security.ProtectionDomain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager productManager=new ProductManager();
		Product product=new Product();
		product.id=1;
		product.price=10;
		product.name="Mouse";
		
		productManager.add(product);
		
		
		DatabaseHelper.Connection.CreateConnection();;
	}

}
