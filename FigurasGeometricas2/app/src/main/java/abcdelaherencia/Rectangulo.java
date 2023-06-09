package abcdelaherencia;

public class Rectangulo extends FiguraGeom {
    double largo;
    double ancho;


    //aca lo que se hace es borrar nombre y numlados. en super borra nombre y numlados tambien, por
    //que se instancia

    public Rectangulo(double largo, double ancho) {
        super("Rectangulo",4);
        this.largo = largo;
        this.ancho = ancho;
    }

    //sobreescribir un metodo de la clase padre
    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(largo+ancho);
    }

    @Override
    public String mostrar() {
        return super.mostrar()+"\n"+
                "Area (Largo*Ancho): "+calcularArea()+"\n"+
                "Perimetro (Largo+Ancho)*2: "+calcularPerimetro();
    }
}