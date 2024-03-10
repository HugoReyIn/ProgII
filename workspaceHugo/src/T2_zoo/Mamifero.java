package T2_zoo;

public class Mamifero extends Animal {
	
	private int nCrias;

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
		// TODO Auto-generated constructor stub
	}

	public Mamifero(int nCrias) {
		super();
		this.nCrias = nCrias;
	}

	public int getnCrias() {
		return nCrias;
	}

	public void setnCrias(int nCrias) {
		this.nCrias = nCrias;
	}

	@Override
	public String toString() {
		return "Mamifero [nCrias=" + nCrias + ", getNombre()=" + getNombre() + ", getEspecie()=" + getEspecie()
				+ ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getLongitud()=" + getLongitud() + "]";
	}

	@Override
	public String hablar() {
		String hablar = new String();
		return hablar;
	}
	
	

}
