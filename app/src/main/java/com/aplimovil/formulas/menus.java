package com.aplimovil.formulas;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aplimovil.formulas.Main_y_category.IntentIntegrator;
import com.aplimovil.formulas.Main_y_category.IntentResult;

public class menus extends AppCompatActivity {
    private Button btnScanner;
    private TextView tvBardcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rr);
        tvBardcode= findViewById(R.id.tvBarCode);
        btnScanner= findViewById(R.id.btnScanner);
        btnScanner.setOnClickListener(mOnClickListener);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result= IntentIntegrator.parseActivityResult(requestCode, resultCode,data);
        if (result !=null)
            if (result.getContents() != null){
                tvBardcode.setText("El código de barras es:\n" + result.getContents());
            }else{
                tvBardcode.setText("Error al escanear el código de barras");
            }


    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnScanner:
                    new IntentIntegrator(menus.this).initiateScan();
                    break;
            }
        }
    };
}
