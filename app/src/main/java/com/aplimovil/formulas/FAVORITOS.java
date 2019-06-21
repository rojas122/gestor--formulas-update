package com.aplimovil.formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FAVORITOS extends AppCompatActivity implements ListView.OnItemClickListener {
    String[] valor =new String[]{"sistemas de escuaciones lineales","Suma de Matrices","Suma de Complejos", "Producto de Matrices","Sistema de Ecuaciones por tres"};
    ListView lista_ecua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        lista_ecua = (ListView) findViewById(R.id.list_favoritos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valor);
        lista_ecua.setOnItemClickListener(this);
        lista_ecua.setAdapter(adapter);
    }

    public void clic_favoritas (View view){
        finish();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String sistemas = "sistemas de escuaciones lineales";
        String item2 = "Suma de Matrices";
        String item3 = "Suma de Complejos";
        String item4 = "Producto de Matrices";
        String item5 = "Sistema de Ecuaciones por tres";
    }
}