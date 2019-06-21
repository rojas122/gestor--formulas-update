package com.aplimovil.formulas.Main_y_category;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aplimovil.formulas.FAVORITOS;
import com.aplimovil.formulas.R;
import com.aplimovil.formulas.escanner;

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
            case R.id.btn_codg_qr:
                intent=new Intent(MainActivity.this, escanner.class);
                break;
            /*case R.id.favoritas:
                intent=new Intent(MainActivity.this, FAVORITOS.class);
                break;}*/
            case R.id.btn_favoritas2:
                intent=new Intent(MainActivity.this, FAVORITOS.class);
                break;

        }
        startActivity(intent);
    }
}
