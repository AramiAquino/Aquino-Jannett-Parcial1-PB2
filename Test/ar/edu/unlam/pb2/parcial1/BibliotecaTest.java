package ar.edu.unlam.pb2.parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queSePuedaPrestarUnLibro() {
		Integer codigo = 123;
		String nombre= "nombre";
		String autor = "autor";
		Libro libro = new Libro(codigo, nombre, autor);
		
		
		Biblioteca b = new Biblioteca ("Unlam");
		
		
		Integer dni = 1234;
		String apellido = "Aquino";
		Alumno alumno = new Alumno(dni, apellido, nombre);
		
		alumno.prestarLibro(libro);
		Boolean ok = libro.disponibilidad();
		assertFalse(ok);
	}
	
	@Test
	public void queSePuedaImprimirLibrosDeHistoriaYGeografia() {
		Integer codigo = 123;
		String nombre= "nombre";
		String autor = "autor";
		Libro libro = new Historia(codigo, nombre, autor);
		
		
		Biblioteca b = new Biblioteca ("Unlam");
		
		
		Integer dni = 1234;
		String apellido = "Aquino";
		Alumno alumno = new Alumno(dni, apellido, nombre);
		
		alumno.prestarLibro(libro);
		Boolean ok = libro.disponibilidad();
		assertFalse(ok);
	}

}
