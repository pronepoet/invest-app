package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.*;

import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(CreateAccount.this, SignUp.class);
                startActivity(intent);

            }
        });

        //checks whether you have an account and redirects to the sign in page
        TextView textView = findViewById(R.id.textView6);
        textView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent (CreateAccount.this, SignUp.class);
                startActivity(intent);
            }
        });


        AppCompatButton appCompatButton = findViewById(R.id.appCompatButton2);
        appCompatButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){


//accessing the input fields
                EditText editTextName = findViewById(R.id.editTextText);
                EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);
                EditText editTextPassword =findViewById(R.id.editTextTextPassword);

//        input validation
                boolean valid = true;
                String email = editTextEmail.getText().toString().trim();
                String username = editTextName.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                if (username.isEmpty()) {
                    editTextName.setError("Name cannot be emptY!");
                    valid = false;
                }
                else if (!username.contains(" ")){
                    editTextName.setError("Please enter full names");
                    valid = false;
                }
                else if (email.isEmpty()) {
                    editTextEmail.setError("Email is required");
                    valid = false;
                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editTextEmail.setError("Invalid email format");
                    valid = false;
                }
                else if (password.isEmpty()) {
                    editTextPassword.setError("Password cannot be empty");
                    valid = false;
                } else if (password.length() < 8) {
                    editTextPassword.setError("Password must be at least 8 characters");
                    valid = false;
                }
                if(!valid){
                    //submit form

                    Toast.makeText(getApplicationContext(), "Invalid password. Please enter a password with at least 8 characters.", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
//            //error
                }

            }
        });



    }
}