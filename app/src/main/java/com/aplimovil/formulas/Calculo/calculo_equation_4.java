package com.aplimovil.formulas.Calculo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class calculo_equation_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_equation_4);
       TextView textView_ecucacion = findViewById(R.id.text_calculo);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }
    public void calculo_4 (View view){
        finish();
    }
}
