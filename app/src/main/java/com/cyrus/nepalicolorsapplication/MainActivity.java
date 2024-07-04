package com.cyrus.nepalicolorsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

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

    @Override
    public void onClick(View v) {
        // Find the button by ID and play the correct sound

        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.redBtn){
            PlaySounds(R.raw.red);
        } else if (clickedBtnId == R.id.blackBtn) {
            PlaySounds(R.raw.black);
        } else if (clickedBtnId == R.id.greenBtn) {
            PlaySounds(R.raw.green);
        }else if (clickedBtnId == R.id.blueBtn){
            PlaySounds(R.raw.blue);
        }else if (clickedBtnId == R.id.yellowBtn){
            PlaySounds(R.raw.yellow);
        }

    }

    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }

}