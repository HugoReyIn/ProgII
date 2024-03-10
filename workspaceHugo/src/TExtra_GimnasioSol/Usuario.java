package TExtra_GimnasioSol;

public class Usuario {

	private String nombre;
	private String direccion;
	private String telefono;
	private String correo;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String nombre, String direccion, String telefono, String correo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}
	
	
	
}
