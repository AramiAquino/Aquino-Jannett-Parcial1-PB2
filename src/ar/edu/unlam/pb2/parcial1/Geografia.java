package ar.edu.unlam.pb2.parcial1;

public abstract class Geografia extends Libro implements Fotocopiable{

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		// TODO Auto-generated constructor stub
	}

	public String Fotocopiable() {
		return "Geografia";
	}
}
