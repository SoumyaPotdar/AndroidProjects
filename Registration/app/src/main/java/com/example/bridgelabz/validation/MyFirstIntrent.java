package com.example.bridgelabz.validation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MyFirstIntrent extends AppCompatActivity {

    TextView textViewi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_intrent);

        textViewi=(TextView) findViewById(R.id.textView3);
        Bundle b = new Bundle();
        b = getIntent().getExtras();
        String result1 = b.getString("name");
        String result2=b.getString("email");
        String result3=b.getString("phno");
        String result4=b.getString("address");

        textViewi.setText("Name\t:"+result1+"\nEmail\t:"+result2+"\nPhone no\t:"+result3+"\n"+"Address\t:"+result4);
    }
}
