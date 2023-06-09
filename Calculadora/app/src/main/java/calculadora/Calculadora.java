package calculadora;

public class Calculadora {
    private double numero1, numero2, resultado;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void clear() {
        this.numero1=0;
        this.numero2=0;
    }

    public String suma(){
        resultado= numero1+numero2;
        return resultado+"";
    }

    public String resta(){
        resultado= numero1-numero2;
        return resultado+"";
    }

    public String multiplicacion(){
        resultado= numero1*numero2;
        return resultado+"";
    }

    public String division(){
        if (numero2!=0){
            resultado= numero1/numero2;
            return resultado+"";
        }
        else {
            return "ERROR";
        }
    }

    public String potencia(){
        resultado= Math.pow(numero1,numero2);
        return resultado+"";
    }

    public String resto(){
        resultado= numero1%numero2;
        return resultado+"";
    }

}

