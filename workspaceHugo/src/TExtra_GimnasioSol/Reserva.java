package TExtra_GimnasioSol;

public class Reserva {

	private ClaseGrupal claseGrupal;
	private Usuario usuario;
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reserva(ClaseGrupal claseGrupal, Usuario usuario) {
		super();
		this.claseGrupal = claseGrupal;
		this.usuario = usuario;
	}
	public ClaseGrupal getClaseGrupal() {
		return claseGrupal;
	}
	public void setClaseGrupal(ClaseGrupal claseGrupal) {
		this.claseGrupal = claseGrupal;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
