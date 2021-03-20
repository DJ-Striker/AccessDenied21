package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ifhappy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifhappy);
    }
    public void downbut(View view){
        ImageView fire=findViewById(R.id.imageView5);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymain();
            }
        });
    }
    public void openActivitymain(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void upbut(View v) {
        // Here, we are generating a random number
        Random generator = new Random();
        int number = generator.nextInt(3) + 1;


        Class activity = null;

        // Here, we are checking to see what the output of the random was
        switch(number) {
            case 1:
                // E.g., if the output is 1, the activity we will open is ActivityOne.class
                activity = musicplayerforforesty.class;
                break;
            case 2:
                activity = MusicPlayer.class;
                break;

            case 3:
                activity = musicplayerforfirey.class;
                break;
        }
        // We use intents to start activities
        Intent intent = new Intent(getBaseContext(), activity);
        startActivity(intent);
    }
    public void openActivitysad(){
        Intent intent=new Intent(this,sadmediummoodmain.class);
        startActivity(intent);
    }


}