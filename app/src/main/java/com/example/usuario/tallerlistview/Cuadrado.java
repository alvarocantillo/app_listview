package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
private EditText txtladoc;
private Operacion operacion;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        txtladoc=findViewById(R.id.txt_ladoc);
        recursos = this.getResources();
    }
    public static double calcular_acuadrado(double num){
        num=num*num;
        return num;
    }
    public void guardar_acuadrado(View V){
        if (validar()==true) {
            double res = calcular_acuadrado(Double.parseDouble(txtladoc.getText().toString()));
            String mos = "" + res;
            String op = "Area del Cuadrado", dato = "Lado: " + txtladoc.getText().toString();
            Operacion o = new Operacion(op, dato, mos);
            o.guardar();
            Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_cuadrado(View V){
        borrar_cuadrado();
    }

    public void borrar_cuadrado(){
        txtladoc.setText("");
    }

    public boolean validar(){
        if (txtladoc.getText().toString().isEmpty()){
            txtladoc.requestFocus();
            txtladoc.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtladoc.getText().toString())<1){
            txtladoc.requestFocus();
            txtladoc.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }

}
