package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // OnCreate se ejecuta cuando se crea la Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Asignamos el Layout a la Activity
        setContentView(R.layout.activity_main);

        // Mensaje en Logcat
        Log.i("Ejemplo", "Estoy en onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ejemplo", "Estoy en onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ejemplo", "Estoy en onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ejemplo", "Estoy en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ejemplo", "Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ejemplo", "Estoy en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ejemplo", "Estoy en onDestroy");
    }
}