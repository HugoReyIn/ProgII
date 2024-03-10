package TExtra_Bombilla;

public class Bombilla {
	
	private boolean estado = false;
	private int potencia;
	private String color;
	private float horas = 10.0f;
	
	public Bombilla() {
		super();
	}

	public Bombilla(boolean estado, int potencia, String color, float horas) {
		super();
		this.estado = estado;
		this.potencia = potencia;
		this.color = color;
		this.horas = horas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Bombilla: " + estado + ", potencia: " + potencia + ", color: " + color + ", horas: " + horas;
	}
	
	public void encender() {
		this.estado = true;
	}
	
	public void apagar() {
		this.estado = false;
	}
	
	public void cambiaPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void cambiaColor(String color) {
		if (this.estado == true) {
			this.estado = false;
		}
		this.color = color;
	}
	
	public void verColor() {
		System.out.println("Color: " + getColor());
	}
	
	public int verPotencia() {
		System.out.println("Potencia: " + getPotencia());
		return getPotencia();
	}
}
