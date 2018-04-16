package com.example.usuario.tallerlistview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {
    private TableLayout tabla1;
    private ArrayList<Operacion> operaciones;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        tabla1=findViewById(R.id.tabla1);
        operaciones=Datos.obtener();

        for (int i=0;i< operaciones.size();i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            int j=1+i;
            c1.setText(""+j);
            c2.setText(operaciones.get(i).getNombre());
            c3.setText(operaciones.get(i).getDatos());
            c4.setText(operaciones.get(i).getResultado());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla1.addView(fila);
        }
    }
}
