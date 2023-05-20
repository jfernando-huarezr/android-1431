package encapsulado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pregunta2.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView salida1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida1=(TextView) findViewById(R.id.txvSalida1);

        creacionInstancias("alumno");
    }

    public void creacionInstancias(String tipo) {
        switch (tipo) {
            case "alumno":
                Alumno objalumno = new Alumno("Fernando", "Huarez", 25, 16, 17);
                salida1.setText(objalumno.Informacion());
                break;
        }
    }
}