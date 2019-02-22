package com.example.proyectoapp311cr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnIncidencias = (Button) findViewById(R.id.btnIncidencias);
        btnIncidencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),IncidentActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button btnActualizacion = (Button) findViewById(R.id.btnActualizacion);
        btnActualizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),UpdateIncidentActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button btnGraficos = (Button) findViewById(R.id.btnGraficos);
        btnGraficos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GraphicsActivity.class);
                startActivityForResult(intent,0);
            }
        });

    }
}
