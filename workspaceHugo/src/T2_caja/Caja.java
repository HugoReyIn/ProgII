package T2_caja;

public class Caja {
	
	private float ancho;
	private float largo;
	private float alto;
	
	public Caja() {
		super();
	}

	public Caja(float ancho, float largo, float alto) {
		super();
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Caja (" + ancho + "x ," + largo + "y ," + alto + "z)";
	}
	
	public static int comparaCajas(Caja c1, Caja c2) {
		float volumenC1 = c1.getAlto() * c1.getAncho() * c1.getLargo();
		float volumenC2 = c2.getAlto() * c2.getAncho() * c2.getLargo();
		
		if (volumenC1 > volumenC2) {
			return -1;
		} else if (volumenC1 == volumenC2) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
}
