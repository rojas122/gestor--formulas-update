package com.aplimovil.formulas.Fisica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class fisica_ecua_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica_ecua_4);
        TextView textView_ecucacion = findViewById(R.id.text_fisica4);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }
    public void fisica_4 (View view){
        finish();
    }
}
