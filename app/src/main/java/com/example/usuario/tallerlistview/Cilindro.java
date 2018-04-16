package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cilindro extends AppCompatActivity {
    private EditText txtradiocl;
    private EditText txtalturacl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        txtalturacl=findViewById(R.id.txt_radio_cilin);
        txtradiocl=findViewById(R.id.txt_altura_cilin);
    }
    public double calcular_vcilindro(double num, double num2){
        double fin=(3.14)*(num*num)*num2;
        return fin;
    }
    public void guardar_vcilindro(View V){
        double res= calcular_vcilindro(Double.parseDouble(txtradiocl.getText().toString()),Double.parseDouble(txtalturacl.getText().toString()));
        String mos=""+res;
        String op="Volumen del Cilindro",dato="Radio: "+txtradiocl.getText().toString()+"Altura: "+txtalturacl.getText().toString();
        Operacion o= new Operacion(op,dato,mos);
        o.guardar();
        Toast.makeText(getApplicationContext(),"El resultado es: "+res,Toast.LENGTH_SHORT).show();
    }

    public void limpiar_vcilindro(View V){
        borrar_vcilindro();
    }

    public void borrar_vcilindro(){
        txtradiocl.setText("");
        txtalturacl.setText("");
    }
}
