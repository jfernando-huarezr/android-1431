package encapsulado;

public class Alumno {
    private String nombre, apellido;
    private double prom_pc, nota_parcial, nota_final, promedio_final;

    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(String nombre, String apellido, double prom_pc, double nota_parcial, double nota_final){
        this.nombre = nombre;
        this.apellido=apellido;
        this.prom_pc=prom_pc;
        this.nota_final=nota_final;
        this.nota_parcial=nota_parcial;
    }

    private void CalcularPromedioFinal(){

        if (prom_pc>=0 && prom_pc <=20){
            if(nota_parcial>=0 && nota_parcial<=20) {
                if(nota_final>=0 && nota_final<=20){
                    promedio_final=(prom_pc+nota_parcial+nota_final)/3.0;
                }
            }
        }

        else {
            promedio_final=0;
        }
    }

    //Si alguna nota promedio parcial esta fuera del rango el promedio final sera 0
    public String Informacion(){
        CalcularPromedioFinal();
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Promedio final: "+promedio_final;
    }
}
