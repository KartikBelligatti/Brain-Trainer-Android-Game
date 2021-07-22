package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tikTak_3 extends AppCompatActivity {
    Button playagainBtn, backHomeBtn;
    private TicTacToeBoard ticTacToeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tik_tak_3);
        playagainBtn=(Button)findViewById(R.id.playAgain);
        backHomeBtn=(Button)findViewById(R.id.homebtn);

        playagainBtn.setVisibility(View.GONE);
        backHomeBtn.setVisibility(View.GONE);

        TextView playerTurn=findViewById(R.id.playerDisplay);

        String[] playerNames=getIntent().getStringArrayExtra("PLAYER NAMES");

        if(playerNames != null){
            playerTurn.setText((playerNames[0]+"'s Turn"));
        }

        ticTacToeBoard=findViewById(R.id.ticTacToeBoard);
        ticTacToeBoard.setUpGame(playagainBtn,backHomeBtn,playerTurn,playerNames);
        playagainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ticTacToeBoard.resetGame();
                ticTacToeBoard.invalidate();
            }
        });

        backHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(tikTak_3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}