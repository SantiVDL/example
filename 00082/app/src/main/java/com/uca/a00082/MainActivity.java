package com.uca.a00082;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.buttonMainJugar);
        salir = findViewById(R.id.botonMainSalir);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              System.out.println("Iniciando juego...") ;
              inicarjuego();

            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void inicarjuego()
    {
        Intent i  = new Intent (this,juego.class);
        startActivity(i);

    }
}