package animales;

public class Persona implements SerViviente {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    @Override
    public String comer() {
        return "Yo soy "+nombre+" "+apellido+" y estoy comiendo.";
    }
    @Override
    public String respirar() {
        return "Yo soy "+nombre+" "+apellido+" y estoy respirando.";
    }
    @Override
    public String dormir() {
        return "Yo soy "+nombre+" "+apellido+" y estoy durmiendo.";
    }
}
