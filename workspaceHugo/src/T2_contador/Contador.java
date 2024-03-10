package T2_contador;

import java.util.Arrays;

public class Contador {
	
	private int[] contadores = new int[5];

	public Contador() {
		super();
	}

	public Contador(int[] contadores) {
		super();
		this.contadores = contadores;
	}

	public int[] getContadores() {
		return contadores;
	}

	public void setContadores(int[] contadores) {
		this.contadores = contadores;
	}

	@Override
	public String toString() {
		return "Contador " + Arrays.toString(contadores);
	}
	
	public void incrementar() {
		for (int i = 0; i < contadores.length; i++) {
			contadores[i] += 1;
		}
	}
	
	public void decrementar() {
		for (int i = 0; i < contadores.length; i++) {
			contadores[i] -= 1;
		}
	}

}
