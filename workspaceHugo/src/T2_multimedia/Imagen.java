package T2_multimedia;

public class Imagen extends Multimedia {
	
	private float ancho;
	private float alto;
	
	public Imagen() {
		super();
	}
	
	public Imagen(Formato formato, int tamañoBytes, String nombre) {
		super(formato, tamañoBytes, nombre);
	}

	public Imagen(Formato formato, int tamañoBytes, String nombre, float ancho, float alto) {
		super(formato, tamañoBytes, nombre);
		this.ancho = ancho;
		this.alto = alto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Imagen: ancho: " + ancho + "x, alto: " + alto + "y, formato: " + getFormato() + ", tamañoBytes: "
				+ getTamañoBytes() + ", nombre: " + getNombre();
	}
}
