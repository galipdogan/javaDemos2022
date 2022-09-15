package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Mukemmel: Gectiniz");
			break;

		case 'B':
			//System.out.println("Cok Guzel: Gectiniz");
			//break;

		case 'C':
			System.out.println("iyi: Gectiniz");
			break;

		case 'D':
			System.out.println("Fena Degil: Gectiniz");
			break;

		case 'F':
			System.out.println("Maalesef: Kadiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}
	}

}
