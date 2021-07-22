package com.example.braintrainer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class mathgame_1 extends AppCompatActivity {
    RelativeLayout gameRelativeLayout;
    Button startButton;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button playAgainButton;
    ImageView logo;
    ImageView goodScore;
    ImageView badScore;
    TextView title;
    TextView pointsTextView;
    TextView resultTextView;
    TextView sumTextView;
    TextView timerTextView;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    int locationOfCorrectAnswer;
    int score;
    int numberOfQuestions = 0;


    public void playAgain(View view) {

        score = 0;

        numberOfQuestions = 0;
        timerTextView.setText("30s");
        pointsTextView.setText("0/0");
        resultTextView.setText("");
        playAgainButton.setVisibility(View.INVISIBLE);
        generateQuestion();

        new CountDownTimer(31000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerTextView.setText(String.valueOf(millisUntilFinished / 1000) + " s");
            }

            @Override
            public void onFinish() {
                playAgainButton.setVisibility(View.VISIBLE);
                timerTextView.setText("0s");
                if (score >= numberOfQuestions / 2) {
                    resultTextView.setText("You scored: " + Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));

                    goodScore.setVisibility(View.VISIBLE);

                } else {
                    resultTextView.setText("You scored: " + Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
                    badScore.setVisibility(View.VISIBLE);
                }
            }
        }.start();
    }

    public void generateQuestion() {

        Random randomNumber = new Random();

        int a = randomNumber.nextInt(21);
        int b = randomNumber.nextInt(21);

        sumTextView.setText(Integer.toString(a) + "+" + Integer.toString(b));
        locationOfCorrectAnswer = randomNumber.nextInt(4);
        answers.clear();
        int incorrectAnswer;
        for (int i = 0; i < 4; i++) {
            if (i == locationOfCorrectAnswer) {
                answers.add(a + b);

            } else {
                incorrectAnswer = randomNumber.nextInt(41);
                while (incorrectAnswer == a + b) {
                    incorrectAnswer = randomNumber.nextInt(41);
                }
                answers.add(incorrectAnswer);
            }
        }

        button0.setText(Integer.toString(answers.get(0)));
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));

    }


    public void chooseAnswer(View view) {
//        Log.i("Tagged", (String) view.getTag());

        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {
//            Log.i("Tagged", "catch ya...");
            score++;
            resultTextView.setText("Correct");
        } else {
            resultTextView.setText("Wrong");
        }

        numberOfQuestions++;
        pointsTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
        generateQuestion();
    }

    public void start(View view) {
        startButton.setVisibility(View.INVISIBLE);
        logo.setVisibility(View.INVISIBLE);
        title.setVisibility(View.INVISIBLE);
        gameRelativeLayout.setVisibility(RelativeLayout.VISIBLE);

        playAgain(findViewById(R.id.playAgainButton));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathgame_1);
        startButton = (Button) findViewById(R.id.startButton);
        logo = (ImageView) findViewById(R.id.logo);
        goodScore = (ImageView) findViewById(R.id.goodScore);
        badScore = (ImageView) findViewById(R.id.badScore);
        title = (TextView) findViewById(R.id.title);
        sumTextView = (TextView) findViewById(R.id.sumTextView);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        playAgainButton = (Button) findViewById(R.id.playAgainButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        pointsTextView = (TextView) findViewById(R.id.pointsTextView);
        timerTextView = (TextView) findViewById(R.id.timerTextView);
        gameRelativeLayout = (RelativeLayout) findViewById(R.id.gameRelativeLayout);
        Button button;
        button=findViewById(R.id.mainMenu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainAct();
            }
        });


    }

    public void mainAct(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
