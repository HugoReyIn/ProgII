package T2_transporte;

public class Taxi extends Transporte {
	
	private String nLicencia;

	public Taxi() {
		super();
	}

	public Taxi(String matricula, int annoCompra, int caballo, String modelo) {
		super(matricula, annoCompra, caballo, modelo);
	}

	public Taxi(String matricula, int annoCompra, int caballo, String modelo, String nLicencia) {
		super(matricula, annoCompra, caballo, modelo);
		this.nLicencia = nLicencia;
	}

	public String getnLicencia() {
		return nLicencia;
	}

	public void setnLicencia(String nLicencia) {
		this.nLicencia = nLicencia;
	}

	@Override
	public String toString() {
		return "Taxi: Licencia: " + nLicencia + ", matricula: " + getMatricula() + ", año de compra: "
				+ getAnnoCompra() + ", caballos: " + getCaballo() + ", modelo: " + getModelo();
	}
	
	

}
