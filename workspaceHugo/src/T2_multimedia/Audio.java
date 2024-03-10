package T2_multimedia;

public class Audio extends Multimedia {
	
	private int duracionSegundos;

	public Audio() {
		super();
	}
	
	public Audio(Formato formato, int tamañoBytes, String nombre) {
		super(formato, tamañoBytes, nombre);
	}

	public Audio(Formato formato, int tamañoBytes, String nombre, int duracionSegundos) {
		super(formato, tamañoBytes, nombre);
		this.duracionSegundos = duracionSegundos;
	}

	public int getDuracionSegundos() {
		return duracionSegundos;
	}

	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}

	@Override
	public String toString() {
		return "Audio: duracionSegundos: " + duracionSegundos;
	}
}
