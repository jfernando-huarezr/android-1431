package com.example.casosdepoo;

public class Trabajador {

    private String nombre;
    private String apellido;
    private double sueldo;
    private double descuento;
    private double bonificacion;
    public void asignarDatos(String nombre, String apellido, double sueldo, double descuento, double bonificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.bonificacion = bonificacion;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double pago(){
        double pag;
        pag = sueldo + bonificacion - descuento;
        return pag;
    }

    public String totalpagar(){
        return "Total a pagar : S/."+pago();
    }


    public String mostrardatos(){
        return "Nombre: "+nombre+"\n"+"Apellidos: "+apellido+"\n"+totalpagar();
    }

}




