package T2_persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private Sexo sexo;
	private int anno;
	private static int contador = 0;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, Sexo sexo, int anno) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.anno = anno;
		contador++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Persona " + nombre + ", edad: " + edad + ", sexo: " + sexo + ", año:" + anno + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		contador--;
		super.finalize();
	}
}
