package TExtra_Gimnasio;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int numTelefono;
	private String correoElectronico;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String direccion, int numTelefono, String correoElectronico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numTelefono = numTelefono;
		this.correoElectronico = correoElectronico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Usuario " + nombre + ", direccion: " + direccion + ", numTelefono: " + numTelefono
				+ ", correoElectronico: " + correoElectronico;
	}
}
