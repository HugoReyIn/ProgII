package T2_transporte;

public class EmpresaTransporteMain {

	public static void main(String[] args) {
		
		Bus bus = new Bus("1548HGY", 2018, 200, "Irizar i6", 60);
		
		Taxi taxi = new Taxi("3694MPL", 2015, 100, "SEAT Leon", "PO456930");
		
		System.out.println(bus);
		System.out.println(taxi);

	}

}
