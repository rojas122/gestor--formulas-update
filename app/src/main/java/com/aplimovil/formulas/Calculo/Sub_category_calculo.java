package com.aplimovil.formulas.Calculo;

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
import com.aplimovil.formulas.aritmetica.Sub_category_Aritmetica;

public class Sub_category_calculo extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lista_ecua_calculo;
    String[] valor_calculo =new String[]{"Ecuacion 1 de calculo","Ecuacion 2 de calculo","Ecuacion 3 de calculo", "Ecuacion 4 de calculo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category_calculo);
        lista_ecua_calculo = (ListView) findViewById(R.id.list_tipo_ecua_calculo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valor_calculo);
        lista_ecua_calculo.setOnItemClickListener(this);
        lista_ecua_calculo.setAdapter(adapter);


    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item1 = "Ecuacion 1 de calculo";
        String item2 = "Ecuacion 2 de calculo";
        String item3 = "Ecuacion 3 de calculo";
        String item4 = "Ecuacion 4 de calculo";


        String items = (String) adapterView.getItemAtPosition(i);
        if (items == item1) {
            Intent item = new Intent(Sub_category_calculo.this, calculo_equation_1.class);
            item.putExtra("item1", items);
            startActivity(item);
        }
        if (items == item2) {
            Intent item = new Intent(Sub_category_calculo.this, calculo_equation_2.class);
            item.putExtra("item2", items);
            startActivity(item);
        }
        if (items == item3) {
            Intent item = new Intent(Sub_category_calculo.this, calculo_equation_3.class);
            item.putExtra("item3", items);
            startActivity(item);
        }
        if (items == item4) {
            Intent item = new Intent(Sub_category_calculo.this, calculo_equation_4.class);
            item.putExtra("item4", items);
            startActivity(item);
        }

    }

    public void clic_calculo (View view){
        Intent mintent_calculo=null;
        switch (view.getId() ){
            case R.id.btn_volver_calculo:
                mintent_calculo=new Intent(Sub_category_calculo.this,category.class);

                break;
            case R.id.btn_alge:
                //mintent=new Intent(category.this, subcategoria_algebra_lineal.class);
                break;
            case R.id.btn_calculo:
               // mintent=new Intent(category.this,Sub_category_calculo.class);
                break;
        }
        startActivity(mintent_calculo);

    }
}
