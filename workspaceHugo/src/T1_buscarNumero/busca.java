package T1_buscarNumero;

import java.util.ArrayList;

public class busca {

	public static void main(String[] args) {
		ArrayList<Integer> lNumeros = new ArrayList<>();
		int numeroABuscar = 37;
		
		for (int i = 0; i < 100; i++) {
			int numero = (int) (Math.random() * (1000 - 1 + 1) + 1);
			lNumeros.add(numero);
		}			
		
		if (lNumeros.contains(numeroABuscar)) {
			int indice = lNumeros.indexOf(numeroABuscar);
			System.out.println("El número " + numeroABuscar + " está en la posición: " + indice);
		} else {
			System.out.println("El número " + numeroABuscar + " no está en la lista");
		}

	}

}
