package com.aplimovil.formulas.algebra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class suma_complejos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_complejos);
        TextView textView_ecucacion= findViewById(R.id.text_suma_complejos);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }
    public void volver_sum_complejos (View view){
        finish();
    }
}
