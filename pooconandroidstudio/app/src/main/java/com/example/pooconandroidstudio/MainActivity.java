package com.example.pooconandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona objpersona=new Persona();
        objpersona.asignarDatos("Jose Fernando","Huarez Reyes",31,15,17);
        Toast.makeText(this, objpersona.datos(), Toast.LENGTH_LONG).show();


    }
}