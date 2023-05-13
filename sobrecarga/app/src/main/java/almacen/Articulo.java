package almacen;

public class Articulo {
    public String codigo;
    public String nombre;
    public double precioBase;
    public double dsctoAdmin;
    public static double igv=0.18;
    public static double dscto1=0.10;
    public static double dscto2=0.15;
    public static double dscto3=0.18;

    public Articulo(String codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Articulo(String codigo, String nombre, double precioBase, double dsctoAdmin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.dsctoAdmin = dsctoAdmin;
    }

    public static double obtenerDsctoMes(int nMes){
        if(nMes>=1 && nMes<=6)
            return dscto1;
        else if (nMes>=7 && nMes<=11)
            return dscto2;
        else if (nMes==12)
            return dscto3;
        else
            return 0;
    }

    public String mostrarPrecio(int mes, boolean inclIGV){
        double precioDsctoMes, precioDsctoAdmin, precioInclIGV;

        precioDsctoAdmin=precioBase*(1-dsctoAdmin);
        precioDsctoMes=precioDsctoAdmin*(1-obtenerDsctoMes(mes));
        precioInclIGV=precioDsctoMes*(1+igv);

        if (inclIGV){
            return "Subtotal S/."+precioDsctoMes+" \n"+
                    "IGV 18% S/."+igv*precioDsctoMes+"\n"+
                    "Total S/."+precioInclIGV;
        }
        else
            return "S/."+precioDsctoMes;
    }
}
