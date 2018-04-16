package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends AppCompatActivity {
    private EditText txtradioe;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        txtradioe=findViewById(R.id.txtx_radio_esfera);
        recursos=this.getResources();
    }
    public double calcular_vesfera(double num){
        num=(4/3)*(3.14)*(num*num*num);
        return num;
    }
    public void guardar_vesfera(View V){
        if (validar()==true) {
            double res = calcular_vesfera(Double.parseDouble(txtradioe.getText().toString()));
            String mos = "" + res;
            String op = "Volumen de la Esfera", dato = "Radio: " + txtradioe.getText().toString();
            Operacion o = new Operacion(op, dato, mos);
            o.guardar();
            Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_vesfera(View V){
        borrar_vesfera();
    }

    public void borrar_vesfera(){
        txtradioe.setText("");
    }
    public boolean validar(){
        if (txtradioe.getText().toString().isEmpty()){
            txtradioe.requestFocus();
            txtradioe.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtradioe.getText().toString())<1){
            txtradioe.requestFocus();
            txtradioe.setError(recursos.getString(R.string.error_2));
            return false;
        }

            return true;
}
}
