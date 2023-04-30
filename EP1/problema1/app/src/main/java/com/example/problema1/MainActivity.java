package com.example.problema1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText categoria, cantidad;
    TextView salida;
    Button calcular;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoria= (EditText)findViewById(R.id.edtCategoria);
        cantidad= (EditText) findViewById((R.id.edtCantidad));
        calcular= (Button) findViewById(R.id.btnCalcular);
        salida= (TextView) findViewById((R.id.txvSalida));
        imagen= (ImageView) findViewById(R.id.imvImagen);
        calcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int cant;
        double precio;
        String ctg;

        ctg = categoria.getText().toString();
        cant = Integer.parseInt((cantidad.getText().toString()));

        if (ctg.equals("A")|ctg.equals("a")) {
            precio=4.5*cant;
            salida.setText("El monto total a pagar es de "+precio);
            imagen.setImageResource(R.drawable.a);
        }
        else if (ctg.equals("B")|ctg.equals("b")) {
            precio=5*cant;
            salida.setText("El monto total a pagar es de "+precio);
            imagen.setImageResource(R.drawable.b);
        }
        else if (ctg.equals("C")|ctg.equals("c")) {
            precio=7.5*cant;
            salida.setText("El monto total a pagar es de "+precio);
            imagen.setImageResource(R.drawable.c);
        }
        else if (ctg.equals("D")|ctg.equals("d")) {
            precio=13.5*cant;
            salida.setText("El monto total a pagar es de "+precio);
            imagen.setImageResource(R.drawable.d);
        }
        else {
            salida.setText("Coloque valores validos");
        }


    }
}