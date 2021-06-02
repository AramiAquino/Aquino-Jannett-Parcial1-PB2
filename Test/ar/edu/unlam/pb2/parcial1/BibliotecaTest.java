package ar.edu.unlam.pb2.parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {
	
	@Test
	public void queSePuedaImprimirLibrosDeHistoria() {
		Integer codigo = 123;
		String nombre= "nombre";
		String autor = "autor";
		Historia libro = new Historia(codigo, nombre, autor);
		
		
		String ve= "Historia";
		String vo = libro.fotocopiable();
		
		assertEquals(ve,vo);
		
		
	}
	
	@Test
	public void queSePuedaImprimirLibrosDeGeografia() {
		
		Integer codigo2 = 123;
		String nombre2= "nombre";
		String autor2 = "autor";
		Geografia libro2 = new Geografia(codigo2, nombre2, autor2);
		
		String ve2= "Geografia";
		String vo2 = libro2.fotocopiable();
		
		assertEquals(ve2,vo2);
		
		
	}

	@Test
	public void unLibroPrestadoNoEsteDisponible() {
	Integer codigo = 123;
	String nombre= "nombre";
	String autor = "autor";
	Libro libro = new Libro(codigo, nombre, autor);
	
	Integer dni = 1234;
	String apellido = "Aquino";
	Alumno alumno = new Alumno(dni, apellido, nombre);
	
	alumno.prestarLibro(libro);
	assertTrue(libro.disponibilidad());
	}
	
	@Test
	public void unLibroDevueltoEsteDisponible() {
	Integer codigo = 123;
	String nombre= "nombre";
	String autor = "autor";
	Libro libro = new Libro(codigo, nombre, autor);
	
	Integer dni = 1234;
	String apellido = "Aquino";
	Alumno alumno = new Alumno(dni, apellido, nombre);
	
	alumno.prestarLibro(libro);
	alumno.devolverLibro(apellido);
	assertTrue(libro.disponibilidad());
	}
	
	
	@Test
	public void queSePuedanPrestarDosLibros() {
        Libro libro1 = new Libro(123, "", "");
        Libro libro2 = new Libro(1232, "", "");

        Historia historia = new Historia(1223, "", "");
        Geografia geografia = new Geografia(1389, "", "Juli Castro");
        Alumno alumno1 = new Alumno(2598635, "", "");
        Biblioteca biblioteca = new Biblioteca("UNLaM");
        biblioteca.prestarLibro(libro1, alumno1);
        biblioteca.prestarLibro(historia, alumno1);
        assertTrue(alumno1.prestarLibro(libro2));

    }
}
