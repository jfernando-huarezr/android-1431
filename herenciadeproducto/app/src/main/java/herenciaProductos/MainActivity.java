package herenciaProductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.herenciadeproducto.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carne objcarne=new Carne(1010,"Lomo",100,30,new Date(),"Res",5);
        Libros objlibro=new Libros(2020,"Un Grito Desesperado",100,40,"Cuauthemoc","ISIL");
        String precios=objcarne.getPrecio()+" "+objlibro.getPrecio();

        Toast.makeText(this, objcarne.mostrar(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, objlibro.mostrar(), Toast.LENGTH_LONG).show();
    }
}