package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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

    public void upbut(View view){
        ImageView fire=findViewById(R.id.imageView6);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitysad();
            }
        });
    }
    public void openActivitysad(){
        Intent intent=new Intent(this,sadmediummoodmain.class);
        startActivity(intent);
    }


}