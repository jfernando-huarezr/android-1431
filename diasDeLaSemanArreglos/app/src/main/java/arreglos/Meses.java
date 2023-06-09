package arreglos;

public class Meses {
    private String[] meses;

    public Meses() {
        meses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    }

    public String mostrarMeses() {
        String cadena = "";
        for (int i = 0; i < 12; i++) {
            cadena = cadena+meses[i]+"\n";
        }
        return cadena;
    }

}
