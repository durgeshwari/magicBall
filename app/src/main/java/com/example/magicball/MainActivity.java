package com.example.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.ask);
        final ImageView image = (ImageView) findViewById(R.id.valueImage);
        final int[] magicArray={R.drawable.ball1,
        R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
 askButton.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Log.d("magic","ball rolled");
         Random randomNumber=new Random();
         int number=randomNumber.nextInt(5);
         Log.d("magic","magic number displayed:"+number);
         image.setImageResource(magicArray[number]);
     }
 });



    }
}