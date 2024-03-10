package T2_multimedia;

public class Video extends Multimedia {
	
	private int duracionSegundos;
	private Calidad calidad;
	
	public Video() {
		super();
	}
	
	public Video(Formato formato, int tamañoBytes, String nombre) {
		super(formato, tamañoBytes, nombre);
	}

	public Video(Formato formato, int tamañoBytes, String nombre, int duracionSegundos, Calidad calidad) {
		super(formato, tamañoBytes, nombre);
		this.duracionSegundos = duracionSegundos;
		this.calidad = calidad;
	}

	public int getDuracionSegundos() {
		return duracionSegundos;
	}

	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}

	public Calidad getCalidad() {
		return calidad;
	}

	public void setCalidad(Calidad calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Video: duracionSegundos: " + duracionSegundos + ", calidad: " + calidad;
	}
	
	

}
