package TExtra_Gimnasio;

public class Entrenador extends Usuario {
	
	private String certificacion;
	private String especialidad;
	
	public Entrenador() {
		super();
	}

	public Entrenador(String nombre, String direccion, int numTelefono, String correoElectronico, String certificacion,
			String especialidad) {
		super(nombre, direccion, numTelefono, correoElectronico);
		this.certificacion = certificacion;
		this.especialidad = especialidad;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Entrenador: Certificacion: " + certificacion + ", especialidad: " + especialidad + "]";
	}
	
	

}
