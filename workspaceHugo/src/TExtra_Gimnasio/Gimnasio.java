package TExtra_Gimnasio;

import java.util.ArrayList;

public class Gimnasio {
	
	private ArrayList<Usuario> lUsuarios; 
	private ArrayList<ClaseGrupal> lClasesGrupales;
	private ArrayList<Reserva> lReservas;
	
	public Gimnasio() {
		super();
	}

	public Gimnasio(ArrayList<Usuario> lUsuarios, ArrayList<ClaseGrupal> lClasesGrupales,
			ArrayList<Reserva> lReservas) {
		super();
		this.lUsuarios = lUsuarios;
		this.lClasesGrupales = lClasesGrupales;
		this.lReservas = lReservas;
	}

	public ArrayList<Usuario> getlUsuarios() {
		return lUsuarios;
	}

	public void setlUsuarios(ArrayList<Usuario> lUsuarios) {
		this.lUsuarios = lUsuarios;
	}

	public ArrayList<ClaseGrupal> getlClasesGrupales() {
		return lClasesGrupales;
	}

	public void setlClasesGrupales(ArrayList<ClaseGrupal> lClasesGrupales) {
		this.lClasesGrupales = lClasesGrupales;
	}

	public ArrayList<Reserva> getlReservas() {
		return lReservas;
	}

	public void setlReservas(ArrayList<Reserva> lReservas) {
		this.lReservas = lReservas;
	}

	@Override
	public String toString() {
		return "Gimnasio: Usuarios: " + lUsuarios + ", ClasesGrupales: " + lClasesGrupales + ", Reservas: " + lReservas;
	}
	
	public ClaseGrupal claseGrupalMasReservas() {
		int masClase = 0;
		ClaseGrupal claseGrupalMasReservas = new ClaseGrupal();
				
		for (int i = 0; i < lClasesGrupales.size(); i++) {
			int contador = 0;
			for (int j = 0; j < lReservas.size(); j++) {
				if (lClasesGrupales.get(i).equals(lReservas.get(j).getClase())) {
					contador++;
				}
			}
			if (masClase < contador) {
				masClase = contador;
				claseGrupalMasReservas = lClasesGrupales.get(i);
			}
		}
		return claseGrupalMasReservas;
	}
	
	public MiembroRegular miembroMasParticipa() {
		int masParticipacion = 0;
		MiembroRegular miembroRegularParticipativo = new MiembroRegular();
		ArrayList<MiembroRegular> lMiembroRegulares = crearListaMiembros();
		
		for (MiembroRegular miembro : lMiembroRegulares) {
			int contador = 0;
			for (Reserva reserva : lReservas) {
				if (reserva.getMiembro().equals(miembro)) {
					contador++;
				}
			}
			if (masParticipacion < contador) {
				masParticipacion = contador;
				miembroRegularParticipativo = miembro;
			}
		}
		
		return miembroRegularParticipativo;
	}
	
	private ArrayList<MiembroRegular> crearListaMiembros() {
	    ArrayList<MiembroRegular> listaMiembros = new ArrayList<>();

	    for (Reserva reserva : lReservas) {
	        MiembroRegular miembro = reserva.getMiembro();
	        if (!listaMiembros.contains(miembro)) {
	            listaMiembros.add(miembro);
	        }
	    }
	    return listaMiembros;
	}
	
	public void reservar(ClaseGrupal claseGrupal, MiembroRegular miembro, ArrayList<Reserva> reservas) {
		
		if (reservas.size() >= claseGrupal.getCapacidadMax()) {
			System.err.println("¡Lo sentimos! La clase ya está completa");
		} else {
			Reserva reserva = new Reserva(claseGrupal, miembro);
			reservas.add(reserva);
			System.out.println("Su reserva se ha realizado con exito");
		}
	}
	
	public void cancelarReserva(Reserva reserva, ArrayList<Reserva> reservas) {
		
		if (reservas.contains(reserva)) {
			reservas.remove(reserva);
			System.out.println("Su cancelacion se ha realizado con exito");
		} else {
			System.err.println("No se ha encontrado la reserva");
		}
	}
}