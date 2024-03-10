package TExtra_GimnasioSol;

public class ClaseGrupal {
	
	private String nombre;
	private EntrenadorPersonal entrenadorPersonal;
	private int capacidadMaxima;
	private Categorias categoria;
	
	public ClaseGrupal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClaseGrupal(String nombre, EntrenadorPersonal entrenadorPersonal, int capacidadMaxima,
			Categorias categoria) {
		super();
		this.nombre = nombre;
		this.entrenadorPersonal = entrenadorPersonal;
		this.capacidadMaxima = capacidadMaxima;
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EntrenadorPersonal getEntrenadorPersonal() {
		return entrenadorPersonal;
	}
	public void setEntrenadorPersonal(EntrenadorPersonal entrenadorPersonal) {
		this.entrenadorPersonal = entrenadorPersonal;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public Categorias getCategoria() {
		return categoria;
	}
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "ClaseGrupal [nombre=" + nombre + ", entrenadorPersonal=" + entrenadorPersonal + ", capacidadMaxima="
				+ capacidadMaxima + ", categoria=" + categoria + "]";
	}
	
	public int getDisponibilidad() {
		int reservas = 0;
		for (int i = 0; i < Gimnasio.getListaReservas().size(); i++) {
			if (Gimnasio.getListaReservas().get(i).getClaseGrupal().getNombre().equals(this.getNombre())) {
				reservas ++;
			}
		}
		int disponibilidad = this.capacidadMaxima - reservas;
		return disponibilidad;
	}
	
	
}
