package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ticTak_2 extends AppCompatActivity {
    private EditText player1,player2;

    Button namesubmitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tak_2);

        namesubmitbtn=(Button)findViewById(R.id.submitbtn);
        player1=findViewById(R.id.player1name);
        player2=findViewById(R.id.player2name);

        namesubmitbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(player1.length()==0 ){
                    player1.requestFocus();
                    player1.setError("Field Cannot Be Empty");
                }
                else if(player2.length()==0){
                    player2.requestFocus();
                    player2.setError("Field Cannot Be Empty");
                }

                else {
                    String player1Name = player1.getText().toString();
                    String player2Name = player2.getText().toString();
                    Intent intent = new Intent(ticTak_2.this, tikTak_3.class);
                        intent.putExtra("PLAYER NAMES", new String[]{player1Name, player2Name});
                        startActivity(intent);

                }
            }
        });
    }

}