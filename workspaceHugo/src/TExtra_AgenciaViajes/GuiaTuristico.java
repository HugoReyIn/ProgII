package TExtra_AgenciaViajes;

public class GuiaTuristico {
	
	private String nombre;
	private String direccion;
	private int edad;
	private int telefono;
	private String sexo;
	private float calificacion;
	
	public GuiaTuristico() {
		super();
	}

	public GuiaTuristico(String nombre, String direccion, int edad, int telefono, String sexo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.telefono = telefono;
		this.sexo = sexo;
		this.calificacion = calculaCalificacion(calificacion);
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "GuiaTuristico [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", telefono="
				+ telefono + ", sexo=" + sexo + ", calificacion=" + calificacion + "]";
	}
	
	public float calculaCalificacion(float score) {
		return ((calificacion + score)/2);
	}

}
