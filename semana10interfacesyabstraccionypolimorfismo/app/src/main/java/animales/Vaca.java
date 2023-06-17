package animales;

public class Vaca extends Animal{
    private String color;

    public Vaca(String nombre, float peso, float altura, String color) {
        super(nombre, peso, altura);
        this.color = color;
    }

    @Override
    public String Sonido() {
        return "Muuu Muuu";
    }
}
