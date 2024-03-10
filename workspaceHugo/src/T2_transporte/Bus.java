package T2_transporte;

public class Bus extends Transporte {
	
	private int nPlazas;

	public Bus() {
		super();
	}

	public Bus(String matricula, int annoCompra, int caballo, String modelo) {
		super(matricula, annoCompra, caballo, modelo);
	}

	public Bus(String matricula, int annoCompra, int caballo, String modelo, int nPlazas) {
		super(matricula, annoCompra, caballo, modelo);
		this.nPlazas = nPlazas;
	}

	public int getnPlazas() {
		return nPlazas;
	}

	public void setnPlazas(int nPlazas) {
		this.nPlazas = nPlazas;
	}

	@Override
	public String toString() {
		return "Bus: Numero de plazas: " + nPlazas + ", matricula: " + getMatricula() + ", año de compra: " + getAnnoCompra()
				+ ", caballos: " + getCaballo() + ", modelo: " + getModelo();
	}
	
	

}
