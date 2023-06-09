package arreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.example.diasdelasemanaarreglos.R;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creacionInstancias("dias");
        //creacionInstancias("meses");
        creacionInstancias("comidas");
    }

    public void creacionInstancias(String tipo){
        switch(tipo){
            case "dias":
                Dias objdias = new Dias();
                toast=Toast.makeText(this, objdias.mostrarDias(), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();
                break;

            case "meses":
                Meses objmeses = new Meses();
                toast=Toast.makeText(this, objmeses.mostrarMeses(), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

            case "comidas":
                Comidas objcomidas = new Comidas();
                toast=Toast.makeText(this, objcomidas.mostrarComidas(), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

        }
    }
}