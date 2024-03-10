package T2_libreria;

import java.util.ArrayList;

public class LibreriaMain {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Nada", "Carmen Laforet", 2010, "9788423342792");
		Libro libro2 = new Libro("El último trabajo del señor Luna", "Cesar Mallorqui", 2023, "9788423676798");
		Libro libro3 = new Libro("Al sur de ninguna parte", "Jordi Sierra i Fabra", 2014, "9788468309491");
		
		ArrayList<Libro> lLibros = new ArrayList<Libro>();
		
		lLibros.add(libro1);
		lLibros.add(libro2);
		lLibros.add(libro3);
		
		Libreria libreria1 = new Libreria("Elkar", "Iparraguirre", "Bilbao", 48011, lLibros);
		
		System.out.println(libreria1);
	}
}
