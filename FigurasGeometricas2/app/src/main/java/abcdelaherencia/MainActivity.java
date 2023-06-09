package abcdelaherencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.figurasgeometricas2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rectangulo objrectangulo=new Rectangulo(5,10);
        Circulo objcirculo=new Circulo(6);
        Triangulo objtriangulo=new Triangulo(5,7,3,4);

        Toast.makeText(MainActivity.this,objrectangulo.mostrar(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,objcirculo.mostrar(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,objtriangulo.mostrar(), Toast.LENGTH_LONG).show();
    }
}