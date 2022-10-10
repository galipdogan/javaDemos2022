package staticDemo;

public  class ProductValidator {
	
	static {
		System.out.println("yapici blok calisti");
	}
	
	
	public  ProductValidator() {
		System.out.println("yapici blok calisti");
	}
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty())

			return true;
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	public static class baskaBirClass {
		public static void sil() {
			
		}
	}
}
