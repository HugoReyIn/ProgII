package T2_libreria;

import java.util.ArrayList;

public class Libreria {
	
	private String nombre;
	private String calle;
	private String localidad;
	private int codigoPostal;
	private ArrayList<Libro> lLibros;
	
	
	public Libreria() {
		super();
	}
	
	public Libreria(String nombre, String calle, String localidad, int codigoPostal, ArrayList<Libro> lLibros) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.lLibros = lLibros;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public ArrayList<Libro> getlLibros() {
		return lLibros;
	}
	
	public void setlLibros(ArrayList<Libro> lLibros) {
		this.lLibros = lLibros;
	}
	
	@Override
	public String toString() {
		return "Libreria '" + nombre + "': C/" + calle + ", " + localidad + " "
				+ codigoPostal + ". Libros disponibles: " + lLibros;
	}
}
