package encapsulado;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double nota1;
    private double nota2;

    public Persona(String nombre, String apellido, int edad, double nota1, double nota2) {
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
        double prom=(nota1+nota2)/2;
        return prom;
    }

    public String mostrar(){
        return "Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Edad: "+edad+"Promedio: "+promedio();
    }
}
