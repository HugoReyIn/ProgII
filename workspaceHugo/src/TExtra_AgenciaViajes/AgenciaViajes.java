package TExtra_AgenciaViajes;

import java.util.ArrayList;

public class AgenciaViajes {
	
	private ArrayList<PaquetePlaya> lPaquetesPlaya = new ArrayList<PaquetePlaya>();
	private ArrayList<PaqueteMontanna> lPaquetesMontanna = new ArrayList<PaqueteMontanna>();
	private ArrayList<Reserva> lReservas = new ArrayList<Reserva>();
	private ArrayList<GuiaTuristico> lGuiasTuristicos = new ArrayList<GuiaTuristico>();
	
	public AgenciaViajes() {
		super();
	}

	public AgenciaViajes(ArrayList<PaquetePlaya> lPaquetesPlaya, ArrayList<PaqueteMontanna> lPaquetesMontanna,
			ArrayList<Reserva> lReservas, ArrayList<GuiaTuristico> lGuiasTuristicos) {
		super();
		this.lPaquetesPlaya = lPaquetesPlaya;
		this.lPaquetesMontanna = lPaquetesMontanna;
		this.lReservas = lReservas;
		this.lGuiasTuristicos = lGuiasTuristicos;
	}

	public ArrayList<PaquetePlaya> getlPaquetesPlaya() {
		return lPaquetesPlaya;
	}

	public void setlPaquetesPlaya(ArrayList<PaquetePlaya> lPaquetesPlaya) {
		this.lPaquetesPlaya = lPaquetesPlaya;
	}

	public ArrayList<PaqueteMontanna> getlPaquetesMontanna() {
		return lPaquetesMontanna;
	}

	public void setlPaquetesMontanna(ArrayList<PaqueteMontanna> lPaquetesMontanna) {
		this.lPaquetesMontanna = lPaquetesMontanna;
	}

	public ArrayList<Reserva> getlReservas() {
		return lReservas;
	}

	public void setlReservas(ArrayList<Reserva> lReservas) {
		this.lReservas = lReservas;
	}

	public ArrayList<GuiaTuristico> getlGuiasTuristicos() {
		return lGuiasTuristicos;
	}

	public void setlGuiasTuristicos(ArrayList<GuiaTuristico> lGuiasTuristicos) {
		this.lGuiasTuristicos = lGuiasTuristicos;
	}

	@Override
	public String toString() {
		return "AgenciaViajes [lPaquetesPlaya=" + lPaquetesPlaya + ", lPaquetesMontanna=" + lPaquetesMontanna
				+ ", lReservas=" + lReservas + ", lGuiasTuristicos=" + lGuiasTuristicos + "]";
	}
	
	public ArrayList<Reserva> generaReservasAleatorias() {
		ArrayList<Reserva> lReservas = new ArrayList<Reserva>();
		ArrayList<PaqueteTuristico> lPaquetes = new ArrayList<PaqueteTuristico>();
		lPaquetes.addAll(lPaquetesMontanna);
		lPaquetes.addAll(lPaquetesPlaya);
		
		for (int i = 0; i < 20; i++) {
			int posPaqAleatoria = (int) (Math.random()*lPaquetes.size());
			int numPerAleatorio = (int) (Math.random()*((20-10+1)+10));
			int posGuiaAleatoria = (int) (Math.random()*lGuiasTuristicos.size());
			Reserva reserva = new Reserva(false, "Titular-"+i, lPaquetes.get(posPaqAleatoria) ,numPerAleatorio , lGuiasTuristicos.get(posGuiaAleatoria));
			lReservas.add(reserva);
		}
		return lReservas;
	}
	
	public String tipoPaqueteMasReservas() {
		int contPlaya = 0;
		int contMontanna = 0;
		
		for (int i = 0; i < lReservas.size(); i++) {
			if (lReservas.get(i).getPaquete() instanceof PaqueteMontanna) {
				contMontanna++;
			} else {
				contPlaya++;
			}
		}

		if (contMontanna > contPlaya) {
			return "Montaña";
		} else if (contMontanna < contPlaya) {
			return "Playa";
		} else {
			return "Empate";
		}
	}
	
	public ArrayList<Float> promedioCantPersonaReservas() {
		ArrayList<Float> lCantidad = new ArrayList<Float>();
		float cantidadMontanna = 0;
		float cantidadPlaya = 0;
		
		for (Reserva reserva : lReservas) {
			if (reserva.getPaquete() instanceof PaqueteMontanna) {
				cantidadMontanna += reserva.getNumPersonas();
				
			} else {
				cantidadPlaya += reserva.getNumPersonas();
			}
		}
		
		cantidadMontanna = cantidadMontanna/lReservas.size();
		cantidadPlaya = cantidadPlaya/lReservas.size();
		
		lCantidad.add(cantidadMontanna);
		lCantidad.add(cantidadPlaya);
		
		return lCantidad;
	}
}
