package com.example.appsumaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView num1;
    private TextView num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);
    }

    public void Sumar(View v){
        int res;
        res = Integer.parseInt(this.num1.getText().toString()) + Integer.parseInt(this.num2.getText().toString());
        this.resultado.setText("El resultado es: " + res);
    }

    public void Restar(View v){
        int res;
        res = Integer.parseInt(this.num1.getText().toString()) - Integer.parseInt(this.num2.getText().toString());
        this.resultado.setText("El resultado es: " + res);
    }
    public void Multiplicar(View v){
        int res;
        res = Integer.parseInt(this.num1.getText().toString()) * Integer.parseInt(this.num2.getText().toString());
        this.resultado.setText("El resultado es: " + res);
    }
    public void Dividir(View v){
        float res;
        if ((Integer.parseInt(this.num1.getText().toString())> 0) && (Integer.parseInt(this.num2.getText().toString())> 0) ){
            res = Float.parseFloat(this.num1.getText().toString()) / Float.parseFloat(this.num2.getText().toString());
            this.resultado.setText("El resultado es: " + res);
        } else {
            this.resultado.setText("No se puede realizar la división");
        }

    }
}
