package com.aplimovil.formulas;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class escanner extends AppCompatActivity {
    Button btn_btn_esca;
    ImageView image;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private ArrayList<String> todoItems;
    private ArrayList<String> aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escanner);
        btn_btn_esca = (Button)findViewById(R.id.btn_escanner);
        image= (ImageView)findViewById(R.id.imageView11);
        //todoItems = (ArrayList<String>) getLastCustomNonConfigurationInstance();
       // if (todoItems == null)
        //    todoItems = new ArrayList<String>();
        //aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);

        //image.setAdapter(aa);

       // image.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v) {
               // todoItems.add(0,
                  //      image.IMA().toString());
                //aa.notifyDataSetChanged();
               // myEditText.setText("");
               // cancelAdd();

    }

    public void escanner(View view) {
        llamarintem();
    }

    public void llamarintem() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image.setImageBitmap(imageBitmap);
        }
    }
    protected void onSaveInstanceState(Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putInt("visualState", image.getVisibility());
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.getInt("visualState") == View.VISIBLE) {
            image.setVisibility(View.VISIBLE);
            image.setVisibility(View.VISIBLE);
        }
    }
}

