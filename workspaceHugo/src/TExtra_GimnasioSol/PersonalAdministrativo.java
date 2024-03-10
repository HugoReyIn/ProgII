package TExtra_GimnasioSol;

public class PersonalAdministrativo extends Usuario {
	
	private String puestoOcupa;
	private int cantidadHoras;
	public PersonalAdministrativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalAdministrativo(String nombre, String direccion, String telefono, String correo) {
		super(nombre, direccion, telefono, correo);
		// TODO Auto-generated constructor stub
	}
	public PersonalAdministrativo(String nombre, String direccion, String telefono, String correo, String puestoOcupa, int cantidadHoras) {
		super(nombre, direccion, telefono, correo);
		this.puestoOcupa = puestoOcupa;
		this.cantidadHoras = cantidadHoras;
	}
	public String getPuestoOcupa() {
		return puestoOcupa;
	}
	public void setPuestoOcupa(String puestoOcupa) {
		this.puestoOcupa = puestoOcupa;
	}
	public int getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	@Override
	public String toString() {
		return "PersonalAdministrativo [nombre=" + getNombre() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", correo=" + getCorreo() +
				"puestoOcupa=" + puestoOcupa + ", cantidadHoras=" + cantidadHoras + "]";
	}
	
}
