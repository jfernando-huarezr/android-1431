package calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadora.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView salida1;
    Button buttons[] = new Button[7];

    EditText numero1, numero2;

    double num1, num2;
    String output="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //salida
        salida1 = (TextView) findViewById(R.id.txvSalida);

        //entradas de los dos numeros
        numero1 = (EditText) findViewById(R.id.edtNumero1);
        numero2 = (EditText) findViewById(R.id.edtNumero2);

        //botones de operaciones
        buttons[0] = (Button) findViewById(R.id.btnSuma);
        buttons[1] = (Button) findViewById(R.id.btnResta);
        buttons[2] = (Button) findViewById(R.id.btnMulti);
        buttons[3] = (Button) findViewById(R.id.btnDiv);
        buttons[4] = (Button) findViewById(R.id.btnPow);
        buttons[5] = (Button) findViewById(R.id.btnResto);

        //boton de all clear
        buttons[6] = (Button) findViewById(R.id.btnAC);

        //Pantalla inicial con 0 de salida
        salida1.setText(output);

        //creamos una nuevo objeto calculadora

        for (int i = 0; i < 7; i++) {
            buttons[i].setOnClickListener(this);
        }

        if (numero1.getText().toString().equals("")) {
            numero1.setText("0");
        }

        if (numero2.getText().toString().equals("")) {
            numero2.setText("0");
        }
    }

    @Override
    public void onClick(View v) {

        //si entrada son empty strings las inicializamos en 0

        if (numero1.getText().toString().equals("")) {
            numero1.setText("0");
        }

        if (numero2.getText().toString().equals("")) {
            numero2.setText("0");
        }

        //obtenemos valores de las entradas

        num1 = Double.parseDouble(numero1.getText().toString());
        num2 = Double.parseDouble(numero2.getText().toString());

        //se crea objeto calculadora
        Calculadora objcalculadora = new Calculadora(num1, num2);

        //se verifica que operacion se quiere hacer

        //suma
        if (v.getId()==R.id.btnSuma) {
            output = objcalculadora.suma();
            salida1.setText(output);
        }
        //resta
        else if (v.getId()==R.id.btnResta) {
            output = objcalculadora.resta();
            salida1.setText(output);
        }
        //multiplicacion
        else if (v.getId()==R.id.btnMulti) {
            output = objcalculadora.multiplicacion();
            salida1.setText(output);
        }
        //division
        else if (v.getId()==R.id.btnDiv) {
            output = objcalculadora.division();
            salida1.setText(output);
        }
        //potencia
        else if (v.getId()==R.id.btnPow) {
            output = objcalculadora.potencia();
            salida1.setText(output);
        }
        //resto
        else if (v.getId()==R.id.btnResto) {
            output = objcalculadora.resto();
            salida1.setText(output);
        }
        //all clear, pone todas las entradas y salidas en 0
        else if (v.getId()==R.id.btnAC) {
            numero1.setText("0");
            numero2.setText("0");
            salida1.setText("0");

        }
    }
}