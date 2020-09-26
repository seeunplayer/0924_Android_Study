package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.right_click);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You got the correct answer!\nI was born on 29th May of 2000!\n Congratulations!", Toast.LENGTH_SHORT).show();
            }
        });
        Button button2 = findViewById(R.id.wrong_click1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sorry, you got the wrong answer.\n 6th of May is my favorite singer,\nBaekhyun's birthday!\n Try again!", Toast.LENGTH_SHORT).show();
            }
        });
        Button button3 = findViewById(R.id.wrong_click2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sorry, you got the wrong answer.\n 4th of December is my favorite singer,\nJin's birthday!\n Try again!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}