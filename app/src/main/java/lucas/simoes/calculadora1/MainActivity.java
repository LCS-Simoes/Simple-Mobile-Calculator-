package lucas.simoes.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button soma = (Button) findViewById(R.id.soma);
        Button multiplicar = (Button) findViewById(R.id.multiplicar);
        Button dividir = (Button) findViewById(R.id.dividir);
        Button menos = (Button) findViewById(R.id.menos);
        Button limpar = (Button) findViewById(R.id.limpar);
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        EditText result = (EditText) findViewById(R.id.result);

        //Capturar resultado
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double finish = num1 + num2;
                //devolvendo o calculo
                result.setText(String.valueOf(finish));
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double finish = num1*num2;
                result.setText(String.valueOf(finish));
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                if (num2 == 0) {
                    result.setText("0.0");
                } else {
                    double finish = num1 / num2;
                    result.setText(String.valueOf(finish));
                }
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double finish = num1-num2;
                result.setText(String.valueOf(finish));
            }
        });
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                number1.setText("");
                number2.setText("");
            }
        });
    }
}