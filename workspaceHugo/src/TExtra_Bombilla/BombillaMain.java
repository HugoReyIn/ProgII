package TExtra_Bombilla;

public class BombillaMain {

	public static void main(String[] args) {
		
		String colorNuevo = "Verde";
		int potenciaNueva = 18;
		Bombilla bombilla = new Bombilla(false, 15, "Rojo", 23.4f);
		
		System.out.println("1. " + bombilla);
		
		bombilla.encender();
		
		System.out.println("2. " + bombilla);
		
		bombilla.cambiaColor(colorNuevo);
		
		System.out.println("3. " + bombilla);
		
		bombilla.encender();
		bombilla.cambiaPotencia(potenciaNueva);
		
		System.out.println("4. " + bombilla);
		
		bombilla.verColor();
		
		bombilla.verPotencia();
		
		bombilla.apagar();
		
		System.out.println("5. " + bombilla);

	}

}
