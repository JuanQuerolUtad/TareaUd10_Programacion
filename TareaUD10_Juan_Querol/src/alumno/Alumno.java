package alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Alumno {
	private String nombre;
	private String curso;
	private int[] notas;
	//contructor I
	public Alumno(String nombre, String curso, int asignaturas) {
		this.nombre=nombre;
		this.curso=curso;
		this.notas=new int[asignaturas];
	}
	//constructor II
	public Alumno(String nombre, String curso) {
		this(nombre, curso, 5);
	}
	//constructor II
	public Alumno(String nombre) {
		this(nombre, "DAM", 5);
	}
	/*introduce la nota de la asignatura que quiera*/
	public void setNotas(int asignatura, int nota) {
		notas[asignatura]=nota;
	}
	/*modifica el nombre por si acaso anteriormente se ha equivodadoal ecribir su nombre
	 * o que se ha cambiado el nombre*/
	public void ModificarNombre(String nombre) {
		this.nombre = nombre;
	}
	/*modifica el curso por si anteriormente se ha equivodado al ecribir el curso 
	 * o no ha escrito nada
	 * o que se ha cambiado de curso*/
	public void modificarCurso(String curso) {
		this.curso = curso;
	}
	/*modifica el numero de asignaturas*/
	public void cambiarasignaturas(int asignaturas) {
		this.notas= new int[asignaturas];
	}
	/*elimina todas las notas puestas*/
	public void eliminarNotas() {
		for (int i = 0; i < notas.length; i++) {
			notas[i]=0;
		}
	}
	/*añade el numero de cincos que le ha puesto el usuario 
	 * si el usuario sabe que ha aprobado pero no sabe la nota*/
	public void AprobadoDeterminado(int aprobadas) {
		for (int i = 0; i < aprobadas; i++) {
			notas[i]=5;
		}
	}
	
	
	
	
	
	
}
