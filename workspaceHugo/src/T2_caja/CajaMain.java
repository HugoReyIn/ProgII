package T2_caja;

public class CajaMain {
	
	public static void main(String[] args) {
		
		Caja c1 = new Caja(5.25f, 5.30f, 7.15f);
		Caja c2 = new Caja(3.85f, 9.65f, 1.95f);
		
		int resultado = Caja.comparaCajas(c1, c2);
		
		System.out.println(resultado);
	}

}