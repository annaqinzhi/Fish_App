package com.example.annaqin.fiska;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button onePlayer;
    Button twoPlayer;
    Intent intentOne;
    Intent intentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onePlayer = (Button) findViewById(R.id.onePlayer);
        twoPlayer = (Button) findViewById(R.id.twoPlayer);
        onePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intentOne = new Intent(MainActivity.this, onePersonActivity.class);
                startActivity(intentOne);
            }
        });

        twoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intentTwo = new Intent(MainActivity.this, twoPersonActivity.class);
                startActivity(intentTwo);
            }
        });
    }
}