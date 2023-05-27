package herenciaProductos;

import java.util.Date;

public class Carne extends Producto {
    private Date fechaProduccion;
    private Date fechaVencimiento;
    private String tipoCarne;
    private double peso;

    //CONSTRUCTOR
    public Carne(long codigo, String nombre, int stock, double precio, Date fechaVencimiento, String tipoCarne, double peso) {

        super(codigo, nombre, stock, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.tipoCarne = tipoCarne;
        this.peso = peso;
    }

    //METODOS
    public String mostrar() {
        return "Carne: "+nombre+"\n"+
                "FechaVencimiento: "+fechaVencimiento+"\n"+
                "Peso: "+peso+"\n"+
                "Precio: "+precio*peso;

    }


}
