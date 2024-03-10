package T1_buscarNumeroMenor;

import java.util.ArrayList;

public class bucarMenor {

	public static void main(String[] args) {
		ArrayList<Integer> lNumeros = new ArrayList<>();
		int menorIndice = 0;
		int menorNumero = 0;
		
		for (int i = 0; i < 100; i++) {
			int numero = (int) (Math.random() * (1000 - 1 + 1) + 1);
			lNumeros.add(numero);
		}
		
		for (int i = 0; i < lNumeros.size(); i++) {
			if (lNumeros.get(i) < lNumeros.get(menorIndice)) {
				menorIndice = i;
				menorNumero = lNumeros.get(i);
			}
		}
		
		System.out.println("El menor número de la lista es el " + menorNumero + " y está en la posición: " + menorIndice);
		
	}

}
