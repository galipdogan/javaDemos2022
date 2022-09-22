package classesWithAttributes;

import java.security.ProtectionDomain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"
		//Product product=new Product(1,"Laptop","Asus Laptop",5000,3,"Siyah");
		
		Product product=new Product();
		
		product.setId(1);
		product.setName("Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
