package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class sadmediummoodmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadmediummoodmain2);

    }
    public void foresty(View view){
        ImageView forest=findViewById(R.id.imageView7);
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityforesty();
            }
        });
    }
    public void openActivityforesty(){
        Intent intent=new Intent(this,musicplayerforforesty.class);
        startActivity(intent);
    }

    public void firey(View view){
        ImageView forest=findViewById(R.id.imageView8);
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityfirey();
            }
        });
    }
    public void openActivityfirey(){
        Intent intent=new Intent(this,musicplayerforfirey.class);
        startActivity(intent);
    }

    public void wavey(View view){
        ImageView forest=findViewById(R.id.imageView11);
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitywavey();
            }
        });
    }
    public void openActivitywavey(){
        Intent intent=new Intent(this,MusicPlayer.class);
        startActivity(intent);
    }
}
