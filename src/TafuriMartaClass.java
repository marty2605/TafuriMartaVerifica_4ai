/**
 * <U>classe produttoria</U> <i>04/02/2023</i>
 * @author <b>Tafuri Marta</b>
 * 
 *
 */
public class TafuriMartaClass {
	/**
	 * @param s indice iniziale
	 * @param f indice finale
	 */
	private int s,f;
	
	public TafuriMartaClass(int s, int f) {
		this.s = s;
		this.f = f;
	}
	/**
	 * 
	 * @param s indice iniziale
	 * @param f indice finale
	 * @return r moltiplicazione di fattori
	 */
	public int TafuriMet(int s,int f) {
		int r=0;	//ERRORE: int r=1
		for(int i=1;i<f;i++) {	//ERRORE: for(int i=s;i<=f;i++)
			r=r+r;	//ERRORE: r=r*i;
		}
		return r;
	}
	
	public String toString() {
		String st="indice iniziale = "+s+"\nindice finale = "+f+"\n\nmoltiplicazione dei fattori: "+TafuriMet(s,f);
		return st;
	}

	public static void main(String[] args) {
		TafuriMartaClass t=new TafuriMartaClass(5,7);
		t.TafuriMet(5, 7);
		System.out.println(t);
	}

}