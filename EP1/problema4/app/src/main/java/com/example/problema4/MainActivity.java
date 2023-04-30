package com.example.problema4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText numero1, numero2;
    TextView salida;
    Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=(EditText) findViewById(R.id.edtNumero1);
        numero2=(EditText) findViewById(R.id.edtNumero2);
        mostrar=(Button) findViewById(R.id.btnMostrar);
        salida=(TextView) findViewById(R.id.txvSalida);
        mostrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int n1, n2, mayor, menor;

        n1=Integer.parseInt(numero1.getText().toString());
        n2=Integer.parseInt(numero2.getText().toString());

        if (n1<=n2){
            mayor=n2;
            menor=n1;
        }
        else {
            mayor=n1;
            menor=n2;
        }

        salida.append("Estos son los numeros pares entre "+menor+" y "+mayor+"\n");

        while (menor<=mayor){
            if (0==menor%2) {
                salida.append(menor + "\n");
                menor = menor + 2;
            }
            else{
                menor=menor+1;
            }
        }
    }
}