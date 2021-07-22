package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class introductoryActivity extends AppCompatActivity {

    ImageView logo,splashImg;
    LottieAnimationView lottieAnimationView;
    private final int SPLASH_DISPLAY_LENGTH = 7000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo= findViewById(R.id.logo);
        splashImg= findViewById(R.id.img);
        lottieAnimationView=findViewById(R.id.lottie);

        splashImg.animate().translationY(-2000).setDuration(2000).setStartDelay(5000);
        logo.animate().translationY(1800).setDuration(2000).setStartDelay(5000);
        lottieAnimationView.animate().translationY(1800).setDuration(2000).setStartDelay(5000);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(introductoryActivity.this,MainActivity.class);
                introductoryActivity.this.startActivity(mainIntent);
                introductoryActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}