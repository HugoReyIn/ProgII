package T2_transporte;

public class Transporte {
	
	private String matricula;
	private int annoCompra;
	private int caballo;
	private String modelo;
	
	public Transporte() {
		super();
	}

	public Transporte(String matricula, int annoCompra, int caballo, String modelo) {
		super();
		this.matricula = matricula;
		this.annoCompra = annoCompra;
		this.caballo = caballo;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnnoCompra() {
		return annoCompra;
	}

	public void setAnnoCompra(int annoCompra) {
		this.annoCompra = annoCompra;
	}

	public int getCaballo() {
		return caballo;
	}

	public void setCaballo(int caballo) {
		this.caballo = caballo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Transporte: Matricula: " + matricula + ", año de compra: " + annoCompra + ", caballos: " + caballo
				+ ", modelo: " + modelo;
	}	
}
