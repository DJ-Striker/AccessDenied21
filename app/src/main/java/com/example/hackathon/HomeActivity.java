package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout;
    FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intToMain);

            }
        });

    }
    public void happy(View view){
        ImageView hap=findViewById(R.id.imageView3);
        hap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        Intent intent=new Intent(this,ifhappy.class);
        startActivity(intent);
    }

    public void medium(View view){
        ImageView hap=findViewById(R.id.imageView2);
        hap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitysadmedium();
            }
        });
    }

    public void sad(View view){
        ImageView hap=findViewById(R.id.imageView4);
        hap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitysadmedium();
            }
        });
    }

    public void openActivitysadmedium(){
        Intent intent=new Intent(this,sadmediummoodmain.class);
        startActivity(intent);
    }

    
}
