package com.example.cardviewsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        Button cardButton = (Button) findViewById(R.id.card_view_button);
        View.OnClickListener cardListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };
        cardButton.setOnClickListener(cardListener);

        Button practiceButton = (Button) findViewById(R.id.practice_view_button);
        View.OnClickListener practiceListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopActivity.this, PracticeActivity.class);
                startActivity(intent);
            }
        };
        practiceButton.setOnClickListener(practiceListener);
    }
}