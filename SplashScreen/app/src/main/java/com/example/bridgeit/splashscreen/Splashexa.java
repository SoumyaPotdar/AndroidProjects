package com.example.bridgeit.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Splashexa extends AppCompatActivity{
    private static int splash_Timeout=5000;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed( new Runnable()
        {
            public  void run()
            {
                Intent i =new Intent(Splashexa.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },splash_Timeout);
}
}
