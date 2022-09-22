package methods;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 8;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		String mesaj="";
		if (varMi) {
			// System.out.println("Sayi mevcuttur: " + aranacak);
			mesaj="Sayi mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi mevcut degildir: " + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
