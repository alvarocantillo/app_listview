package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
private EditText txtladoc;
private Operacion operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        txtladoc=findViewById(R.id.txt_ladoc);
    }
    public double calcular_acuadrado(double num){
        num=num*num;
        return num;
    }
    public void guardar_acuadrado(View V){
        double res= calcular_acuadrado(Double.parseDouble(txtladoc.getText().toString()));
        String mos=""+res;
        String op="Area del Cuadrado",dato="Lado: "+txtladoc.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),"El resultado es: "+res,Toast.LENGTH_SHORT).show();
    }

    public void limpiar_cuadrado(View V){
        borrar_cuadrado();
    }

    public void borrar_cuadrado(){
        txtladoc.setText("");
    }

}
