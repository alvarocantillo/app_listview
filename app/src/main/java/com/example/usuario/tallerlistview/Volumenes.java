package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Volumenes extends AppCompatActivity {
    private ListView lv3;
    private String [] opc3;
    private Intent in3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);
        lv3=findViewById(R.id.listaopciones3);
        opc3=getResources().getStringArray(R.array.opciones3);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc3);
        lv3.setAdapter(adapter);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        in3 = new Intent(Volumenes.this, Esfera.class);
                        startActivity(in3);
                        break;
                    case 1:
                        in3 = new Intent(Volumenes.this, Cilindro.class);
                        startActivity(in3);
                        break;
                    case 2:
                        in3 = new Intent(Volumenes.this, Cono.class);
                        startActivity(in3);
                        break;
                    case 3:
                        in3 = new Intent(Volumenes.this, Cubo.class);
                        startActivity(in3);
                        break;
                }
            }
        });
    }
}
