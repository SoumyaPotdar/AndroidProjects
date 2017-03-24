package com.example.bridgelabz.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
   // Button button4;


    //  Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // fragment=(Fragment) findViewById(R.id.fragmentmain);
        button1 = (Button) findViewById(R.id.buttonmain1);
        button2 = (Button) findViewById(R.id.buttonmain2);
        button3 = (Button) findViewById(R.id.buttonmain3);
      //  button4 = (Button) findViewById(R.id.buttonf);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragmentone f1 = new Fragmentone();
                getSupportFragmentManager().beginTransaction().replace(R.id.mylayout, f1).commit();

            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Fragmenttwo f2 = new Fragmenttwo();
                getSupportFragmentManager().beginTransaction().replace(R.id.mylayout, f2).commit();

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Fragmentthree f3 = new Fragmentthree();
                getSupportFragmentManager().beginTransaction().replace(R.id.mylayout, f3).commit();

            }
        });



    }
}