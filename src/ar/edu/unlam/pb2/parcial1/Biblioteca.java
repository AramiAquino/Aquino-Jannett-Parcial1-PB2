package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List <Libro> libro;
	private Integer Prestados;
	
	
	public Biblioteca() {
		libro = new ArrayList();
	}


	public List<Libro> getLibros() {
		return libro;
	}


	public void setLibros(List<Libro> libro) {
		this.libro = libro;
	}

	
	public void solicitarPrestamoDeLibro(Libro libro) {
        if(libro.disponibilidad() == true && this.libro.size() <= 2) {
            this.libro.add(libro);
            libro.setDisponibilidad(false);
            Prestados++;
        }
    }
}
