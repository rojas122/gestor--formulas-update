package com.aplimovil.formulas.Main_y_category;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.aplimovil.formulas.FAVORITOS;
import com.aplimovil.formulas.escannerr;
import com.aplimovil.formulas.menus;
import com.aplimovil.formulas.R;

public class MainActivity extends AppCompatActivity {
    Button btn_ecua, btn_salir;

    private ListView myListView;
    private boolean addingNew = false;
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





    public void onClick  (View view){

        Intent intent=null;
        switch (view.getId()){
            case R.id.btn_ecua:
                intent=new Intent(MainActivity.this, category.class);
                break;
          case R.id.btn_QR:

               intent=new Intent(MainActivity.this, escannerr.class);
              break;
            /*case R.id.favoritas:
                intent=new Intent(MainActivity.this, FAVORITOS.class);
                break;}*/
            case R.id.btn_favoritas:
                intent=new Intent(MainActivity.this, FAVORITOS.class);
                break;


        }
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        //Get the position from the list
        int index = myListView.getSelectedItemPosition();
        switch (item.getItemId()) {


            case (R.id.addQR): {
                addQR();
                return true;
            }
        }
        return false;
    }
    private void addQR() {
        addingNew = true;
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.initiateScan();

    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (resultCode == RESULT_OK) {
            IntentResult scanResult = IntentIntegrator.parseActivityResult(
                    requestCode, resultCode, intent);
            if (scanResult != null) {
                // Handle successful scan
                String contents = scanResult.getContents();
                //saveTask(new ToDoItem(contents));
            }
        } else if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, R.string.scan_canceled, Toast.LENGTH_SHORT)
                    .show();
        }

    }





}
