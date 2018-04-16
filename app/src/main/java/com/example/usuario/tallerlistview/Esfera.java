package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends AppCompatActivity {
    private EditText txtradioe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        txtradioe=findViewById(R.id.txtx_radio_esfera);
    }
    public double calcular_vesfera(double num){
        num=(4/3)*(3.14)*(num*num*num);
        return num;
    }
    public void guardar_vesfera(View V){
        double res= calcular_vesfera(Double.parseDouble(txtradioe.getText().toString()));
        String mos=""+res;
        String op="Volumen de la Esfera",dato="Radio: "+txtradioe.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),"El resultado es: "+res,Toast.LENGTH_SHORT).show();
    }

    public void limpiar_vesfera(View V){
        borrar_vesfera();
    }

    public void borrar_vesfera(){
        txtradioe.setText("");
    }
}
