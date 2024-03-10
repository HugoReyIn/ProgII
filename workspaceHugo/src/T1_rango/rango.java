package T1_rango;

import java.util.ArrayList;

public class rango {
	
	public static void main(String[] args) {
		ArrayList<Integer> lNumeros = new ArrayList<>();
		int indiceMayorNumero = 0;
		int indiceMenorNumero = 0;
		int mayorNumero = 0;
		int menorNumero = 0;
		int resultado = 0;
		
		for (int i = 0; i < 100; i++) {
			int numero = (int) (Math.random() * (1000 - 1 + 1) + 1);
			lNumeros.add(numero);
		}
		
		for (int i = 0; i < lNumeros.size(); i++) {
			if (lNumeros.get(i) < lNumeros.get(indiceMenorNumero)) {
				indiceMenorNumero = i;
				menorNumero = lNumeros.get(i);
			}
			if (lNumeros.get(i) > lNumeros.get(indiceMayorNumero)) {
				indiceMayorNumero = i;
				mayorNumero = lNumeros.get(i);
			}
		}
		
		resultado = mayorNumero - menorNumero;
		
		System.out.println("El rango es: " + resultado + " (" + menorNumero + " - " + mayorNumero + ")");
		
	}

}
