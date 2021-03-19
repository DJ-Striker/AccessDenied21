package com.example.hackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {
    public EditText emailIDreset;
    public Button reset;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        emailIDreset = findViewById(R.id.editTextTextEmailAddress2);
        reset = findViewById(R.id.button2);
        mFirebaseAuth = FirebaseAuth.getInstance();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailIDreset.getText().toString();
                if(email.isEmpty()){
                    emailIDreset.setError("Email is required!");
                    emailIDreset.requestFocus();
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    emailIDreset.setError("Please enter a valid email!");
                    emailIDreset.requestFocus();
                }
                mFirebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(ForgotPassword.this, "Check your email to reset your password!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(ForgotPassword.this, "Error Occured. Try Again!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
}