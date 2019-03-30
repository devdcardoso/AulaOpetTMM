package com.example.opet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editMoeda;
    TextView textConvertido;
    double conversao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMoeda = findViewById(R.id.editMoeda);
        textConvertido = findViewById(R.id.textConvertido);
        conversao = 3.99;
    }

    public void paraReal(View view) {
        String texto = "R$ %.2f";
        double entrada = Double.parseDouble(editMoeda.getText().toString());
        double valor_convertido = entrada * conversao;
        textConvertido.setText(String.format(texto, valor_convertido));
    }

    public void paraDolar(View view) {
        String texto = "$ %.2f";
        double entrada = Double.parseDouble(editMoeda.getText().toString());
        double valor_convertido = entrada / conversao;
        textConvertido.setText(String.format(texto, valor_convertido));
    }
}
