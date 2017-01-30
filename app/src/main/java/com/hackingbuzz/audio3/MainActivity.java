package com.hackingbuzz.audio3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play, pause;
    MediaPlayer musicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.play);

        pause = (Button) findViewById(R.id.pause);

        musicPlayer = MediaPlayer.create(this, R.raw.enkore);  // so we just created mediaplayer once....for that we put in onCreate method  outside button click..
    }

    public void play(View view) {

        musicPlayer.start();
    }

    public void pause(View view) {

        musicPlayer.pause();
    }
}
