package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numberOfCorrectAnswers = 0; //The number of times the user selected the right answer

    //UDI message declaration for the second intent
    public static final String EXTRA_MESSAGE = "com.example.android.quiz.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This is the method for the button click. When the user click the button a second activity
    //gets opened showing the number or correct choices
    public void score(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        String score = Integer.toString(viewScore(numberOfCorrectAnswers));
        intent.putExtra(EXTRA_MESSAGE, score);

        startActivity(intent);
    }

    /*
    This method check if the radio button containing the correct answer of each radiogroup
    is checked. If yes, it adds one to the score to be presented in the second intent when the user
    clicks the button
     */
    public int viewScore(int score) {

        RadioButton radio2 = findViewById(R.id.quiz_qOne_ansTwo);

        RadioButton radio7 = findViewById(R.id.quiz_qTwo_ansThree);

        RadioButton radio12 = findViewById(R.id.quiz_qThree_ansFour);

        RadioButton radio14 = findViewById(R.id.quiz_qFour_ansTwo);

        RadioButton radio18 = findViewById(R.id.quiz_qFive_ansTwo);

        if (radio2.isChecked()) {
            score += 1;
        }
        if (radio7.isChecked()) {
            score += 1;
        }
        if (radio12.isChecked()) {
            score += 1;
        }
        if (radio14.isChecked()) {
            score += 1;
        }
        if (radio18.isChecked()) {
            score += 1;
        }

        return score;
    }
}
