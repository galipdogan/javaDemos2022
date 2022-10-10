package abstractClasses;

//abtract siniflar asla new lenemez ve newlendiginde override yapmaniz gerekiyor bunu tavsiye edilmiyor.
public class Main {

	public static void main(String[] args) {
		WomanGameCalculater womanGameCalculater = new WomanGameCalculater();
		womanGameCalculater.hesapla();
		womanGameCalculater.gameOver();

		GameCalculater gameCalculater = new WomanGameCalculater();

	}

}
