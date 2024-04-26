package com.example.calculodemedias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1,n2,n3,n4,numeroFaltas;
    private Button btCalcular;
    private TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.Nota1);
        n2 = findViewById(R.id.Nota2);
        n3 = findViewById(R.id.Nota3);
        n4 = findViewById(R.id.Nota4);
        numeroFaltas = findViewById(R.id.numerofalta);
        btCalcular = findViewById(R.id.calcular);
        txtResultado = findViewById(R.id.txt_resultado);


        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int nota1 = Integer.parseInt(n1.getText().toString());
                int nota2 = Integer.parseInt(n2.getText().toString());
                int nota3 = Integer.parseInt(n3.getText().toString());
                int nota4 = Integer.parseInt(n4.getText().toString());
                int numero_faltas = Integer.parseInt(numeroFaltas.getText().toString());
                int media = (nota1 + nota2 + nota3 + nota4) /4;

                if (media >=5 && numero_faltas <= 20){
                    txtResultado.setText("Aluno Foi Aprovado \n " + "Média final: " + media);
                    txtResultado.setTextColor(getColor(R.color.green));
                } else if (numero_faltas > 20){
                    txtResultado.setText(("Aluno foi Reprovado por faltas \n " + "Media Final: " + media));
                    txtResultado.setTextColor(getColor(R.color.red));

                } else if (media < 5){

                    txtResultado.setText(("Aluno foi Reprovado por nota \n" + " Media final: " + media));
                    txtResultado.setTextColor(getColor(R.color.red));


                }


            }
        }





    }

}