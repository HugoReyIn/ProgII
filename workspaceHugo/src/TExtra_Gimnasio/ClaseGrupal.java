package TExtra_Gimnasio;

public class ClaseGrupal {
	
	private String nombre;
	private Entrenador entrenador;
	private int capacidadMax;
	private CategoriaClase categoria;
	
	public ClaseGrupal() {
		super();
	}

	public ClaseGrupal(String nombre, Entrenador entrenador, int capacidadMax, CategoriaClase categoria) {
		super();
		this.nombre = nombre;
		this.entrenador = entrenador;
		this.capacidadMax = capacidadMax;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public CategoriaClase getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaClase categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ClaseGrupal: " + nombre + ", entrenador: " + entrenador + ", capacidadMax: " + capacidadMax
				+ ", categoria: " + categoria;
	}
	
	

}
