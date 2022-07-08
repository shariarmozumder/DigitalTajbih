package com.shariar.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


      TextView tvCount;
      Button buttonAdd,buttonSub,buttonReset;
      int count=0;
      ImageView Image;
      Button bGone,bShow;
      TextView tvNextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         tvCount =findViewById(R.id.tvCount);
         buttonAdd =findViewById(R.id.buttonAdd);
         buttonSub =findViewById(R.id.buttonSub);
         buttonReset=findViewById(R.id.buttonReset);
         Image =findViewById(R.id.Image);
         bGone = findViewById(R.id.bGone);
         bShow = findViewById(R.id.bShow);
         tvNextPage = findViewById(R.id.tvNextPage);



         tvNextPage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent myIntent = new Intent(MainActivity.this, SecondActivety.class);
                 startActivity(myIntent);
             }
         });

         buttonAdd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 count++;
                 tvCount.setText(""+count);



             }
         });

         buttonSub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 count--;
                 tvCount.setText(""+count);

             }
         });

         buttonReset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 count =0;
                 tvCount.setText((""+count));

             }
         });

          bShow.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Image.setVisibility(View.VISIBLE);
              }
          });

          bGone.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Image.setVisibility(View.GONE);
              }
          });

    }
}