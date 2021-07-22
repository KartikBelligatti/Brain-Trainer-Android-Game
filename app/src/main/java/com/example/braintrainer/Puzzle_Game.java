package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Puzzle_Game extends AppCompatActivity {

    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle__game);
        button= (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pegion();
            }
        });
        button= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random();
            }
        });
        button= (Button) findViewById(R.id.cricket);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cricket();
            }
        });
        button= (Button) findViewById(R.id.nature);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nature();
            }
        });
        button= (Button) findViewById(R.id.messi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messi();
            }
        });

        button= (Button) findViewById(R.id.mainact3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainAct();
            }
        });
        button= (Button) findViewById(R.id.carBut);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car();
            }
        });


    }
    public void pegion(){
        Intent intent=new Intent(this, puzzle_1.class);
        startActivity(intent);
    }
    public void random(){
        Intent intent=new Intent(this, puzzle_2.class);
        startActivity(intent);
    }
    public void cricket(){
        Intent intent=new Intent(this, puzzle_3.class);
        startActivity(intent);
    }
    public void nature(){
        Intent intent=new Intent(this, puzzle_4.class);
        startActivity(intent);
    }
    public void messi(){
        Intent intent=new Intent(this, puzzle_5.class);
        startActivity(intent);
    }
    public void car(){
        Intent intent=new Intent(this, puzzle_6.class);
        startActivity(intent);
    }
    public void mainAct(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}