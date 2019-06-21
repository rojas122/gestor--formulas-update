package com.aplimovil.formulas.algebra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class view_algebra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_algebra);
        TextView textView_ecucacion= findViewById(R.id.text_resultado);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }

    public void volver_alge (View view){
        finish();
    }
}
