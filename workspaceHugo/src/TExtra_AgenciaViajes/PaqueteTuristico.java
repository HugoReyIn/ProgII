package TExtra_AgenciaViajes;

public abstract class PaqueteTuristico {
	
	private String nombre;
	private float precioBase;
	private String destino;
	private int maxPersonas;
	private int duracion;
	
	public PaqueteTuristico() {
		super();
	}

	public PaqueteTuristico(String nombre, float precioBase, String destino, int maxPersonas, int duracion) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.destino = destino;
		this.maxPersonas = maxPersonas;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getMaxPersonas() {
		return maxPersonas;
	}

	public void setMaxPersonas(int maxPersonas) {
		this.maxPersonas = maxPersonas;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "PaqueteTuristico [nombre=" + nombre + ", precioBase=" + precioBase + ", destino=" + destino
				+ ", maxPersonas=" + maxPersonas + ", duracion=" + duracion + "]";
	}
	
	public abstract float calculaPrecio(int numPersonas);

}
