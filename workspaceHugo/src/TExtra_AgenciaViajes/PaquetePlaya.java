package TExtra_AgenciaViajes;

public class PaquetePlaya extends PaqueteTuristico {
	
	private String nomHotel;

	public PaquetePlaya() {
		super();
	}

	public PaquetePlaya(String nombre, float precioBase, String destino, int maxPersonas, int duracion) {
		super(nombre, precioBase, destino, maxPersonas, duracion);
	}

	public PaquetePlaya(String nombre, float precioBase, String destino, int maxPersonas, int duracion,
			String nomHotel) {
		super(nombre, precioBase, destino, maxPersonas, duracion);
		this.nomHotel = nomHotel;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	@Override
	public String toString() {
		return "PaqueteMontanna [nomHotel=" + nomHotel + ", getNombre()=" + getNombre() + ", getPrecioBase()="
				+ getPrecioBase() + ", getDestino()=" + getDestino() + ", getMaxPersonas()=" + getMaxPersonas()
				+ ", getDuracion()=" + getDuracion() + "]";
	}

	@Override
	public float calculaPrecio(int numPersonas) {
		return (getPrecioBase()*numPersonas);
	}
	
	
}
