package TExtra_GimnasioSol;

public class EntrenadorPersonal extends Usuario {
	
	private String certificacion;
	private String especialidad;
	public EntrenadorPersonal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntrenadorPersonal(String nombre, String direccion, String telefono, String correo) {
		super(nombre, direccion, telefono, correo);
		// TODO Auto-generated constructor stub
	}
	public EntrenadorPersonal(String nombre, String direccion, String telefono, String correo, String certificacion, String especialidad) {
		super(nombre, direccion, telefono, correo);
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
		return "EntrenadorPersonal [ nombre=" + getNombre() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", correo=" + getCorreo() +
				" certificacion=" + certificacion + ", especialidad=" + especialidad + "]";
	}

}
