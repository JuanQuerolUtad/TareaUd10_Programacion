package alumno;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Pepe", "DAWE", 6);
		Alumno alumno2 = new Alumno("Manuel", "DAWE");
		Alumno alumno3 = new Alumno("Alejandro");
		//alumno1
		alumno1.cambiarAsignaturas(10);
		alumno1.setNotas(5, 10);
		//alumno2
		alumno2.ModificarNombre("Jose");
		alumno2.modificarCurso("DAMP");
		//alumno3
		alumno3.AprobadoDeterminado(3);
		alumno3.eliminarNotas();
	}

}
