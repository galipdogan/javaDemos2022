package staticDemo;
//Manager siniflari static yapilmaz.
public class ProductManager {
	
	
	
	public void add(Product product) {
		//ProductValidator validator=new ProductValidator(); // bu sekilde kullanim 
		
		if(ProductValidator.isValid(product)) { // bu sekilde kullanim da bir kere olusuyor. butun kullanicilar bu sekilde kullanir.
			//arac amaciyla kullanilir.Kullan birak arac olarak diyebiliriz
			System.out.println("Urun eklendi");
		}
		else {
			System.out.println("Urun bilgileri gecersizdir.");
		}
		
		ProductValidator validator=new ProductValidator();
		validator.bisey();
		//staticler direk class ismiyle cagrilir ve bellektede olusturulur.
		//yapici bloklar new leyince calisir
	}
}
