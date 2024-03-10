package T2_multimedia;

public class Multimedia {
	
	private Formato formato;
	private int tamañoBytes;
	private String nombre;
	
	public Multimedia() {
		super();
	}

	public Multimedia(Formato formato, int tamañoBytes, String nombre) {
		super();
		this.formato = formato;
		this.tamañoBytes = tamañoBytes;
		this.nombre = nombre;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public int getTamañoBytes() {
		return tamañoBytes;
	}

	public void setTamañoBytes(int tamañoBytes) {
		this.tamañoBytes = tamañoBytes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Multimedia > Formato: ." + formato + ", tamañoBytes: " + tamañoBytes + ", nombre: " + nombre;
	}	
}
