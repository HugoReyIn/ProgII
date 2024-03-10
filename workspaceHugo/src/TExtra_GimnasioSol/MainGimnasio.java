package TExtra_GimnasioSol;

import java.util.ArrayList;

public class MainGimnasio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntrenadorPersonal  entrenadorPersonal = new EntrenadorPersonal("Pedro Lopez", "Avenida 24", "655894561", "pedro@deusto.es", "Certificado GAP", "GAP");
		System.out.println(entrenadorPersonal.toString());
		PersonalAdministrativo administrativo = new PersonalAdministrativo("Maria Jesus", "Avenida 25", "654879221", "maria@deusto.es", "Secretaria", 8);
		System.out.println(administrativo.toString());
		
		MiembroRegular miembroRegular1 = new MiembroRegular("Juan Jose", "Avenida 31", "213456987", "juanjo@deusto.es", 42, "VIP"); 
		MiembroRegular miembroRegular2 = new MiembroRegular("Laura Fernandez", "Avenida 31", "788887775", "laura.es", 25, "VIP"); 
		MiembroRegular miembroRegular3 = new MiembroRegular("Nubia Sanchez", "Avenida 31", "22233541", "nubia@deusto.es", 31, "VIP"); 
		MiembroRegular miembroRegular4 = new MiembroRegular("Raquel Urquijo", "Avenida 31", "66998845", "raquel@deusto.es", 39, "VIP"); 
		MiembroRegular miembroRegular5 = new MiembroRegular("Julio Guitierrez", "Avenida 31", "22151887", "julio@deusto.es", 44, "VIP"); 
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(miembroRegular1);
		listaUsuarios.add(miembroRegular2);
		listaUsuarios.add(miembroRegular3);
		listaUsuarios.add(miembroRegular4);
		listaUsuarios.add(miembroRegular5);
		listaUsuarios.add(entrenadorPersonal);
		listaUsuarios.add(administrativo);
		
		ClaseGrupal claseGrupal1 = new ClaseGrupal("GAP", entrenadorPersonal, 34, Categorias.EntrenamientoFuerza);
		ClaseGrupal claseGrupal2 = new ClaseGrupal("HIT", entrenadorPersonal, 28, Categorias.Cardio);
		ClaseGrupal claseGrupal3 = new ClaseGrupal("Zumba", entrenadorPersonal, 20, Categorias.ClasesBaile);
		System.out.println(claseGrupal1);
		ArrayList<ClaseGrupal> listaClasesGrupales = new ArrayList<>();
		listaClasesGrupales.add(claseGrupal1);
		listaClasesGrupales.add(claseGrupal2);
		Reserva reserva1 = new Reserva(claseGrupal1, miembroRegular1);
		Reserva reserva2 = new Reserva(claseGrupal1, miembroRegular2);
		Reserva reserva3 = new Reserva(claseGrupal1, miembroRegular3);
		Reserva reserva4 = new Reserva(claseGrupal2, miembroRegular3);
		Reserva reserva5 = new Reserva(claseGrupal2, miembroRegular4);
		Reserva reserva6 = new Reserva(claseGrupal2, miembroRegular5);
		Reserva reserva7 = new Reserva(claseGrupal2, miembroRegular1);
		Reserva reserva8 = new Reserva(claseGrupal2, miembroRegular2);
		Reserva reserva9 = new Reserva(claseGrupal3, miembroRegular3);
		
		ArrayList<Reserva> listaReservas = new ArrayList<>();
		listaReservas.add(reserva1);
		listaReservas.add(reserva2);
		listaReservas.add(reserva3);
		listaReservas.add(reserva4);
		listaReservas.add(reserva5);
		listaReservas.add(reserva6);
		listaReservas.add(reserva7);
		listaReservas.add(reserva8);
		listaReservas.add(reserva9);
		
		Gimnasio gimnasio = new Gimnasio();
		gimnasio.setListaReservas(listaReservas);
		gimnasio.setListaClasesGrupales(listaClasesGrupales);
		gimnasio.setListaUsuarios(listaUsuarios);
		
		System.out.println(gimnasio.toString());
		System.out.println("La clase grupal que mas reservas tiene es: " + gimnasio.claseMasUsuariosReserva().getNombre());
		System.out.println("El miembro que mas participacion tiene en las clases grupales es: " + gimnasio.miembroMasParticipacionClases().toString());
		
		System.out.println("La disponibilidad de la clase grupal: " + gimnasio.getListaClasesGrupales().get(0).getNombre() + " es: " + gimnasio.getListaClasesGrupales().get(0).getDisponibilidad());
		System.out.println("La disponibilidad de la clase grupal: " + gimnasio.getListaClasesGrupales().get(1).getNombre() + " es: " + gimnasio.getListaClasesGrupales().get(1).getDisponibilidad());
		
		/*comprobar reservar o cancelar clases grupales*/
		System.out.println("Los miembros de la clase grupal: " + gimnasio.getListaClasesGrupales().get(0).getNombre() + " son: " + gimnasio.miembrosClaseGrupal(claseGrupal1));
		gimnasio.reservarClaseGrupal(claseGrupal1, miembroRegular4);
		System.out.println("La disponibilidad de la clase grupal: " + gimnasio.getListaClasesGrupales().get(0).getNombre() + " es: " + gimnasio.getListaClasesGrupales().get(0).getDisponibilidad());
		System.out.println("Los miembros de la clase grupal: " + gimnasio.getListaClasesGrupales().get(0).getNombre() + " son: " + gimnasio.miembrosClaseGrupal(claseGrupal1));
		
		System.out.println(Gimnasio.getListaReservas().size());
		gimnasio.cancelarReservaClaseGrupal(Gimnasio.getListaReservas().get(Gimnasio.getListaReservas().size() - 1));
		System.out.println(Gimnasio.getListaReservas().size());
		
	}

}
