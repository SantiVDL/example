package com.uca.a00082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class juego extends AppCompatActivity {

    ImageButton imb00, imb01, imb02, imb03, imb04, imb05, imb06, imb07, imb08, imb09, imb10, imb11, imb12, imb13, imb14, imb15;
    ImageButton[] tablero = new ImageButton[16];
    TextView textoPuntuacion;
    int puntuacion;
    int aciertos;

    int[]imagenes;
    int fondo;

    ArrayList<Integer> arrayDesordenado;
    ImageButton primero;
    int numeroPrimero, numeroSegundo;
    boolean bloqueo=false;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
    }
}