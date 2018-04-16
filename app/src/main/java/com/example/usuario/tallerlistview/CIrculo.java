package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CIrculo extends AppCompatActivity {
private EditText txtradio;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        txtradio = findViewById(R.id.txt_radio_circulo);
        recursos = this.getResources();
    }
    public static double calcular_acirculo(double num){
        num=(num*num)*(3.14);
        return num;
    }
    public void guardar_acuadrado(View V){
        if (validar()==true){
        double res= calcular_acirculo(Double.parseDouble(txtradio.getText().toString()));
        String mos=""+res;
        String op=recursos.getString(R.string.area_cir),dato=recursos.getString(R.string.radio)+":"+txtradio.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(), recursos.getString(R.string.elresul) + res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_circulo(View V){
        borrar_circulo();
    }

    public void borrar_circulo(){
        txtradio.setText("");
    }
    public boolean validar(){
        if (txtradio.getText().toString().isEmpty()){
            txtradio.requestFocus();
            txtradio.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtradio.getText().toString())<1){
            txtradio.requestFocus();
            txtradio.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
    }

