package TExtra_AgenciaViajes;

import java.util.ArrayList;

public class AgneciaMain {

	public static void main(String[] args) {
		
		ArrayList<GuiaTuristico> lGuias = new ArrayList<GuiaTuristico>();
		ArrayList<Reserva> lReservas = new ArrayList<Reserva>();
		ArrayList<PaqueteMontanna> lMontannas = new ArrayList<PaqueteMontanna>();
		ArrayList<PaquetePlaya> lPlayas = new ArrayList<PaquetePlaya>();
		
		PaqueteMontanna paqueteM1 = new PaqueteMontanna("Vuelta al Himalaya", 120, "Nepal", 20, 6, "Bajo la montanna", "Karnali");
		PaqueteMontanna paqueteM2 = new PaqueteMontanna("Corriendo por los Pirineos", 80, "Francia", 15, 8, "Pirenaico", "Huesca");
		PaqueteMontanna paqueteM3 = new PaqueteMontanna("Subiendo los Andes", 150, "Argentina", 10, 15, "Andino", "Rio de la Plata");
		lMontannas.add(paqueteM1);
		lMontannas.add(paqueteM2);
		lMontannas.add(paqueteM3);
		
		PaquetePlaya paqueteP1 = new PaquetePlaya("Paraiso Miami", 60, "Miami", 40, 10, "Miami Beach");
		PaquetePlaya paqueteP2 = new PaquetePlaya("Canarias Love", 45, "Gran Canariaa", 25, 15, "Playa Lovers");
		lPlayas.add(paqueteP1);
		lPlayas.add(paqueteP2);
		
		GuiaTuristico guia1 = new GuiaTuristico("Paco Gerte", "C/Orixe, 23", 38, 657891022, "Hombre");
		GuiaTuristico guia2 = new GuiaTuristico("Sor Presa", "C/Mercaderes, 10", 42, 674112039, "Mujer");
		lGuias.add(guia1);
		lGuias.add(guia2);
		
		Reserva reserva1 = new Reserva(false, "Aitor Menta", paqueteM1, 15, guia2);
		Reserva reserva2 = new Reserva(true, "Sor Rita", paqueteP1, 8, guia1);
		Reserva reserva3 = new Reserva(true, "Jony Mentero", paqueteM2, 23, guia1);
		Reserva reserva4 = new Reserva(false, "Ester Colero", paqueteP2, 10, guia1);
		Reserva reserva5 = new Reserva(false, "Armando Jaleo", paqueteM3, 5, guia2);
		lReservas.add(reserva1);
		lReservas.add(reserva2);
		lReservas.add(reserva3);
		lReservas.add(reserva4);
		lReservas.add(reserva5);
		
		AgenciaViajes agencia = new AgenciaViajes(lPlayas, lMontannas, lReservas, lGuias);
		
		agencia.generaReservasAleatorias();
		
		System.out.println(agencia.tipoPaqueteMasReservas());
		
		System.out.println(agencia.promedioCantPersonaReservas());
		
		

	}

}
