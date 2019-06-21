package com.aplimovil.formulas.algebra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.aplimovil.formulas.R;

public class producto_matrices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_matrices);
        TextView textView_ecucacion= findViewById(R.id.text_produc_matrices);
        textView_ecucacion.setMovementMethod(new ScrollingMovementMethod());
    }
    public void volver_prod_matrices (View view){
        finish();
    }

}
