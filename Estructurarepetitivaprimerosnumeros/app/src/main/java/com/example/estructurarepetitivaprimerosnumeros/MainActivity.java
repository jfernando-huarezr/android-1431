package com.example.estructurarepetitivaprimerosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mostrar;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrar=(Button) findViewById(R.id.btnMostrar);
        salida=(TextView) findViewById(R.id.txvSalida);
        mostrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        for(int i=1; i<=5;i=i+1){
            salida.append(i+"\n");
        }
    }
}