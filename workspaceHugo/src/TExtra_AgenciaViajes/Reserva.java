package TExtra_AgenciaViajes;

public class Reserva {
	
	private boolean confirmacion;
	private String nomTitular;
	private PaqueteTuristico paquete;
	private int numPersonas;
	private GuiaTuristico guia;
	
	public Reserva() {
		super();
	}

	public Reserva(boolean confirmacion, String nomTitular, PaqueteTuristico paquete, int numPersonas, GuiaTuristico guia) {
		super();
		this.confirmacion = confirmacion;
		this.nomTitular = nomTitular;
		this.paquete = paquete;
		this.numPersonas = numPersonas;
		this.guia = guia;
	}

	public boolean isConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public PaqueteTuristico getPaquete() {
		return paquete;
	}

	public void setPaquete(PaqueteTuristico paquete) {
		this.paquete = paquete;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public GuiaTuristico getGuia() {
		return guia;
	}

	public void setGuia(GuiaTuristico guia) {
		this.guia = guia;
	}

	@Override
	public String toString() {
		return "Reserva [confirmacion=" + confirmacion + ", nomTitular=" + nomTitular + ", paquete=" + paquete
				+ ", numPersonas=" + numPersonas + ", guia=" + guia + "]";
	}

}
