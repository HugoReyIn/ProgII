package T2_persona;

public class PersonaMain {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Pedro", 45, Sexo.H, 1979);
		Persona p2 = new Persona("Carla", 34, Sexo.M, 1990);
				
		System.out.println(Persona.getContador());
	}
}
