package com.aplimovil.formulas.Main_y_category;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplimovil.formulas.R;
import com.aplimovil.formulas.aritmetica.Sub_category_Aritmetica;
import com.aplimovil.formulas.Fisica.Sub_category_Fisica;
import com.aplimovil.formulas.Calculo.Sub_category_calculo;
import com.aplimovil.formulas.algebra.subcategoria_algebra_lineal;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        //btn_alge=(Button) findViewById(R.id.bnt_algebra);
        //btn_calc=(Button) findViewById(R.id.bnt_calculo);
        // btn_alge.setOnClickListener(new View.OnClickListener() {
        // @Override
        //  public void onClick(View v) {
        //        Toast.makeText(getApplicationContext(),"estas en la categoria algebra",Toast.LENGTH_LONG).show();
        //      }
        //    });;
    }
    public void onClic (View view){
        Intent mintent=null;
        switch (view.getId() ){
            case R.id.btn_ini:
                mintent=new Intent(category.this, MainActivity.class);

                break;
            case R.id.btn_alge:
                mintent=new Intent(category.this, subcategoria_algebra_lineal.class);
                break;
             case R.id.btn_calculo:
            mintent=new Intent(category.this, Sub_category_calculo.class);
            break;
            case R.id.btn_arimetic:
                mintent=new Intent(category.this, Sub_category_Aritmetica.class);
                break;
            case R.id.btn_fisica:
                mintent=new Intent(category.this, Sub_category_Fisica.class);
                break;

        }
        startActivity(mintent);
    }
}