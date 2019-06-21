package com.aplimovil.formulas.algebra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class sistem_ecuac_por_tres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_ecuac_por_tres);
        TextView textView_ecucacion= findViewById(R.id.text_ecua_x3);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }
    public void volver_sistema_x3 (View view){
        finish();
    }

}
