package T2_lanzallamas;

public class Lanzallamas {
	
	private String usuario;
	private String color;
	private int nSerie;
	private int contador = 10000;
	
	public Lanzallamas() {
		super();
	}

	public Lanzallamas(String usuario, String color) {
		super();
		this.usuario = usuario;
		this.color = color;
		this.nSerie = generarNSerie();
	}
	
	public int generarNSerie() {
		return contador = generarNSerie() + 1;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Lanzallamas " + nSerie + ", usuario: " + usuario + ", color: " + color;
	}
}
