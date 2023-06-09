package herenciaProductos;

public class Libros extends Producto {

    private String autor;
    private String editorial;
    private int numhojas;

    public Libros(long codigo, String nombre, int stock, double precio, String autor, String editorial) {
        super(codigo, nombre, stock, precio);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String mostrar() {
        return "Libro: "+nombre+"\n"+
                "Autor: "+autor+"\n"+
                "Editorial: "+editorial+"\n"+
                "Precio: "+precio;

    }
}
