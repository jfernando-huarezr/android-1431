package com.example.casosdepoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView salida1, salida2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida1=(TextView) findViewById(R.id.txvSalida1);
        salida2=(TextView) findViewById(R.id.txvSalida2);

        Trabajador objtrabajador=new Trabajador();
        objtrabajador.asignarDatos("Jose","Huarez",4000,200,1000);

        salida1.setText(objtrabajador.totalpagar());
        salida2.setText(objtrabajador.mostrardatos());
    }
}

