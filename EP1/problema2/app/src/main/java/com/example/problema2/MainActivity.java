package com.example.problema2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText tipo,dias;
    TextView salida;
    Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipo=(EditText) findViewById(R.id.edtTipo);
        dias=(EditText) findViewById(R.id.edtDias);
        calcular=(Button) findViewById(R.id.btnCalcular);
        salida=(TextView) findViewById(R.id.txvSalida);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int enfermedad, tiempo, precio;
        enfermedad=Integer.parseInt(tipo.getText().toString());
        tiempo=Integer.parseInt(dias.getText().toString());

        switch(enfermedad){
            case(11):
                precio = tiempo*200;
                salida.setText("El costo total para el paciente es de "+precio);
                break;
            case(12):
                precio = tiempo*350;
                salida.setText("El costo total para el paciente es de "+precio);
                break;
            case(13):
                precio = tiempo*420;
                salida.setText("El costo total para el paciente es de "+precio);
                break;
            default:
                salida.setText("Por favor ingresar valores validos");
                break;
        }
    }
}