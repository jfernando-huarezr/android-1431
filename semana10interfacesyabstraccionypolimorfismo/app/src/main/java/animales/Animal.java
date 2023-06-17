package animales;

public abstract class Animal {
    protected String nombre;
    protected float peso;
    protected float altura;

    public Animal(String nombre, float peso, float altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract String Sonido();

}
