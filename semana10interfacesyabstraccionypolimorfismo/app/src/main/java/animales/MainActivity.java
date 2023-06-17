package animales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.semana10interfacesyabstraccionypolimorfismo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Persona objpersona = new Persona("Fernando", "Huarez", "masculino", 31);
        Gato objgato = new Gato("Sultan", 4.1f, 0.5f, "Criollo");
        Perro objperro = new Perro("Jake", 4.5f, 0.6f, "Cocker Spaniel", "Mediano");
        Vaca objvaca = new Vaca("Molly", 200.00f, 2.5f, "Blanco y negro");

        Animal objanimal1 = objperro;
        Animal objanimal2 = objgato;
        Animal objanimal3 = objvaca;

        Animal animal4 = new Gato("Agatha", 5.0f, 0.4f, "Tabby");

        SerViviente ser1 = objpersona;
        SerViviente ser2 = objgato;

        MostrarMensaje(objanimal1.Sonido());
        MostrarMensaje(objanimal2.Sonido());
        MostrarMensaje(objanimal3.Sonido());
    }

    public void MostrarMensaje(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
