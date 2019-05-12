package com.example.graphics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    Button clk;
    VideoView videoV;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Button button=findViewById(R.id.button7);

        clk = findViewById(R.id.button2);
        videoV = findViewById(R.id.videoView);



 }


    public void videoplay(View v) {


        videoV.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.power);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoV);
        videoV.setMediaController(mediaController);
        videoV.start();


    }
    public void dox(View view){
        Intent myintent =new Intent(video.this,circle.class);
        startActivity(myintent);
    }
}