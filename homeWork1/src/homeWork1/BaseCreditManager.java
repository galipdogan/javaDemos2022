package homeWork1;

public abstract class BaseCreditManager implements ICreditManager{
	@Override
	public  abstract void Calculate(); // ortak degil heryerde degisken
	// ortak operasyonlari tutar ancak tamamlanmamis olanlari tutar
	//her cagrildiginda icindekiler degisecektir.

	@Override
	public void Save() {
		System.out.println("Kaydedildi.");
		
	}
}
