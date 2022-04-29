package ar.edu.utn.link.correlativas;

import java.util.Collection;
import java.util.List;

public class Alumno {
	private String nombre;
	private List<Curso> curso;
	private  Collection<Materia> materiasAprobadas;
	
	
	
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Curso> getCurso() {
		return curso;
	}
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	public Collection<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(Collection<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}


	public void inscribir(Curso curso2) {
		
		
	}
	

}
