package encapsulado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.promediodenotasencapsulado.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        creacionInstancias("persona");
        creacionInstancias("perro");
    }

    public void creacionInstancias(String tipo) {
        switch (tipo) {
            case "persona":
                Persona objpersona = new Persona("Fernando", "Huarez", 31, 16, 17);
                Toast.makeText(this, objpersona.mostrar(), Toast.LENGTH_LONG).show();
                break;
            case "perro":
                Perro objperro = new Perro("blanco",3,"maltes");
                Toast.makeText(this, objperro.info(), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}