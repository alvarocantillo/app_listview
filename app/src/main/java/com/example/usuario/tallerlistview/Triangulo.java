package com.example.usuario.tallerlistview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Triangulo extends AppCompatActivity {
    private EditText txtbaset;
    private EditText txtalturat;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        txtalturat=findViewById(R.id.txt_altura_trian);
        txtbaset=findViewById(R.id.txt_base_trian);
        recursos = this.getResources();
    }
    public double calcular_atriangulo(double num,double num2){
        double fin=(num*num2)/2;
        return fin;
    }
    public void guardar_atriangulo(View V){
        if (validar()==true) {
            double res = calcular_atriangulo(Double.parseDouble(txtbaset.getText().toString()), Double.parseDouble(txtalturat.getText().toString()));
            String mos = "" + res;
            String op = "Area del Triangulo", dato = "Base: " + txtbaset.getText().toString() + "Altura: " + txtalturat.getText().toString();
            Operacion o = new Operacion(op, dato, mos);
            o.guardar();
            Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar_triangulo(View V){
        borrar_triangulo();
    }

    public void borrar_triangulo(){
        txtalturat.setText("");
        txtbaset.setText("");
    }

    public boolean validar() {
        if (txtbaset.getText().toString().isEmpty()) {
            txtbaset.requestFocus();
            txtbaset.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (txtalturat.getText().toString().isEmpty()) {
            txtalturat.requestFocus();
            txtalturat.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(txtbaset.getText().toString()) < 1) {
            txtbaset.requestFocus();
            txtbaset.setError(recursos.getString(R.string.error_2));
            return false;
        }
        if (Double.parseDouble(txtalturat.getText().toString()) < 1) {
            txtalturat.requestFocus();
            txtalturat.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
}
