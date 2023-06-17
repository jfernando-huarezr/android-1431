package animales;

public class Perro extends Animal{
    private String raza;
    private String tamaño;

    public Perro(String nombre, float peso, float altura, String raza, String tamaño) {
        super(nombre, peso, altura);
        this.raza = raza;
        this.tamaño = tamaño;
    }

    @Override
    public String Sonido() {
        return "Guau Guau";
    }
}
