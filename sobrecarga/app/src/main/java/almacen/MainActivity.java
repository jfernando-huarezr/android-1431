package almacen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sobrecargademetodos.R;

public class MainActivity extends AppCompatActivity {
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double dsctoAbril;
        dsctoAbril=Articulo.obtenerDsctoMes(4);

        Articulo objarticulo= new Articulo("A001","Gaseosa",100,0.10);

        TextView salida=findViewById(R.id.txvSalida);

        salida.setText(objarticulo.mostrarPrecio(4,true));
    }
}