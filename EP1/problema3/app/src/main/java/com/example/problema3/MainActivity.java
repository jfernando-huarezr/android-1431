package com.example.problema3;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tipopago, tipolibro, cantidadlibro;
    TextView salida;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipopago=(EditText) findViewById(R.id.edtTipoPago);
        tipolibro=(EditText) findViewById(R.id.edtTipoLibro);
        cantidadlibro=(EditText) findViewById(R.id.edtCantidad);
        calcular=(Button) findViewById(R.id.btnCalcular);
        salida=(TextView) findViewById(R.id.txvSalida);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int pago, cantidad;
        double precio;
        String ctg;

        pago = Integer.parseInt(tipopago.getText().toString());
        cantidad = Integer.parseInt(cantidadlibro.getText().toString());
        ctg = tipolibro.getText().toString();

        if (ctg.equals("A")|ctg.equals("a")) {
            precio = cantidad * 40;
            salida.setText("El monto total a pagar es de " + precio);
        } else if (ctg.equals("B")|ctg.equals("b")) {
            switch (pago) {
                case (1):
                    precio = cantidad * 30;
                    salida.setText("El monto total a pagar es de " + precio);
                    break;
                case (2):
                    precio = cantidad * 30 * 1.185;
                    salida.setText("El monto total a pagar es de " + precio);
                    break;
                default:
                    salida.setText("Ingrese valores validos");
                    break;
            }

        } else if (ctg.equals("C")|ctg.equals("c")) {
            switch (pago) {
                case (1):
                    precio = cantidad * 25 * 0.6;
                    salida.setText("El monto total a pagar es de " + precio);
                    break;
                case (2):
                    precio = cantidad * 25;
                    salida.setText("El monto total a pagar es de " + precio);
                    break;
                default:
                    salida.setText("Ingrese valores validos");
                    break;
            }
        } else {
            salida.setText("Ingrese valores validos");
        }
    }

}