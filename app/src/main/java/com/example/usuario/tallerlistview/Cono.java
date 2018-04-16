package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends AppCompatActivity {
    private EditText txtradiocono;
    private EditText txtalturacono;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        txtalturacono=findViewById(R.id.txt_altura_cono);
        txtradiocono=findViewById(R.id.txt_radio_cono);
        recursos = this.getResources();
    }
    public static double calcular_vcono(double num, double num2){
        double fin=(3.14)*(num*num)*num2;
        return fin;
    }
    public void guardar_vcono(View V){
        if (validar()==true){
        double res= calcular_vcono(Double.parseDouble(txtradiocono.getText().toString()),Double.parseDouble(txtalturacono.getText().toString()));
        String mos=""+res;
        String op = recursos.getString(R.string.volumen_cono), dato = recursos.getString(R.string.radio_cono)+":" + txtradiocono.getText().toString() + "\n"+recursos.getString(R.string.altura) +":" + txtalturacono.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
            Toast.makeText(getApplicationContext(), recursos.getString(R.string.elresul) + res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_vcono(View V){
        borrar_vcono();
    }

    public void borrar_vcono(){
        txtradiocono.setText("");
        txtalturacono.setText("");
    }

    public boolean validar() {
        if (txtradiocono.getText().toString().isEmpty()) {
            txtradiocono.requestFocus();
            txtradiocono.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (txtalturacono.getText().toString().isEmpty()) {
            txtalturacono.requestFocus();
            txtalturacono.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtradiocono.getText().toString()) < 1) {
            txtradiocono.requestFocus();
            txtradiocono.setError(recursos.getString(R.string.error_2));
            return false;
        }
        if (Double.parseDouble(txtalturacono.getText().toString()) < 1) {
            txtalturacono.requestFocus();
            txtalturacono.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
}
