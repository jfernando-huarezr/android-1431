package encapsulado;

public class Perro {
    private String color;
    private int edad;
    private String raza;

    public Perro() {
        this.color="canela";
        this.edad=0;
        this.raza=null;

    }

    public Perro(String color, int edad, String raza) {
        this.color = color;
        this.edad = edad;
        this.raza = raza;
    }

    public String info() {
        return "Perro: " + '\n'+
                "Color: " + color + '\n' +
                "Edad: " + edad + '\n'+
                "Raza: " + raza;
    }
}
