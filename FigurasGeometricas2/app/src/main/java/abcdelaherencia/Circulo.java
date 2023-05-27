package abcdelaherencia;

public class Circulo extends FiguraGeom {
    private int radio;

    public Circulo(int radio) {
        super("Circulo", 0);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public String mostrar() {
        return super.mostrar()+"\n"+
                "Area PI*radio^2: "+calcularArea()+"\n"+
                "Perimetro 2*PI*radio: "+calcularPerimetro();
    }
}
