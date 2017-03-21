package com.example.bridgeit.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class activityres extends AppCompatActivity
{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_res);
        EditText et=(EditText)findViewById(R.id.edit1);
        String val=et.getText().toString();



    }
    public  void back(View v) {
        Intent i1 = new Intent(this, MainActivity.class);

    }
