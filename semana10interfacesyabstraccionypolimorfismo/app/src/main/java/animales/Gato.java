package animales;

public class Gato extends Animal implements SerViviente {
    private String raza;

    public Gato(String nombre, float peso, float altura, String raza) {
        super(nombre, peso, altura);
        this.raza = raza;
    }

    @Override
    public String Sonido() {
        return "Miau Miau";
    }

    @Override
    public String comer() {
        return "Me llamo "+nombre+" y estoy comiendo.";
    }

    @Override
    public String respirar() {
        return "Me llamo "+nombre+" y estoy respirando.";
    }

    @Override
    public String dormir() {
        return "Me llamo "+nombre+" y estoy durmiendo.";
    }
}
