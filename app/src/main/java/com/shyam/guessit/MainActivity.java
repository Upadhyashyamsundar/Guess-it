package com.shyam.guessit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static com.shyam.guessit.R.id.numbertext;

public class MainActivity extends AppCompatActivity {

     int random;

     public void clickFunction(View view){


         EditText numbertext=(EditText)findViewById(R.id.numbertext);
         int num=Integer.parseInt(numbertext.getText().toString());
         if(num>random){
             Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
         }
         else if(num<random){
             Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
         }
         else {
             Toast.makeText(this, "Thats Right!! Try Again..", Toast.LENGTH_SHORT).show();
             Random rand=new Random();
             random=rand.nextInt(20)+1;
         }


     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        random=rand.nextInt(20)+1;
    }
}
