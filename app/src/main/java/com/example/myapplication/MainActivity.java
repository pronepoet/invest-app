package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.*;
public class MainActivity extends AppCompatActivity {
Handler handler = new Handler ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(new Runnable() {
            @Override
            public void run () {
Intent intent = new Intent(MainActivity.this, SignUp.class);
startActivity(intent);
finish();
            }
        },3000);
    }
}