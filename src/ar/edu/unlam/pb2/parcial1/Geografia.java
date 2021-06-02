package ar.edu.unlam.pb2.parcial1;

public class Geografia extends Libro implements Fotocopiable{

    public Geografia(Integer codigo, String nombre, String autor) {
        super(codigo, nombre, autor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String fotocopiable() {
        return "Geografia";
    }

}
