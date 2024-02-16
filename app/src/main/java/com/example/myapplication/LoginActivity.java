package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView textView = findViewById(R.id.textView8);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(LoginActivity.this, CreateAccount.class);
                startActivity(intent);

            }
        });

        AppCompatButton appCompatButton = findViewById(R.id.appCompatButton3);
        EditText editTextUsername = findViewById(R.id.editTextText2);
        EditText editTextPassword = findViewById(R.id.editTextTextPassword2);
        appCompatButton.setOnClickListener( new View.OnClickListener(){
            public void onClick(View view){
                String password =   editTextPassword.getText().toString().trim();
                String username = editTextUsername.getText().toString().trim();
                boolean valid = true;
                if (username.isEmpty()){
                    editTextUsername.setError("Username cannot be empty.");
                    valid = false;
                }
                else if (username.contains(" ")){
                    editTextUsername.setError("Please enter full names.");
                }
                else if (password.isEmpty()){
                    editTextPassword.setError("Password cannot be empty");
                    valid = false;
                }
                else if (password.length() < 8){
                    editTextPassword.setError("Password cannot be less than 8 characters");
                    valid = false;
                }

                if (valid){
                    Toast.makeText(getApplicationContext(), "Creentials are valid", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(getApplicationContext(), "Invalid password. Please enter a password with at least 8 characters.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
    }
