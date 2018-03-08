package com.example.gustavolobato.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public void btnCalcularOnClick(View v){
        //ao clicar agora ele pede o nome do usuario
        //não consegui fazer essa funcionalidade pois meu android studio está cheio de broncas
        //por isso apenas o comentário aqui para ilustrar como se tivesse a função para tal
        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 19){
            //abaixo
            lblResultado.setText("Abaixo do peso!");
        }
        else if(resultado > 32){
            //obeso
            lblResultado.setText("Acima do peso!");
        }
        else{
            //ok
            lblResultado.setText("Peso ok!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}