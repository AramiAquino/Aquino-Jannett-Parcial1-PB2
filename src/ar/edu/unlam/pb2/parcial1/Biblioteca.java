package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List <Libro> libros;
	List <Prestamo> prestamo;
	
	
	public Biblioteca() {
		libros = new ArrayList<>();
		prestamo = new ArrayList();
	}


	public List<Libro> getLibros() {
		return libros;
	}


	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}


	public void prestarLibro(Prestamo prestamo) {
		for(int i=0; i < libros.size(); i++) {
			if (libro != null) {
				prestamo.add(prestamo);
			}
		}
		if libro esta en la biblioteca 
			libros.add(libro);
	}
}
