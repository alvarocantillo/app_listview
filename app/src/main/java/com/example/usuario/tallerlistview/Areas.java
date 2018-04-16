package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lv2;
    private String [] opc2;
    private Intent in2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lv2=findViewById(R.id.listaopciones2);
        opc2=getResources().getStringArray(R.array.opciones2);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc2);
        lv2.setAdapter(adapter);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        in2 = new Intent(Areas.this, Cuadrado.class);
                        startActivity(in2);
                        break;
                    case 1:
                        in2 = new Intent(Areas.this, Rectangulo.class);
                        startActivity(in2);
                        break;
                    case 2:
                        in2 = new Intent(Areas.this, Triangulo.class);
                        startActivity(in2);
                        break;
                    case 3:
                        in2 = new Intent(Areas.this, CIrculo.class);
                        startActivity(in2);
                        break;
                }
            }
        });
    }
}
