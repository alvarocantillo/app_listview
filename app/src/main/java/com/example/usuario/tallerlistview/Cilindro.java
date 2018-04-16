package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cilindro extends AppCompatActivity {
    private EditText txtradiocl;
    private EditText txtalturacl;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        txtalturacl = findViewById(R.id.txt_radio_cilin);
        txtradiocl = findViewById(R.id.txt_altura_cilin);
        recursos = this.getResources();

    }

    public static double calcular_vcilindro(double num, double num2) {
        double fin = (3.14) * (num * num) * num2;
        return fin;
    }

    public void guardar_vcilindro(View V) {
        if (validar()==true){
        double res = calcular_vcilindro(Double.parseDouble(txtradiocl.getText().toString()), Double.parseDouble(txtalturacl.getText().toString()));
        String mos = "" + res;
        String op = recursos.getString(R.string.volumen_cl), dato = recursos.getString(R.string.radio_cilindro)+":" + txtradiocl.getText().toString() +"\n"+ recursos.getString(R.string.altrura_cilindro) +":"+ txtalturacl.getText().toString();
        Operacion o = new Operacion(op, dato, mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),  recursos.getString(R.string.elresul)+ res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_vcilindro(View V) {
        borrar_vcilindro();
    }

    public void borrar_vcilindro() {
        txtradiocl.setText("");
        txtalturacl.setText("");
    }

    public boolean validar() {
        if (txtradiocl.getText().toString().isEmpty()) {
            txtradiocl.requestFocus();
            txtradiocl.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (txtalturacl.getText().toString().isEmpty()) {
            txtalturacl.requestFocus();
            txtalturacl.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtradiocl.getText().toString()) < 1) {
            txtradiocl.requestFocus();
            txtradiocl.setError(recursos.getString(R.string.error_2));
            return false;
        }
        if (Double.parseDouble(txtalturacl.getText().toString()) < 1) {
            txtalturacl.requestFocus();
            txtalturacl.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
}