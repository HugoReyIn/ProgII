package T2_grado;

public class Asignatura {
	
	private String nombre;
	private int codigo;
	private int curso;
	private float creditos;
	
	public Asignatura() {
		super();
	}

	public Asignatura(String nombre, int codigo, int curso, float creditos) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.curso = curso;
		this.creditos = creditos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public float getCreditos() {
		return creditos;
	}

	public void setCreditos(float creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "\n\n\t\tAsignatura: " + nombre + "\n\t\tCodigo: " + codigo + "\n\t\tCurso: " + curso + "\n\t\tCréditos: " + creditos;
	}
	
	

}
