package com.aplimovil.formulas.aritmetica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class aritmetica_eqaution_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmetica_eqaution_2);
        TextView textView_ecucacion = findViewById(R.id.text_aritmetica);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }

    public void aritmetica_2(View view) {
        finish();
    }
}