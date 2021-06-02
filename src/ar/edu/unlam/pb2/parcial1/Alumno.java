package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private Integer dni;
	private String apellido;
	private String nombre;
	private List <Libro> libros = new ArrayList<Libro>();
	private final static Integer limitePrestamo = 2;
	
	public Alumno(Integer dni, String apellido, String nombre) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public Boolean prestarLibro(Libro libro) {
        if(libro.disponibilidad() == true && this.libros.size() <= limitePrestamo ) {
            this.libros.add(libro);
            libro.setDisponibilidad(false);
            return true;
        }
        return false;
    }

    public List librosPrestados() {
        return this.libros;
    }

    public void devolverLibro(String codigo){
        for (Libro libro : libros){
           if (libro.getCodigo().equals(codigo)){
               libros.remove(libro);
               libro.setDisponibilidad(true);
             }
         }
    }
    
    public void eliminarLibro(Libro libro) {
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
/*package ar.edu.unlam.p1pb2;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private Integer dni;
    private String nombre;
    private String apellido;
    private List <Libro> libros = new ArrayList<Libro>(); 

    public Estudiante(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void solicitarPrestamoDeLibro(Libro libro) {
        if(libro.getDisponible() == true && this.libros.size() <= 2) {
            this.libros.add(libro);
            libro.setDisponible(false);
        }
    }

    public List listarLibrosOtorgados() {
        return this.libros;
    }

    public void eliminarLibro(String codigo){
        for (Libro libro : libros){
           if (libro.getCodigo().equals(codigo)){
               libros.remove(libro);
               libro.setDisponible(true);
             }
         }
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }




}*/
