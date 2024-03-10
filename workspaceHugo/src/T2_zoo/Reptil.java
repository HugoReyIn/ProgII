package T2_zoo;

public class Reptil extends Animal {
	
	private boolean esVenenoso;

	public Reptil() {
		super();
	}

	public Reptil(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
	}

	public Reptil(boolean esVenenoso) {
		super();
		this.esVenenoso = esVenenoso;
	}

	public boolean isEsVenenoso() {
		return esVenenoso;
	}

	public void setEsVenenoso(boolean esVenenoso) {
		this.esVenenoso = esVenenoso;
	}

	@Override
	public String toString() {
		return "Reptil [esVenenoso=" + esVenenoso + ", getNombre()=" + getNombre() + ", getEspecie()=" + getEspecie()
				+ ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getLongitud()=" + getLongitud() + "]";
	}

	@Override
	public String hablar() {
		String hablar = new String();
		return hablar;
		
	}
	
	

}
