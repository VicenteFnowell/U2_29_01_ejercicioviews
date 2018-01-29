package com.example.u2_29_01_ejercicioviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Crear las variables de las vistas que vamos a identificar.
    TextView tvPrincipal, tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Identificamos las vistas
        tvPrincipal = (TextView)findViewById(R.id.tvprincipal);
        tvResultado = (TextView)findViewById(R.id.tvresultado);



    }//Fin OnCreate

    public void clickicono1 (View view){
        tvPrincipal.setText("Has clicado el icono 1");
    }

    public void clickicono2 (View view){
        tvPrincipal.setText("Has clicado el icono 2");
    }

    public void clickicono3 (View view){
        tvPrincipal.setText("Has clicado el icono 3");
    }

    public void clickIconoFinal (View view) {
        String valorseleccionado = tvPrincipal.getText().toString();
        tvResultado.setText(valorseleccionado);
    }


}//Fin MainActivity
