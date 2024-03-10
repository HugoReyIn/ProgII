package T2_grado;

import java.util.ArrayList;

public class GradoMain {

	public static void main(String[] args) {
		
		ArrayList<Asignatura> lAsignaturas = new ArrayList<Asignatura>();
		ArrayList<Estudiante> lEstudiantes = new ArrayList<Estudiante>();
		
		Asignatura asignatura1 = new Asignatura("Programación II R", 45786, 1, 6.0f);
		Asignatura asignatura2 = new Asignatura("Base de datos II", 41235, 2, 6.0f);
		Asignatura asignatura3 = new Asignatura("Interación y Multimedia", 58730, 2, 6.0f);
		Asignatura asignatura4 = new Asignatura("Programación IV", 10259, 2, 6.0f);
		Asignatura asignatura5 = new Asignatura("Arquitectura de computadores", 32671, 3, 6.0f);
		
		lAsignaturas.add(asignatura1);
		lAsignaturas.add(asignatura2);
		lAsignaturas.add(asignatura3);
		lAsignaturas.add(asignatura4);
		lAsignaturas.add(asignatura5);

		Estudiante estudiante1 = new Estudiante("Paco Gerte", "74563259J", 1, lAsignaturas);
		Estudiante estudiante2 = new Estudiante("Alberto", "12569830P", 2, lAsignaturas);
		Estudiante estudiante3 = new Estudiante("Ana", "36598123M", 3, lAsignaturas);
		Estudiante estudiante4 = new Estudiante("María", "25836941L", 2, lAsignaturas);
		Estudiante estudiante5 = new Estudiante("Iker", "36977852A", 1, lAsignaturas);
		
		lEstudiantes.add(estudiante1);
		lEstudiantes.add(estudiante2);
		lEstudiantes.add(estudiante3);
		lEstudiantes.add(estudiante4);
		lEstudiantes.add(estudiante5);
		
		Grado grado = new Grado("Ing. Infórmatica + VRVA", lEstudiantes);
		
		System.out.println(grado);
	}

}
