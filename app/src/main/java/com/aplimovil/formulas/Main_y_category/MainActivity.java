package com.aplimovil.formulas.Main_y_category;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aplimovil.formulas.R;

public class MainActivity extends AppCompatActivity {
    Button btn_ecua, btn_salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // btn_ecua= (Button) findViewById(R.id.btn_ecua);
       // btn_salir= (Button) findViewById(R.id.btn_salir);
         //btn_ecua.setOnClickListener(new View.OnClickListener() { //INTERFACE
          //public void onClick(View v) { //CLASE ANINIMA
            //Toast.makeText(getApplicationContext(),"SELECCIONÓ ESCUACIONES", Toast.LENGTH_LONG).show();
        //}
        //});
    }

    public void onClick (View view){

        Intent intent=null;
        switch (view.getId()){
            case R.id.btn_ecua:
                intent=new Intent(MainActivity.this, category.class);
                break;
            //case R.id.btn_salir:
                //finish();
                //finish();
                // System.exit(0);
              //  intent=new Intent(Intent.ACTION_MAIN);
                //intent.addCategory(Intent.CATEGORY_HOME); //CERRAR APP
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                //break;

        }
        startActivity(intent);
    }
}
