package com.example.categoriaysueldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText categoria;
    TextView salida;
    Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoria=(EditText) findViewById(R.id.edtCategoria);
        mostrar=(Button) findViewById(R.id.btnMostrar);
        salida=(TextView) findViewById(R.id.txvSalida);
        mostrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String ctg;
        ctg=categoria.getText().toString();

        if (ctg.equals("A")|ctg.equals("a")) {
            salida.setText("Su sueldo es de S/.5000");
        }
        else if (ctg.equals("B")|ctg.equals("b")) {
            salida.setText("Su sueldo es de S/.3000");
        }
        else if (ctg.equals("C")|ctg.equals("c")) {
            salida.setText("Su sueldo es de S/.2000");
        }
        else {
            salida.setText("Coloque un dato valido");
        }
    }
}