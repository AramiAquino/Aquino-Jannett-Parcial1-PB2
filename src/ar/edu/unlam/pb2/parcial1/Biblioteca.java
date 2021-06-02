package ar.edu.unlam.pb2.parcial1;

public class Biblioteca {

    private String nombre;
    private Integer cantidadDePrestamos = 0;

    public Biblioteca(String nombre ) {
        this.nombre = nombre;
    }

    public void prestarLibro(Libro libro, Alumno estudiante) {
        estudiante.prestarLibro(libro);
        cantidadDePrestamos++;
    }

    public void obtenerLibrosDeAlumno(Alumno estudiante) {
        estudiante.librosPrestados();
    }

    public void desvincularLibroDeEstudiante(Libro libro, Alumno estudiante) {
        estudiante.eliminarLibro(libro);
    }

    public Integer getCantidadDePrestamos() {
        return cantidadDePrestamos;
    }

    public void setContadorDePrestamos(Integer contadorDePrestamos) {
        this.cantidadDePrestamos = contadorDePrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}