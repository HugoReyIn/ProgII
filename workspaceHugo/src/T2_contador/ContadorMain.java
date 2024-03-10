package T2_contador;

public class ContadorMain {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		System.out.println(contador);
		
		contador.incrementar();
		
		System.out.println(contador);
		
		contador.decrementar();
		
		System.out.println(contador);
	}

}
