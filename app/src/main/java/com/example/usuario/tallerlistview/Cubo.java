package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cubo extends AppCompatActivity {
    private EditText txtalturac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        txtalturac=findViewById(R.id.txt_altura_cubo);
    }
    public double calcular_acubo(double num){
        num=num*num*num;
        return num;
    }
    public void guardar_acubo(View V){
        double res= calcular_acubo(Double.parseDouble(txtalturac.getText().toString()));
        String mos=""+res;
        String op="Volumen del Cubo",dato="Altura: "+txtalturac.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),"El resultado es: "+res,Toast.LENGTH_SHORT).show();
    }

    public void limpiar_cubo(View V){
        borrar_cubo();
    }

    public void borrar_cubo(){
        txtalturac.setText("");
    }
}
