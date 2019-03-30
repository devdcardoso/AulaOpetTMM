package com.example.higherorlower;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editNumero;
    TextView textMensagem;
    int numero_magico;
    int tentativas;
    TextView textTentativas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumero = findViewById(R.id.editNumero);
        textMensagem = findViewById(R.id.textMensagem);
        Random rnd = new Random();
        numero_magico = rnd.nextInt(100) + 1;
        textTentativas = findViewById(R.id.textTentativas);
        tentativas = 0;
    }

    public void adivinharNumero(View view) {
        int numero_usuario = Integer.parseInt(editNumero.getText().toString());
        tentativas = tentativas + 1;
        if(numero_usuario > numero_magico){
            textMensagem.setText("CHUTOU ALTO!");
            textMensagem.setTextColor(Color.RED);
        } else if(numero_usuario < numero_magico){
            textMensagem.setText("CHUTOU BAIXO!");
            textMensagem.setTextColor(Color.BLUE);
        }else{
            textMensagem.setText("ACERTOU!");
            textMensagem.setTextColor(Color.GREEN);
        }

        textTentativas.setText(String.valueOf(tentativas));

    }
}
