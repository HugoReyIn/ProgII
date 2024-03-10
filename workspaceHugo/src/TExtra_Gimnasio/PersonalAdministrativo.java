package TExtra_Gimnasio;

public class PersonalAdministrativo extends Usuario {
	
	private String puesto;
	private int horario;
	
	public PersonalAdministrativo() {
		super();
	}

	public PersonalAdministrativo(String nombre, String direccion, int numTelefono, String correoElectronico,
			String puesto, int horario) {
		super(nombre, direccion, numTelefono, correoElectronico);
		this.puesto = puesto;
		this.horario = horario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "PersonalAdministrativo: Puesto: " + puesto + ", horario: " + horario;
	}

	
	
	

}
