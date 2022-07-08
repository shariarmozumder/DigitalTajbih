package com.shariar.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivety extends AppCompatActivity {

 TextView viewTv;
 Button bContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        viewTv = findViewById(R.id.viewTv);
        bContact = findViewById(R.id.bContact);

         bContact.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Toast.makeText(SecondActivety.this, "01831506369", Toast.LENGTH_LONG).show();

             }
         });

            }





}