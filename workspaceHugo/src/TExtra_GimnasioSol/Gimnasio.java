package TExtra_GimnasioSol;

import java.util.ArrayList;

public class Gimnasio {

	private ArrayList<Usuario> listaUsuarios;
	private static ArrayList<Reserva> listaReservas;
	private ArrayList<ClaseGrupal> listaClasesGrupales;
	public Gimnasio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gimnasio(ArrayList<Usuario> listaUsuarios, ArrayList<Reserva> listaReservas,
			ArrayList<ClaseGrupal> listaClasesGrupales) {
		super();
		this.listaUsuarios = listaUsuarios;
		Gimnasio.listaReservas = listaReservas;
		this.listaClasesGrupales = listaClasesGrupales;
	}
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public static ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(ArrayList<Reserva> listaReservasNew) {
		listaReservas = listaReservasNew;
	}
	public ArrayList<ClaseGrupal> getListaClasesGrupales() {
		return listaClasesGrupales;
	}
	public void setListaClasesGrupales(ArrayList<ClaseGrupal> listaClasesGrupales) {
		this.listaClasesGrupales = listaClasesGrupales;
	}
	@Override
	public String toString() {
		return "Gimnasio [listaUsuarios=" + listaUsuarios + ", listaReservas=" + listaReservas
				+ ", listaClasesGrupales=" + listaClasesGrupales + "]";
	}
	
	/**Clase grupal que mas usuarios tiene reserva*/
	public ClaseGrupal claseMasUsuariosReserva () {
		int masReservas = 0;
		ClaseGrupal claseMasReservas = new ClaseGrupal();
		for (int i = 0; i < listaClasesGrupales.size(); i++) {
			int count = 0;
			for (int j = 0; j < listaReservas.size(); j++) {
				if(listaClasesGrupales.get(i).equals(listaReservas.get(j).getClaseGrupal())){
					count++;
				}
			}
			if(count > masReservas) {
				masReservas = count;
				claseMasReservas = listaClasesGrupales.get(i);
			}
		}
		return claseMasReservas;
	}
	
	/**Miembro que mas participa en las clases grupales**/
	public MiembroRegular miembroMasParticipacionClases () {
		int cantidadParticipaciones = 0;
		MiembroRegular miembroRegular = new MiembroRegular();
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i) instanceof MiembroRegular) { 
				int countClases = 0;
				for (int j = 0; j < listaReservas.size(); j++) {
					if(listaReservas.get(j).getUsuario().equals(listaUsuarios.get(i))) {
						countClases++;
					}
				}
				if(countClases > cantidadParticipaciones) {
					cantidadParticipaciones = countClases;
					miembroRegular = (MiembroRegular) listaUsuarios.get(i);
				}
			}
		}
		return miembroRegular;
	}
	
	/**Reservar clase grupal*/
	public void reservarClaseGrupal (ClaseGrupal claseGrupal, MiembroRegular miembroRegular) {
		if(claseGrupal.getDisponibilidad() < claseGrupal.getCapacidadMaxima()) {
			Reserva reserva = new Reserva(claseGrupal, miembroRegular);
			listaReservas.add(reserva);
			System.out.println("La reserva se ha realizado con exito");
		}
		else System.out.println("La reserva no se ha podido hacer porque la clase esta completa");
		
		
	}
	
	
	/**Cancelar reserva*/
	public void cancelarReservaClaseGrupal (Reserva reserva) {
		int posReserva = -1;
		for (int i = 0; i < listaReservas.size(); i++) {
			if(listaReservas.get(i).equals(reserva)) posReserva = i;
		}
		if(posReserva != -1)
			listaReservas.remove(posReserva);
		else System.out.println("Esta reserva no se encuentra no se encuentra activa");
	}
	
	/**Miembros reservados dado una clase grupal*/
	public ArrayList<Usuario> miembrosClaseGrupal (ClaseGrupal claseGrupal) {
		ArrayList<Usuario> listaMiembrosClase = new ArrayList<>();
		for (int i = 0; i < listaReservas.size(); i++) {
			if(listaReservas.get(i).getClaseGrupal().equals(claseGrupal)) 
				listaMiembrosClase.add(listaReservas.get(i).getUsuario());
		}
		System.out.println(listaMiembrosClase.toString());
		return listaMiembrosClase;
	}
	
	
}
