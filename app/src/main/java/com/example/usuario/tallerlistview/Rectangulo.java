package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {
    private EditText txtbase;
    private EditText txtaltura;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        txtaltura=findViewById(R.id.txt_altura_rectangulo);
        txtbase=findViewById(R.id.txt_base_rectangulo);
        recursos = this.getResources();
    }
    public static double calcular_arectangulo(double num,double num2){
        double fin=num*num2;
        return fin;
    }
    public void guardar_arectangulo(View V){
        if (validar()==true) {
            double res = calcular_arectangulo(Double.parseDouble(txtbase.getText().toString()), Double.parseDouble(txtaltura.getText().toString()));
            String mos = "" + res;
            String op = "Area del Rectangulo", dato = "Base: " + txtbase.getText().toString() + "Altura: " + txtaltura.getText().toString();
            Operacion o = new Operacion(op, dato, mos);
            o.guardar();
            Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_rectangulo(View V){
        borrar_rectangulo();
    }

    public void borrar_rectangulo(){
        txtaltura.setText("");
        txtbase.setText("");
    }

    public boolean validar() {
        if (txtbase.getText().toString().isEmpty()) {
            txtbase.requestFocus();
            txtbase.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (txtaltura.getText().toString().isEmpty()) {
            txtaltura.requestFocus();
            txtaltura.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtbase.getText().toString()) < 1) {
            txtbase.requestFocus();
            txtbase.setError(recursos.getString(R.string.error_2));
            return false;
        }
        if (Double.parseDouble(txtaltura.getText().toString()) < 1) {
            txtaltura.requestFocus();
            txtaltura.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
}
