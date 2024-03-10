package TExtra_Gimnasio;

public class MiembroRegular extends Usuario {
	
	private int edad;
	private String tipoMembresia;
	
	public MiembroRegular() {
		super();
		
	}
	
	public MiembroRegular(String nombre, String direccion, int numTelefono, String correoElectronico, int edad,
			String tipoMembresia) {
		super(nombre, direccion, numTelefono, correoElectronico);
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
		return "MiembroRegular [edad=" + edad + ", tipoMembresia=" + tipoMembresia + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getNumTelefono()=" + getNumTelefono()
				+ ", getCorreoElectronico()=" + getCorreoElectronico() + "]";
	}

		
}
