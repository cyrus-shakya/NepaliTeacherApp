package com.cyrus.nepaliteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button blackBtn, yellowBtn, redBtn, blueBtn, greenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        blueBtn = findViewById(R.id.blueBtn);
        greenBtn = findViewById(R.id.greenBtn);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        blueBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
    }
}