package T2_grado;

import java.util.ArrayList;

public class Estudiante {
	
	private String nombre;
	private String dni;
	private int curso;
	private ArrayList<Asignatura> lAsignaturas;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String dni, int curso, ArrayList<Asignatura> lAsignaturas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.curso = curso;
		this.lAsignaturas = lAsignaturas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public ArrayList<Asignatura> getlAsignaturas() {
		return lAsignaturas;
	}

	public void setlAsignaturas(ArrayList<Asignatura> lAsignaturas) {
		this.lAsignaturas = lAsignaturas;
	}

	@Override
	public String toString() {
		return "\n\n\tEstudiante: " + nombre + "\n\tDNI: " + dni + "\n\tCurso: " + curso + "\n\tAsignaturas: " + lAsignaturas;
	}
	
	

}
