package TExtra_Gimnasio;

public class Reserva {
	
	private ClaseGrupal clase;
	private MiembroRegular miembro;
	
	public Reserva() {
		super();
	}

	public Reserva(ClaseGrupal clase, MiembroRegular miembro) {
		super();
		this.clase = clase;
		this.miembro = miembro;
	}

	public ClaseGrupal getClase() {
		return clase;
	}

	public void setClase(ClaseGrupal clase) {
		this.clase = clase;
	}

	public MiembroRegular getMiembro() {
		return miembro;
	}

	public void setMiembro(MiembroRegular miembro) {
		this.miembro = miembro;
	}

	@Override
	public String toString() {
		return "Reserva: Clase: " + clase + ", miembro: " + miembro;
	}

}
