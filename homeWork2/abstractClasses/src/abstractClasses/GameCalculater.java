package abstractClasses;

public abstract class GameCalculater {
	public abstract void hesapla();// bunu kullanacak ancak kendi kuralini yazmasi gerekiyor.Ornegin kullanici turune gore hesaplamani yaptir
	
	public final void gameOver() { //bu final yaparak hicbir zaman degismeyecek kural
		System.out.println("Oyun biti : 100");
	}
}
