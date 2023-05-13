package com.example.pooconandroidstudio;

public class Persona {
    private String nombre; /* private es un modificador de acceso */
    private String apellido;
    private int edad;
    private double nota1;
    private double nota2;

    public void asignarDatos(String nombre, String apellido, int edad, double nota1, double nota2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double promedio(){
        double prom;

        prom = (nota1+nota2)/2;
        return prom;
    }

    public String datos(){
        return "Nombre: "+nombre+"\n"+"Apellidos: "+apellido+"\n"+"Edad: "+edad+"\n"
                +"Promedio: "+promedio();
    }
}
