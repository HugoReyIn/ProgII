package TExtra_AgenciaViajes;

public class PaqueteMontanna extends PaqueteTuristico {
	
	private String nomCampamento;
	private String localidad;
	
	public PaqueteMontanna() {
		super();
	}
	public PaqueteMontanna(String nombre, float precioBase, String destino, int maxPersonas, int duracion) {
		super(nombre, precioBase, destino, maxPersonas, duracion);
	}
	
	public PaqueteMontanna(String nombre, float precioBase, String destino, int maxPersonas, int duracion,
			String nomCampamento, String localidad) {
		super(nombre, precioBase, destino, maxPersonas, duracion);
		this.nomCampamento = nomCampamento;
		this.localidad = localidad;
	}
	
	public String getNomCampamento() {
		return nomCampamento;
	}
	
	public void setNomCampamento(String nomCampamento) {
		this.nomCampamento = nomCampamento;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return "PaqueteMontanna [nomCampamento=" + nomCampamento + ", localidad=" + localidad + ", getNombre()="
				+ getNombre() + ", getPrecioBase()=" + getPrecioBase() + ", getDestino()=" + getDestino()
				+ ", getMaxPersonas()=" + getMaxPersonas() + ", getDuracion()=" + getDuracion() + "]";
	}
	
	@Override
	public float calculaPrecio(int numPersonas) {
		return ((getPrecioBase()*numPersonas)+20);
	}
}
