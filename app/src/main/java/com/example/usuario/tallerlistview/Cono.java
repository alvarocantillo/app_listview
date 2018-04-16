package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends AppCompatActivity {
    private EditText txtradiocono;
    private EditText txtalturacono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        txtalturacono=findViewById(R.id.txt_altura_cono);
        txtradiocono=findViewById(R.id.txt_radio_cono);
    }
    public double calcular_vcono(double num, double num2){
        double fin=(3.14)*(num*num)*num2;
        return fin;
    }
    public void guardar_vcono(View V){
        double res= calcular_vcono(Double.parseDouble(txtradiocono.getText().toString()),Double.parseDouble(txtalturacono.getText().toString()));
        String mos=""+res;
        String op="Volumen del Cono",dato="Radio: "+txtradiocono.getText().toString()+"Altura: "+txtalturacono.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),"El resultado es: "+res,Toast.LENGTH_SHORT).show();
    }

    public void limpiar_vcono(View V){
        borrar_vcono();
    }

    public void borrar_vcono(){
        txtradiocono.setText("");
        txtalturacono.setText("");
    }
}
