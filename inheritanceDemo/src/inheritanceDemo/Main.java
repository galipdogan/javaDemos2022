package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		TarimKrediManager tarimKrediManager=new TarimKrediManager();
		
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		
	}

}
