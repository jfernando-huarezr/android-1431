package com.example.colecciondeedades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edad, posicion;
    TextView mostrar;
    Button ingresar, buscar, modificar, eliminar, insertar;
    ArrayList<Integer> empleado=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edad=(EditText) findViewById(R.id.edtEdad);
        posicion=(EditText) findViewById(R.id.edtPosicion);
        mostrar=(TextView) findViewById(R.id.txvSalida);
        ingresar=(Button) findViewById(R.id.btnIngresar);
        buscar=(Button) findViewById(R.id.btnBuscar);
        modificar=(Button) findViewById(R.id.btnModificar);
        eliminar=(Button) findViewById(R.id.btnEliminar);
        insertar=(Button) findViewById(R.id.btnInsertar);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ed=Integer.parseInt(edad.getText().toString());
                mostrar.setText("");
                empleado.add(ed);
                edad.getText().clear();
                for(int i=0;i<empleado.size();i++){
                    int posicion=i+1;
                    mostrar.append(posicion+". "+empleado.get(i)+"\n");
                }

            }
        });


    }
}