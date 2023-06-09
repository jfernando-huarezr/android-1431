package arreglos;

public class Comidas {
    private String [] diascomidas;

    public Comidas() {
        diascomidas=new String[]{
                "Lunes = Se come Lentejas",
                "Martes = Se come Frejoles",
                "Miercoles = Se come Ají de Gallina",
                "Jueves = Se come Arroz con pollo",
                "Viernes = Se come Pollito a la brasa",
                "Sabado = Se come Pachamanca",
                "Domingo = Se come Carapulcra",
        };
    }

    public String mostrarComidas(){
        String cadena="";
        for(int i=0;i<diascomidas.length;i++) {
            cadena=cadena+diascomidas[i]+"\n";
        }

        return cadena;
    }
}
