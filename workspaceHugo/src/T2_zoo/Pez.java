package T2_zoo;

public class Pez extends Animal {
	
	private float velNado;
	private boolean aguaDulce;
	
	public Pez() {
		super();
	}
	public Pez(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
	
	}
	
	public Pez(String nombre, String especie, int edad, float peso, float longitud, float velNado, boolean aguaDulce) {
		super(nombre, especie, edad, peso, longitud);
		this.velNado = velNado;
		this.aguaDulce = aguaDulce;
	}
	
	public float getVelNado() {
		return velNado;
	}
	
	public void setVelNado(float velNado) {
		this.velNado = velNado;
	}
	
	public boolean isAguaDulce() {
		return aguaDulce;
	}
	
	public void setAguaDulce(boolean aguaDulce) {
		this.aguaDulce = aguaDulce;
	}
	
	@Override
	public String toString() {
		return "Pez [velNado=" + velNado + ", aguaDulce=" + aguaDulce + ", getNombre()=" + getNombre()
				+ ", getEspecie()=" + getEspecie() + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso()
				+ ", getLongitud()=" + getLongitud() + "]";
	}
	
	@Override
	public String hablar() {
		String hablar = new String();
		return hablar;
	}
	
}
