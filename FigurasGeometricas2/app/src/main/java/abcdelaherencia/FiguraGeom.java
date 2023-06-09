package abcdelaherencia;

public class FiguraGeom {
    protected String nombre;
    protected int numlados;

    public FiguraGeom(String nombre, int numlados) {
        this.nombre = nombre;
        this.numlados = numlados;
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }

    public String mostrar(){
        return "Figura: "+nombre+"\n"+
                "Lados: "+numlados;
    }
}
