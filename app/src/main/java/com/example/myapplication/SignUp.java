package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.*;
public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView textView= findViewById(R.id.textView9);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            Intent intent= new Intent(SignUp.this, LoginActivity.class);
            startActivity(intent);

            }
        });
        AppCompatButton appCompatButton = findViewById(R.id.appCompatButton);
        appCompatButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SignUp.this, CreateAccount.class);
                startActivity(intent);
            }
        });

    }
}