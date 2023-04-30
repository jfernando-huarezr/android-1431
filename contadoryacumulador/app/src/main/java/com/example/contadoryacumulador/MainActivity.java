package com.example.contadoryacumulador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nota1, nota2;
    Button calcular;
    TextView salida;
    ImageView expresion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = (EditText) findViewById(R.id.edtNota1);
        nota2 = (EditText) findViewById(R.id.edtNota2);
        salida = (TextView) findViewById(R.id.txvsalida);
        calcular = (Button) findViewById(R.id.btnCalcular);
        expresion = (ImageView) findViewById(R.id.imvExpresion);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int n1, n2;
        double promedio;
        n1 = Integer.parseInt(nota1.getText().toString());
        n2 = Integer.parseInt(nota2.getText().toString());
        promedio = (n1 + n2) / 2;

        if (promedio > 0 && promedio <= 12) {
            salida.setText("Estoy Triste");
            expresion.setImageResource(R.drawable.sad);
        } else if (promedio >= 13 && promedio <= 16) {
            salida.setText("Estoy medio Feliz");
            expresion.setImageResource(R.drawable.happy);
        } else if (promedio >= 17 && promedio <= 20) {
            salida.setText("Estoy Feliz");
            expresion.setImageResource(R.drawable.veryhappy);
        } else {
            salida.setText("No se te ha calificado");
        }

    }

}