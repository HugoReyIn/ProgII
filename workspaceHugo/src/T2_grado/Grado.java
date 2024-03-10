package T2_grado;

import java.util.ArrayList;

public class Grado {
	
	private String nombre;
	private ArrayList<Estudiante> lEstudiantes;
	
	public Grado() {
		super();
	}

	public Grado(String nombre, ArrayList<Estudiante> lEstudiantes) {
		super();
		this.nombre = nombre;
		this.lEstudiantes = lEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Estudiante> getlEstudiantes() {
		return lEstudiantes;
	}

	public void setlEstudiantes(ArrayList<Estudiante> lEstudiantes) {
		this.lEstudiantes = lEstudiantes;
	}

	@Override
	public String toString() {
		return "Grado: " + nombre + "\nEstudiantes: " + lEstudiantes;
	}
	
	

}
