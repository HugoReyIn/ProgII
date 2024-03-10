package T2_zoo;

public class Ave extends Animal {
	
	private float tamanno;
	private String colorHuevos;
	
	public Ave() {
		super();
	}
	
	public Ave(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
	}

	public Ave(float tamanno, String colorHuevos) {
		super();
		this.tamanno = tamanno;
		this.colorHuevos = colorHuevos;
	}

	public float getTamanno() {
		return tamanno;
	}

	public void setTamanno(float tamanno) {
		this.tamanno = tamanno;
	}

	public String getColorHuevos() {
		return colorHuevos;
	}

	public void setColorHuevos(String colorHuevos) {
		this.colorHuevos = colorHuevos;
	}

	@Override
	public String toString() {
		return "Ave [tamanno=" + tamanno + ", colorHuevos=" + colorHuevos + ", getNombre()=" + getNombre()
				+ ", getEspecie()=" + getEspecie() + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso()
				+ ", getLongitud()=" + getLongitud() + "]";
	}

	@Override
	public String hablar() {
		String hablar = new String();
		return hablar;
	}
	
}
