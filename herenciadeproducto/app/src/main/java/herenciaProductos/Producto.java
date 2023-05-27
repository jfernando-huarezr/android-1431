package herenciaProductos;

public class Producto {
    protected long codigo;
    protected String nombre;
    protected int stock;
    protected double precio;

    public Producto(long codigo, String nombre, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void incrementarStock(int cantidad){
        if(cantidad>0) stock=stock+cantidad; //stock += cantidad
    }

    public double venta(int cantidad) {
        if(cantidad<=stock){
            stock=stock-cantidad; // stock -= cantidad
            return cantidad*precio;
        }

        return 0.00;
    }
}
