package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CIrculo extends AppCompatActivity {
private EditText txtradio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        txtradio = findViewById(R.id.txt_radio_circulo);
    }
    public double calcular_acirculo(double num){
        num=(num*num)*(3.14);
        return num;
    }
    public void guardar_acuadrado(View V){
        double res= calcular_acirculo(Double.parseDouble(txtradio.getText().toString()));
        String mos=""+res;
        String op="Area del Circulo",dato="Radio: "+txtradio.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),"El resultado es: "+res,Toast.LENGTH_SHORT).show();
    }

    public void limpiar_circulo(View V){
        borrar_circulo();
    }

    public void borrar_circulo(){
        txtradio.setText("");
    }
    }

