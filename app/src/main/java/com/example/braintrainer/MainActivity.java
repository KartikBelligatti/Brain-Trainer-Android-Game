package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.mathgame);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathGame();
            }
        });
        button=findViewById(R.id.game15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game15();
            }
        });
        button=findViewById(R.id.tiktak);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tikTak();
            }
        });
        button=findViewById(R.id.puzzle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puzzle();
            }
        });
        button=findViewById(R.id.memorybtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memory();
            }
        });
        button=findViewById(R.id.aboutus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abouus();
            }
        });
    }
    public void mathGame(){
        Intent intent= new Intent(this,mathgame_1.class);
        startActivity(intent);
    }
    public void game15(){
        Intent intent= new Intent(this,game_15.class);
        startActivity(intent);
    }
    public void tikTak(){
        Intent intent= new Intent(this,ticTakToe.class);
        startActivity(intent);
    }
    public void puzzle(){
        Intent intent= new Intent(this,Puzzle_Game.class);
        startActivity(intent);
    }
    public void memory(){
        Intent intent= new Intent(this,memoryGame.class);
        startActivity(intent);
    }
    public void abouus(){
        Intent intent= new Intent(this,aboutUs.class);
        startActivity(intent);
    }
}