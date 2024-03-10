package TExtra_GimnasioSol;

public class MiembroRegular extends Usuario {

	private int edad;
	private String tipoMembresia;
	public MiembroRegular() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MiembroRegular(String nombre, String direccion, String telefono, String correo) {
		super(nombre, direccion, telefono, correo);
		// TODO Auto-generated constructor stub
	}
	public MiembroRegular(String nombre, String direccion, String telefono, String correo, int edad, String tipoMembresia) {
		super(nombre, direccion, telefono, correo);
		this.edad = edad;
		this.tipoMembresia = tipoMembresia;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipoMembresia() {
		return tipoMembresia;
	}
	public void setTipoMembresia(String tipoMembresia) {
		this.tipoMembresia = tipoMembresia;
	}
	@Override
	public String toString() {
		return "MiembroRegular [nombre=" + getNombre() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", correo=" + getCorreo() + 
				" edad=" + edad +  ", tipoMembresia=" + tipoMembresia + "]";
	}
	
	
}
