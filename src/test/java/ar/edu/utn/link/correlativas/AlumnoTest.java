package ar.edu.utn.link.correlativas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

	public class AlumnoTest {
		
		@Test
		public void testIncripcionOk() throws Exception{
		Alumno alumno = new Alumno("Ezequiel");
		Curso curso = new Curso(new Materia("50"),2022);
				
				//opertaotria
				alumno.inscribir(curso);
		
				//portcond
				assertTrue(curso.estaInscripto(alumno));
		}
		public void testIncripcionFaltaCorrelativa() throws Exception{
		
		
	}
}
