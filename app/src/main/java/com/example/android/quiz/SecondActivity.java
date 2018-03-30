package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String score = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        String answerOne = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView scoreTextView = findViewById(R.id.text_message);
        scoreTextView.setText(score);

//        TextView textView = findViewById(R.id.answer_one);
//        textView.setText(answerOne);

    }
}
