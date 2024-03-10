package TExtra_Gimnasio;

import java.util.ArrayList;

public class GimnasioMain {

	public static void main(String[] args) {
		
		ArrayList<MiembroRegular> lMiembros = new ArrayList<MiembroRegular>();
		ArrayList<Reserva> lReservas = new ArrayList<Reserva>();
		ArrayList<ClaseGrupal> lClases = new ArrayList<ClaseGrupal>();
		
		Entrenador entrenador1 = new Entrenador("Pepe Rodriguez", "C/Iparraguirre", 654879532, "pepe.rodriguez@gimnasiomartinez.es", "Ciencias del deporte", "fuerza");
		Entrenador entrenador2 = new Entrenador("Alberto Chicote", "C/Rodriguez Arias", 624596321, "alberto.chicote@gimnasiomartinez.es", "Ciencias del deporte", "Aerobico");
		
		//PersonalAdministrativo personal1 = new PersonalAdministrativo("Carlos Pancho", "C/Orixe", 653214596, "carlos.pancho@gimnasiomartinez.es", "recepcionista", 8);
		//PersonalAdministrativo personal2 = new PersonalAdministrativo("Aiala Correa", "C/Cantabria", 653214596, "aiala.correa@gimnasiomartinez.es", "seguridad", 6);
		
		MiembroRegular miembro1 = new MiembroRegular("Paco Sanchez", "C/Elcano", 698324106, "pacosanchez@gmail.com", 24, "normal");
		MiembroRegular miembro2 = new MiembroRegular("Leire Martinez", "C/Ramon y Cajal", 640032146, "leiremartinez@gmail.com", 30, "normal");
		MiembroRegular miembro3 = new MiembroRegular("Muskilda Morene", "C/Universidad", 654032017, "muskildamoreno@gmail.com", 19, "premium");
		MiembroRegular miembro4 = new MiembroRegular("Ander Mendieta", "C/Juan de Ajuriaguerra", 639802146, "andermendieta@gmail.com", 36, "normal");
		MiembroRegular miembro5 = new MiembroRegular("Cesar Alvarez", "C/Ercilla", 699302145, "cesaralvarez@gmail.com", 26, "premium");
		
		lMiembros.add(miembro1);
		lMiembros.add(miembro2);
		lMiembros.add(miembro3);
		lMiembros.add(miembro4);
		lMiembros.add(miembro5);
		
		ClaseGrupal clase1 = new ClaseGrupal("Cardio", entrenador2, 15, CategoriaClase.CARDIO);
		ClaseGrupal clase2 = new ClaseGrupal("Fuerza", entrenador1, 8, CategoriaClase.ENTRENAMIENTO_DE_FUERZA);
		ClaseGrupal clase3 = new ClaseGrupal("Pilates", entrenador1, 20, CategoriaClase.PILATES);
		ClaseGrupal clase4 = new ClaseGrupal("C.Acuaticas", entrenador2, 15, CategoriaClase.CLASES_ACUATICAS);
		
		lClases.add(clase1);
		lClases.add(clase2);
		lClases.add(clase3);
		lClases.add(clase4);
		
		Reserva reserva1 = new Reserva(clase4, miembro5);
		Reserva reserva2 = new Reserva(clase4, miembro3);
		Reserva reserva3 = new Reserva(clase3, miembro2);
		Reserva reserva4 = new Reserva(clase1, miembro4);
		Reserva reserva5 = new Reserva(clase2, miembro1);
		Reserva reserva6 = new Reserva(clase4, miembro3);
		
		lReservas.add(reserva1);
		lReservas.add(reserva2);
		lReservas.add(reserva3);
		lReservas.add(reserva4);
		lReservas.add(reserva5);
		lReservas.add(reserva6);
		
		Gimnasio gimnasio = new Gimnasio(null, lClases, lReservas);
		
		
		System.out.println(gimnasio.claseGrupalMasReservas());
		System.out.println(gimnasio.miembroMasParticipa());
		
	}

}
