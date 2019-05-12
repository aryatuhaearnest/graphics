package com.example.graphics;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cats extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        Button btn=findViewById(R.id.button2
        );
Button bt=findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView imageView=findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.runningcat);
                 AnimationDrawable runningcat= (AnimationDrawable) imageView.getDrawable();//defining object of anmation drawable
                runningcat.start();

            }
        });

    }
    public void cont(View view){
        Intent myintent =new Intent(cats.this,video.class);
        startActivity(myintent);
    }
}
