package arreglos;

public class Dias {
    char [] dias;

    public Dias() {
        dias = new char[] {'L','M','M','J','V','S','D'};
    }

    public String mostrarDias(){
        String cadena="";
        for(int i=0;i<dias.length;i++){
            cadena=cadena+dias[i]+"\n";
        }

        return cadena;
    }
}
