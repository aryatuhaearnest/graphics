package com.example.graphics;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class applee extends AppCompatActivity {
ImageView imageView;
Button button,btn;
ObjectAnimator objectAnimator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
btn=findViewById(R.id.button5);
        imageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);
         objectAnimator=objectAnimator.ofFloat(imageView,"rotation",100);// x means move left to right

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objectAnimator.setDuration(4000);         //4000 means 4 seconds
                objectAnimator.start();
               // objectAnimator.setStartDelay(3000); //delay time
            }
        });

    }
    public void next(View view){
        Intent myintent =new Intent(applee.this,cats.class);
        startActivity(myintent);
    }
}
