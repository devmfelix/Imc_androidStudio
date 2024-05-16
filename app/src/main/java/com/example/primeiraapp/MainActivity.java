package com.example.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textResultado = findViewById(R.id.textResultado);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
    }

    public void calcularIMC(View view){
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if(resultado < 19){
            textResultado.setText("Abaixo do Peso \ne IMC de " + resultado);
        }else if(resultado <=19 || resultado < 25){
            textResultado.setText("Peso normal  \ne IMC de " + resultado);
        }else if(resultado <=25 || resultado <30){
            textResultado.setText("Sobre peso \ne IMC de " + resultado);
        }else if(resultado <=30 || resultado < 40){
            textResultado.setText("Obesidade de tipo 1\ne IMC de " + resultado);
        }else if(resultado >= 40){
            textResultado.setText("Obesidade tipo 2 \ne IMC de " + resultado);
        }
    }
}