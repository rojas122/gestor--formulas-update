package com.aplimovil.formulas.aritmetica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aplimovil.formulas.Main_y_category.MainActivity;
import com.aplimovil.formulas.Main_y_category.category;
import com.aplimovil.formulas.R;
import com.aplimovil.formulas.Fisica.Sub_category_Fisica;
import com.aplimovil.formulas.Calculo.Sub_category_calculo;

public class Sub_category_Aritmetica extends AppCompatActivity implements ListView.OnItemClickListener{
ListView lista_ecua_aritmetica;
    String[] valor_aritmerica =new String[]{"Ecuacion1","Ecuacion2","Ecuacion3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category__aritmetica);
        lista_ecua_aritmetica = (ListView) findViewById(R.id.list_tipo_ecua_aritmetica);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valor_aritmerica);
        lista_ecua_aritmetica.setOnItemClickListener(this);
        lista_ecua_aritmetica.setAdapter(adapter);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item1 ="Ecuacion1";
        String item2 = "Ecuacion2";
        String item3 = "Ecuacion3";

        String items = (String) adapterView.getItemAtPosition(i);
        if (items == item1) {
            Intent item = new Intent(Sub_category_Aritmetica.this, aritmetica_equation_1.class);
            item.putExtra("item1", items);
            startActivity(item);
        }
        if (items == item2) {
            Intent item = new Intent(Sub_category_Aritmetica.this, aritmetica_eqaution_2.class);
            item.putExtra("item2", items);
            startActivity(item);
        }
        if (items == item3) {
            Intent item = new Intent(Sub_category_Aritmetica.this, aritmetica__equation_3.class);
            item.putExtra("item3", items);
            startActivity(item);
        }

    }

    public  void clic_aritmetica (View view){

            Intent mintent_aritmetica=null;
            switch (view.getId() ){
                case R.id.btn_atras:
                    mintent_aritmetica=new Intent(Sub_category_Aritmetica.this,category.class);

                    break;
                case R.id.btn_arimetic:
                  //  mintent_aritmetica=new Intent(Sub_category_Aritmetica.this, subcategoria_al.class);
                    break;
                case R.id.btn_calculo:
                    // mintent=new Intent(category.this,Sub_category_calculo.class);
                    break;
            }
            startActivity(mintent_aritmetica);

        }
    }
