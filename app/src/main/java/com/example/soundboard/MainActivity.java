package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_SoundBoard);
        setContentView(R.layout.activity_main);

        MediaPlayer kraai = MediaPlayer.create(MainActivity.this, R.raw.kraai);
        MediaPlayer lachen = MediaPlayer.create(MainActivity.this, R.raw.lachen);
        MediaPlayer zombie = MediaPlayer.create(MainActivity.this, R.raw.zombie);
        MediaPlayer goed = MediaPlayer.create(MainActivity.this, R.raw.goed);

        ImageButton lachenbtn = (ImageButton) findViewById(R.id.lachen);
        ImageButton goedbtn = (ImageButton) findViewById(R.id.goed);
        ImageButton zombiebtn = (ImageButton) findViewById(R.id.zombie);
        ImageButton kraaiBtn = (ImageButton) findViewById(R.id.kraai);

        kraaiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        lachenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lachen.start();
                Log.i("MyApp", "It's magic");
                Toast.makeText(getApplicationContext(), "Lachen, Gieren en Brullen", Toast.LENGTH_SHORT)
                        .show();



            }
        });

        goedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goed.start();
                Log.i("MyApp", "It's magic");
                Toast.makeText(getApplicationContext(), "Top gedaan, applaus", Toast.LENGTH_SHORT)
                        .show();

            }
        });
        zombiebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zombie.start();
                Log.i("MyApp", "It's magic");
                Toast.makeText(getApplicationContext(), "Grote engerd", Toast.LENGTH_SHORT)
                        .show();

            }
        });
        kraaiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kraai.start();
                Log.i("MyApp", "It's magic");
                Toast.makeText(getApplicationContext(), "Vet grote vogel", Toast.LENGTH_SHORT)
                        .show();
            }
        });



        }
    }

